package ru.krindra.vkkt.core.longpoll.user


import io.ktor.client.network.sockets.*
import io.ktor.client.plugins.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import kotlinx.coroutines.flow.flow
import ru.krindra.vkkt.longpoll.user.*
import ru.krindra.vkkt.core.VkApi
import ru.krindra.vkkt.core.longpoll.AbstractLongPoll
import ru.krindra.vkkt.core.longpoll.LongPollParameters
import ru.krindra.vkkt.longpoll.user.UserLPUpdate

class UserLongPoll(private val vkApi: VkApi, ): AbstractLongPoll<UserLPUpdate> {
    private val httpClient = vkApi.getHttpClient()
    private var longPollParameters: LongPollParameters? = null

    /*
     * Get user longpoll updates
     */
    override suspend fun listen() = flow {
        var timeout = 0
        fun timeoutCheck(exception: Throwable) = if (timeout > 5) throw exception else timeout++
        while (true) {
            if (longPollParameters == null)
                longPollParameters = getParameters()
            try {
                for (e in getEvent().updates) emit(e)
                timeout = 0
            } catch (exception: HttpRequestTimeoutException) {
                timeoutCheck(exception)
            } catch (exception: SocketTimeoutException) {
                timeoutCheck(exception)
            }
        }
    }

    private suspend fun getEvent(): UserLPEvent {
        val rawEvent = httpClient.get(longPollParameters!!.toUserURL()).bodyAsText()
        if (rawEvent.contains("fail")) {
            val error = UserLPError.fromString(rawEvent)
            errorHandle(error)
        }
        println(rawEvent)
        val event = UserLPEvent.fromEvent(rawEvent)
        longPollParameters!!.ts = event.ts
        return event
    }

    private suspend fun getParameters(): LongPollParameters {
        val resp = vkApi.messages.getLongPollServer(lpVersion = 3)
        return LongPollParameters(resp.server, resp.key, resp.ts)
    }

    private suspend fun errorHandle(error: UserLPError) {
        when (error.failed) {
            1 -> longPollParameters!!.ts = error.ts!!
            2,3 -> longPollParameters = getParameters()
            else -> throw error
        }
    }
}
