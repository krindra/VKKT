package ru.krindra.vkkt.objects.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.users.UsersUserFull
import ru.krindra.vkkt.objects.groups.GroupsGroupFull

/**
 *
 * @param profiles 
 * @param groups 
 * @param count Total number
 * @param items 
 */
@Serializable
data class MessagesGetConversationByIdExtended (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<MessagesConversation>,
    @SerialName("groups") val groups: List<GroupsGroupFull>? = null,
    @SerialName("profiles") val profiles: List<UsersUserFull>? = null,
)
