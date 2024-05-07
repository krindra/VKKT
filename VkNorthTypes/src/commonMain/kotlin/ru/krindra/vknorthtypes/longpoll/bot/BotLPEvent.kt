package ru.krindra.vknorthtypes.longpoll.bot

import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.JsonSingleton
import ru.krindra.vknorthtypes.longpoll.bot.updates.BotLPUpdate

@Serializable
data class BotLPEvent(
    val ts: String,
    val updates: List<BotLPUpdate>
) {
    companion object {
        fun fromString(string: String): BotLPUpdate =
            JsonSingleton.json.decodeFromString(string)
    }
}