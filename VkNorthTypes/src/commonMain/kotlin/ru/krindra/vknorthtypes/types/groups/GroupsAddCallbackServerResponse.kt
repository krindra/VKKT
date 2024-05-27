package ru.krindra.vknorthtypes.types.groups

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param serverId 
 */
@Serializable
data class GroupsAddCallbackServerResponse (
    @SerialName("server_id") val serverId: Long,
)

