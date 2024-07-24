package ru.krindra.vkkt.responses.apps

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.apps.*

/**
 * @param groupId 
 */
@Serializable
data class AppsCreatedGroupResponse (
    @SerialName("group_id") val groupId: Int,
)

