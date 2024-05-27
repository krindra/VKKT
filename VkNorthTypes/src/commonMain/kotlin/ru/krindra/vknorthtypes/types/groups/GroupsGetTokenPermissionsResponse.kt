package ru.krindra.vknorthtypes.types.groups

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param mask 
 * @param permissions 
 */
@Serializable
data class GroupsGetTokenPermissionsResponse (
    @SerialName("mask") val mask: Int,
    @SerialName("permissions") val permissions: List<GroupsTokenPermissionSetting>,
)

