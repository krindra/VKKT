package ru.krindra.vkkt.responses.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.groups.GroupsGroupFull
import ru.krindra.vkkt.objects.users.UsersUserFull
import ru.krindra.vkkt.objects.messages.*

/**
 * @param count Total number
 * @param items 
 * @param profiles 
 * @param groups 
 * @param conversations 
 */
@Serializable
data class MessagesGetHistoryExtendedResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<MessagesMessage>,
    @SerialName("groups") val groups: List<GroupsGroupFull>? = null,
    @SerialName("profiles") val profiles: List<UsersUserFull>? = null,
    @SerialName("conversations") val conversations: List<MessagesConversation>? = null,
)

