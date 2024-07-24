package ru.krindra.vkkt.responses.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.messages.*

/**
 * @param chatId Chat ID
 */
@Serializable
data class MessagesCreateChatWithPeerIdsResponse (
    @SerialName("chat_id") val chatId: Int? = null,
)

