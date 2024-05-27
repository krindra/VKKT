package ru.krindra.vknorthtypes.types.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.groups.GroupsGroupFull

import ru.krindra.vknorthtypes.types.users.UsersUserFull


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
    @SerialName("items") val items: List<MessagesConversationWithMessage>,
    @SerialName("profiles") val profiles: List<UsersUserFull>? = null,
    @SerialName("groups") val groups: List<GroupsGroupFull>? = null,
)

