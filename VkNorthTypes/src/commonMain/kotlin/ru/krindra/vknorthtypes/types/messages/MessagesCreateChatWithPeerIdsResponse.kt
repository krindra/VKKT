package ru.krindra.vknorthtypes.types.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param chatId Chat ID
 */
@Serializable
data class MessagesCreateChatWithPeerIdsResponse (
    @SerialName("chat_id") val chatId: Long? = null,
)

