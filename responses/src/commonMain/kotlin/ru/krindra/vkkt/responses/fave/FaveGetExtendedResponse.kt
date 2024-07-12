package ru.krindra.vkkt.responses.fave

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.groups.GroupsGroup
import ru.krindra.vkkt.objects.users.UsersUserFull
import ru.krindra.vkkt.objects.fave.*

/**
 * @param count Total number
 * @param items 
 * @param profiles 
 * @param groups 
 */
@Serializable
data class FaveGetExtendedResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<FaveBookmark>,
    @SerialName("groups") val groups: List<GroupsGroup>? = null,
    @SerialName("profiles") val profiles: List<UsersUserFull>? = null,
)

