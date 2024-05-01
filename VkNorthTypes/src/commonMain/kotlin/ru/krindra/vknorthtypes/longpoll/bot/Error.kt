package ru.krindra.vknorthtypes.longpoll.bot

import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.JsonSingleton

@Serializable
data class Error(
    val failed: String,
    val ts: Int? = null
) {
    companion object {
        fun fromString(string: String): Error =
            JsonSingleton.json.decodeFromString(string)
    }
}