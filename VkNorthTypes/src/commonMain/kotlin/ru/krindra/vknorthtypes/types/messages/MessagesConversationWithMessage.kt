package ru.krindra.vknorthtypes.types.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param conversation 
 * @param lastMessage 
 */
@Serializable
data class MessagesConversationWithMessage (
    @SerialName("last_message") val lastMessage: MessagesMessage? = null,
    @SerialName("conversation") val conversation: MessagesConversation,
)
