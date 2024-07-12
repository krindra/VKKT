package ru.krindra.vkkt.responses.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.groups.GroupsGroupFull
import ru.krindra.vkkt.objects.users.UsersUserFull
import ru.krindra.vkkt.objects.messages.*

/**
 * @param count Total number
 * @param unreadCount Unread dialogs number
 * @param items 
 * @param profiles 
 * @param groups 
 */
@Serializable
data class MessagesGetConversationsResponse (
    @SerialName("count") val count: Int,
    @SerialName("unread_count") val unreadCount: Int? = null,
    @SerialName("groups") val groups: List<GroupsGroupFull>? = null,
    @SerialName("profiles") val profiles: List<UsersUserFull>? = null,
    @SerialName("items") val items: List<MessagesConversationWithMessage>,
)

