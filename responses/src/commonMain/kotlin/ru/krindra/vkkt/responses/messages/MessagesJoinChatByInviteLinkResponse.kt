package ru.krindra.vkkt.responses.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.messages.*

/**
 * @param chatId 
 */
@Serializable
data class MessagesJoinChatByInviteLinkResponse (
    @SerialName("chat_id") val chatId: Int? = null,
)

