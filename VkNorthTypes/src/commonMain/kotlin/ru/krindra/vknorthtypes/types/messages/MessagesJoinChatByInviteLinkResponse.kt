package ru.krindra.vknorthtypes.types.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param chatId 
 */
@Serializable
data class MessagesJoinChatByInviteLinkResponse (
    @SerialName("chat_id") val chatId: Long? = null,
)

