package ru.krindra.vkkt.responses.groups

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.users.UsersUserMin
import ru.krindra.vkkt.objects.groups.*

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

