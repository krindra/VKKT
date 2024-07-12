package ru.krindra.vkkt.longpoll.user

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.utils.JsonSingleton

@Serializable
data class UserLPError(
    val failed: Int,
    val ts: Int? = null,
    @SerialName("min_version") val minVersion: Int? = null,
    @SerialName("max_version") val maxVersion: Int? = null,
): Exception("failed code: $failed") {
    companion object {
        fun fromString(string: String): UserLPError =
            JsonSingleton.json.decodeFromString(string)
    }
}
