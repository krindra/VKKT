package ru.krindra.vkkt.objects.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param ownerId Messages owner_id
 * @param peerId Messages peer_id
 * @param conversationMessageIds 
 * @param messageIds 
 * @param isReply If you need to reply to a message
 */
@Serializable
data class MessagesForward (
    @SerialName("peer_id") val peerId: Int? = null,
    @SerialName("owner_id") val ownerId: Int? = null,
    @SerialName("is_reply") val isReply: Boolean? = null,
    @SerialName("message_ids") val messageIds: List<Int>? = null,
    @SerialName("conversation_message_ids") val conversationMessageIds: List<Int>? = null,
)
