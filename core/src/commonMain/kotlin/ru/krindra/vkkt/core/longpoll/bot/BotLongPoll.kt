package ru.krindra.vkkt.core.longpoll.bot


import io.ktor.client.request.*
import io.ktor.client.statement.*
import ru.krindra.vkkt.longpoll.bot.*
import ru.krindra.vkkt.core.longpoll.LongPollParameters
import ru.krindra.vkkt.longpoll.bot.updates.BotLPUpdate
import ru.krindra.vkkt.core.VkApi
import io.ktor.client.plugins.HttpRequestTimeoutException
import kotlinx.coroutines.flow.flow
import ru.krindra.vkkt.core.longpoll.AbstractLongPoll

class BotLongPoll(private val vkApi: VkApi): AbstractLongPoll<BotLPUpdate> {
    private val httpClient = vkApi.getHttpClient()
    private var longPollParameters: LongPollParameters? = null

    /**
     * Get bot longpoll updates
     */
    override suspend fun listen() = flow {
        while (true) {
            if (longPollParameters == null)
                longPollParameters = getParameters()
            try {
                for (e in getEvent().updates) emit(e)
            } catch (_: HttpRequestTimeoutException) {}
        }
    }

    private suspend fun getParameters(): LongPollParameters {
        val id = vkApi.groups.getById().groups!![0].id
        with(vkApi.groups.getLongPollServer(id)) {
            return LongPollParameters(server, key, ts.toInt())
        }
    }

    private suspend fun getEvent(): BotLPEvent {
        val rawEvent = httpClient.get(longPollParameters!!.toBotURL()).bodyAsText()
        if (rawEvent.contains("failed")) {
            errorHandle(BotLPError.fromString(rawEvent))
            return getEvent()
        }
        val event = BotLPEvent.fromString((rawEvent))
        longPollParameters!!.ts = event.ts
        return event
    }

    /**
    [Handling](https://dev.vk.com/en/api/bots-long-poll/getting-started#Mistakes)
     */
    private suspend fun errorHandle(botLPError: BotLPError) {
        with(botLPError) {
            if (failed == 1) longPollParameters!!.ts = ts!!
            else longPollParameters = getParameters()
        }
    }
}
