package ru.krindra.vkkt.responses.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.messages.*

/**
 * @param messageId Service message ID
 * @param chat 
 */
@Serializable
data class MessagesSetChatPhotoResponse (
    @SerialName("chat") val chat: MessagesChat? = null,
    @SerialName("message_id") val messageId: Long? = null,
)

