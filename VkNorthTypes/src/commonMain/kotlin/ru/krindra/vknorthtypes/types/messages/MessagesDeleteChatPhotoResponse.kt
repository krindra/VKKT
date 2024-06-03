package ru.krindra.vknorthtypes.types.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param messageId Service message ID
 * @param chat 
 */
@Serializable
data class MessagesDeleteChatPhotoResponse (
    @SerialName("chat") val chat: MessagesChat? = null,
    @SerialName("message_id") val messageId: Long? = null,
)

