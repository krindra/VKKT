package ru.krindra.vknorthtypes.types.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param peer 
 * @param sortId 
 * @param lastMessageId ID of the last message in conversation
 * @param lastConversationMessageId Conversation message ID of the last message in conversation
 * @param inRead Last message user have read
 * @param outRead Last outcoming message have been read by the opponent
 * @param unreadCount Unread messages number
 * @param isMarkedUnread Is this conversation uread
 * @param outReadBy 
 * @param important 
 * @param unanswered 
 * @param specialServiceType 
 * @param messageRequestData 
 * @param mentions Ids of messages with mentions
 * @param currentKeyboard 
 * @param pushSettings 
 * @param canWrite 
 * @param chatSettings 
 */
@Serializable
data class MessagesConversation (
    @SerialName("unanswered") val unanswered: Boolean? = null,
    @SerialName("in_read") val inRead: Int,
    @SerialName("special_service_type") val specialServiceType: String? = null,
    @SerialName("mentions") val mentions: List<Int>? = null,
    @SerialName("current_keyboard") val currentKeyboard: MessagesKeyboard? = null,
    @SerialName("push_settings") val pushSettings: MessagesPushSettings? = null,
    @SerialName("out_read") val outRead: Int,
    @SerialName("chat_settings") val chatSettings: MessagesChatSettings? = null,
    @SerialName("is_marked_unread") val isMarkedUnread: Boolean? = null,
    @SerialName("can_write") val canWrite: MessagesConversationCanWrite? = null,
    @SerialName("last_message_id") val lastMessageId: Long,
    @SerialName("out_read_by") val outReadBy: MessagesOutReadBy? = null,
    @SerialName("message_request_data") val messageRequestData: MessagesMessageRequestData? = null,
    @SerialName("unread_count") val unreadCount: Int? = null,
    @SerialName("peer") val peer: MessagesConversationPeer,
    @SerialName("last_conversation_message_id") val lastConversationMessageId: Long? = null,
    @SerialName("sort_id") val sortId: MessagesConversationSortId? = null,
    @SerialName("important") val important: Boolean? = null,
)
