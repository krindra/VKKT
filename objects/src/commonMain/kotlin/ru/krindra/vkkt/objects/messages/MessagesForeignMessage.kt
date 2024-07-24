package ru.krindra.vkkt.objects.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.base.BaseGeo

/**
 *
 * @param attachments 
 * @param conversationMessageId Conversation message ID
 * @param date Date when the message was created
 * @param fromId Message author's ID
 * @param fwdMessages 
 * @param geo 
 * @param id Message ID
 * @param peerId Peer ID
 * @param replyMessage 
 * @param text Message text
 * @param updateTime Date when the message has been updated in Unixtime
 * @param wasListened Was the audio message inside already listened by you
 * @param payload Additional data sent along with message for developer convenience
 */
@Serializable
data class MessagesForeignMessage (
    @SerialName("date") val date: Int,
    @SerialName("text") val text: String,
    @SerialName("id") val id: Int? = null,
    @SerialName("from_id") val fromId: Int,
    @SerialName("geo") val geo: BaseGeo? = null,
    @SerialName("peer_id") val peerId: Int? = null,
    @SerialName("payload") val payload: String? = null,
    @SerialName("update_time") val updateTime: Int? = null,
    @SerialName("was_listened") val wasListened: Boolean? = null,
    @SerialName("reply_message") val replyMessage: MessagesForeignMessage? = null,
    @SerialName("conversation_message_id") val conversationMessageId: Int? = null,
    @SerialName("fwd_messages") val fwdMessages: List<MessagesForeignMessage>? = null,
    @SerialName("attachments") val attachments: List<MessagesMessageAttachment>? = null,
)
