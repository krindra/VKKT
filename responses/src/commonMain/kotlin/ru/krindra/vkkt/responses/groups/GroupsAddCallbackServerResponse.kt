package ru.krindra.vkkt.responses.groups

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.groups.*

/**
 * @param serverId 
 */
@Serializable
data class GroupsAddCallbackServerResponse (
    @SerialName("server_id") val serverId: Int,
)

