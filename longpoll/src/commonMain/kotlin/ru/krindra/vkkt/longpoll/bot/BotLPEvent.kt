package ru.krindra.vkkt.longpoll.bot

import kotlinx.serialization.Serializable
import ru.krindra.vkkt.longpoll.bot.updates.BotLPUpdate
import ru.krindra.vkkt.utils.JsonSingleton

@Serializable
data class BotLPEvent(
    val ts: Int,
    val updates: List<BotLPUpdate>
) {
    companion object {
        fun fromString(string: String): BotLPEvent =
            JsonSingleton.json.decodeFromString(string)
    }
}