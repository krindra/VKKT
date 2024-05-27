package ru.krindra.vknorthtypes.types.groups

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param key Long Poll key
 * @param server Long Poll server address
 * @param ts Number of the last event
 */
@Serializable
data class GroupsLongPollServer (
    @SerialName("server") val server: String,
    @SerialName("ts") val ts: String,
    @SerialName("key") val key: String,
)
