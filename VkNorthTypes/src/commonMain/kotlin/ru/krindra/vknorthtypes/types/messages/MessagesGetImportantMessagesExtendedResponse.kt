package ru.krindra.vknorthtypes.types.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.groups.GroupsGroupFull

import ru.krindra.vknorthtypes.types.users.UsersUserFull


/**
 * @param messages 
 * @param profiles 
 * @param groups 
 * @param conversations 
 */
@Serializable
data class MessagesGetImportantMessagesExtendedResponse (
    @SerialName("messages") val messages: MessagesMessagesArray,
    @SerialName("profiles") val profiles: List<UsersUserFull>? = null,
    @SerialName("groups") val groups: List<GroupsGroupFull>? = null,
    @SerialName("conversations") val conversations: List<MessagesConversation>? = null,
)

