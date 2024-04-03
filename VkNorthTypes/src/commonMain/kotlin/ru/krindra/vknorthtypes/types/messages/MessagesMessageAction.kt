package ru.krindra.vknorthtypes.types.messages

// **********
// THIS FILE IS AUTOGENERATED!!! DO NOT EDIT IT!!!
// **********
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
    @SerialName("message") val message: String? = null,
    @SerialName("type") val type: MessagesMessageActionStatus,
    @SerialName("member_id") val memberId: Long? = null,
    @SerialName("email") val email: String? = null,
    @SerialName("text") val text: String? = null,
    @SerialName("photo") val photo: MessagesMessageActionPhoto? = null,
    @SerialName("conversation_message_id") val conversationMessageId: Long? = null,
)