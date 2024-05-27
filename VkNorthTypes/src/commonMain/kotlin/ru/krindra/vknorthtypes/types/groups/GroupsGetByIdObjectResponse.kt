package ru.krindra.vknorthtypes.types.groups

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param groups 
 * @param profiles 
 */
@Serializable
data class GroupsGetByIdObjectResponse (
    @SerialName("groups") val groups: List<GroupsGroupFull>? = null,
    @SerialName("profiles") val profiles: List<GroupsProfileItem>? = null,
)

