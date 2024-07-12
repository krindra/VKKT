package ru.krindra.vkkt.responses.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.users.UsersUser
import ru.krindra.vkkt.objects.groups.GroupsGroupFull
import ru.krindra.vkkt.objects.messages.*

/**
 * @param messages 
 * @param profiles 
 * @param groups 
 * @param conversations 
 */
@Serializable
data class MessagesGetImportantMessagesResponse (
    @SerialName("messages") val messages: MessagesMessagesArray,
    @SerialName("profiles") val profiles: List<UsersUser>? = null,
    @SerialName("groups") val groups: List<GroupsGroupFull>? = null,
    @SerialName("conversations") val conversations: List<MessagesConversation>? = null,
)

