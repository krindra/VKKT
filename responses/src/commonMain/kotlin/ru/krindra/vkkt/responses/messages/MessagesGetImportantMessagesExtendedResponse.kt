package ru.krindra.vkkt.responses.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.groups.GroupsGroupFull
import ru.krindra.vkkt.objects.users.UsersUserFull
import ru.krindra.vkkt.objects.messages.*

/**
 * @param messages 
 * @param profiles 
 * @param groups 
 * @param conversations 
 */
@Serializable
data class MessagesGetImportantMessagesExtendedResponse (
    @SerialName("messages") val messages: MessagesMessagesArray,
    @SerialName("groups") val groups: List<GroupsGroupFull>? = null,
    @SerialName("profiles") val profiles: List<UsersUserFull>? = null,
    @SerialName("conversations") val conversations: List<MessagesConversation>? = null,
)

