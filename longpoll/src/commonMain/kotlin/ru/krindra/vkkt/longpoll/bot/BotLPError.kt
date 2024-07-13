package ru.krindra.vkkt.longpoll.bot

import kotlinx.serialization.Serializable
import ru.krindra.vkkt.utils.JsonSingleton

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