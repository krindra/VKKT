package ru.krindra.vkkt.responses.users

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.groups.GroupsGroupsArray
import ru.krindra.vkkt.objects.users.*

/**
 * @param users 
 * @param groups 
 */
@Serializable
data class UsersGetSubscriptionsResponse (
    @SerialName("users") val users: UsersUsersArray,
    @SerialName("groups") val groups: GroupsGroupsArray,
)

