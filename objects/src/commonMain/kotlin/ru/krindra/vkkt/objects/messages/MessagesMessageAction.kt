package ru.krindra.vkkt.objects.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param conversationMessageId Message ID
 * @param email Email address for chat_invite_user or chat_kick_user actions
 * @param memberId User or email peer ID
 * @param message Message body of related message
 * @param photo 
 * @param text New chat title for chat_create and chat_title_update actions
 * @param type 
 */
@Serializable
data class MessagesMessageAction (
    @SerialName("text") val text: String? = null,
    @SerialName("email") val email: String? = null,
    @SerialName("message") val message: String? = null,
    @SerialName("member_id") val memberId: Long? = null,
    @SerialName("type") val type: MessagesMessageActionStatus,
    @SerialName("photo") val photo: MessagesMessageActionPhoto? = null,
    @SerialName("conversation_message_id") val conversationMessageId: Long? = null,
)
