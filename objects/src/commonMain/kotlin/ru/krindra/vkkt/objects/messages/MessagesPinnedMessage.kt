package ru.krindra.vkkt.objects.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.base.BaseGeo

/**
 *
 * @param attachments 
 * @param conversationMessageId Unique auto-incremented number for all messages with this peer
 * @param id Message ID
 * @param date Date when the message has been sent in Unixtime
 * @param fromId Message author's ID
 * @param fwdMessages Forwarded messages
 * @param geo 
 * @param peerId Peer ID
 * @param replyMessage 
 * @param text Message text
 * @param keyboard 
 */
@Serializable
data class MessagesPinnedMessage (
    @SerialName("id") val id: Int,
    @SerialName("date") val date: Int,
    @SerialName("text") val text: String,
    @SerialName("from_id") val fromId: Int,
    @SerialName("peer_id") val peerId: Int,
    @SerialName("geo") val geo: BaseGeo? = null,
    @SerialName("keyboard") val keyboard: MessagesKeyboard? = null,
    @SerialName("reply_message") val replyMessage: MessagesForeignMessage? = null,
    @SerialName("conversation_message_id") val conversationMessageId: Int? = null,
    @SerialName("fwd_messages") val fwdMessages: List<MessagesForeignMessage>? = null,
    @SerialName("attachments") val attachments: List<MessagesMessageAttachment>? = null,
)
