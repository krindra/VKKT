package ru.krindra.vkkt.objects.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param conversation 
 * @param lastMessage 
 */
@Serializable
data class MessagesConversationWithMessage (
    @SerialName("conversation") val conversation: MessagesConversation,
    @SerialName("last_message") val lastMessage: MessagesMessage? = null,
)
