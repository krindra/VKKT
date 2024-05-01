package ru.krindra.vknorthtypes.longpoll.bot

import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.JsonSingleton

@Serializable
class BotLPError(
    val failed: Int,
    val ts: Int? = null
): Exception("failed code: $failed") {
    companion object {
        fun fromString(string: String): BotLPError =
            JsonSingleton.json.decodeFromString(string)
    }
}