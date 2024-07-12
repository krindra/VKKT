package ru.krindra.vkkt.objects.groups

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param id User ID
 * @param isCallOperator Allow the manager to accept community calls.
 * @param permissions 
 * @param role 
 */
@Serializable
data class GroupsMemberRole (
    @SerialName("id") val id: Long,
    @SerialName("role") val role: GroupsMemberRoleStatus? = null,
    @SerialName("is_call_operator") val isCallOperator: Boolean? = null,
    @SerialName("permissions") val permissions: List<GroupsMemberRolePermission>? = null,
)
