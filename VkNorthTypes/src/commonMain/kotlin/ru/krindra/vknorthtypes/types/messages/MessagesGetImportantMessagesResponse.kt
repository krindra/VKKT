package ru.krindra.vknorthtypes.types.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.users.UsersUser
import ru.krindra.vknorthtypes.types.groups.GroupsGroupFull

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

