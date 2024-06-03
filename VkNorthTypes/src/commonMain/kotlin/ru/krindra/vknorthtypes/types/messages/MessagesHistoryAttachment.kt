package ru.krindra.vknorthtypes.types.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param attachment 
 * @param date Message sending time
 * @param messageId Message ID
 * @param messageExpireTtl Message Exipire ttl
 * @param cmid Conversation Message ID
 * @param fromId Message author's ID
 * @param forwardLevel Forward level (optional)
 * @param wasListened 
 * @param position Attachment position in the Message
 */
@Serializable
data class MessagesHistoryAttachment (
    @SerialName("date") val date: Int,
    @SerialName("from_id") val fromId: Long,
    @SerialName("cmid") val cmid: Long? = null,
    @SerialName("message_id") val messageId: Long,
    @SerialName("position") val position: Int? = null,
    @SerialName("forward_level") val forwardLevel: Int? = null,
    @SerialName("was_listened") val wasListened: Boolean? = null,
    @SerialName("message_expire_ttl") val messageExpireTtl: Int? = null,
    @SerialName("attachment") val attachment: MessagesHistoryMessageAttachment,
)
