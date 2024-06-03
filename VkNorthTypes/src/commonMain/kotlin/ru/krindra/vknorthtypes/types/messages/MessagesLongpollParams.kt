package ru.krindra.vknorthtypes.types.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param server Server URL
 * @param key Key
 * @param ts Timestamp
 * @param pts Persistent timestamp
 */
@Serializable
data class MessagesLongpollParams (
    @SerialName("ts") val ts: Int,
    @SerialName("key") val key: String,
    @SerialName("pts") val pts: Int? = null,
    @SerialName("server") val server: String,
)
