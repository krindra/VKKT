package ru.krindra.vknorthtypes.types.groups

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.users.UsersUserMin

/**
 * @param count Total communities number
 * @param items 
 * @param profiles 
 * @param groups 
 */
@Serializable
data class GroupsGetInvitesExtendedResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<GroupsGroupFull>,
    @SerialName("groups") val groups: List<GroupsGroupFull>,
    @SerialName("profiles") val profiles: List<UsersUserMin>,
)

