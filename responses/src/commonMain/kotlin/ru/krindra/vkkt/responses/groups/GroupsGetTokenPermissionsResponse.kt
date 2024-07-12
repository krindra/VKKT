package ru.krindra.vkkt.responses.groups

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.groups.*

/**
 * @param mask 
 * @param permissions 
 */
@Serializable
data class GroupsGetTokenPermissionsResponse (
    @SerialName("mask") val mask: Int,
    @SerialName("permissions") val permissions: List<GroupsTokenPermissionSetting>,
)

