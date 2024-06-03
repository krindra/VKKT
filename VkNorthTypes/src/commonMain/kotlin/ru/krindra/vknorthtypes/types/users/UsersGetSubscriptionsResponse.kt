package ru.krindra.vknorthtypes.types.users

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.groups.GroupsGroupsArray

/**
 * @param users 
 * @param groups 
 */
@Serializable
data class UsersGetSubscriptionsResponse (
    @SerialName("users") val users: UsersUsersArray,
    @SerialName("groups") val groups: GroupsGroupsArray,
)

