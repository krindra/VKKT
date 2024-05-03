package ru.krindra.vknorthtypes.longpoll.bot

import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.JsonSingleton
import ru.krindra.vknorthtypes.longpoll.bot.events.BotLPEvent

@Serializable
data class BotLPEvent(
    val ts: String,
    val updates: List<BotLPEvent>
) {
    companion object {
        fun fromString(string: String): BotLPEvent =
            JsonSingleton.json.decodeFromString(string)
    }
}