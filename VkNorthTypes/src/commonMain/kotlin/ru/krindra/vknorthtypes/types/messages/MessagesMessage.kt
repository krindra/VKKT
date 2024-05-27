package ru.krindra.vknorthtypes.types.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.base.BaseGeo
import ru.krindra.vknorthtypes.types.base.BaseBoolInt

/**
 *
 * @param action 
 * @param adminAuthorId Only for messages from community. Contains user ID of community admin, who sent this message.
 * @param attachments 
 * @param conversationMessageId Unique auto-incremented number for all messages with this peer
 * @param date Date when the message has been sent in Unixtime
 * @param deleted Is it an deleted message
 * @param fromId Message author's ID
 * @param fwdMessages 
 * @param geo 
 * @param id Message ID
 * @param important Is it an important message
 * @param isHidden 
 * @param isCropped this message is cropped for bot
 * @param keyboard 
 * @param membersCount Members number
 * @param out Information whether the message is outcoming
 * @param payload 
 * @param peerId Peer ID
 * @param randomId ID used for sending messages. It returned only for outgoing messages
 * @param ref 
 * @param refSource 
 * @param replyMessage 
 * @param reactionId Reaction id set on message
 * @param reactions Actual reactions counters on this message
 * @param lastReactionId Last reaction id set on this message
 * @param text Message text
 * @param updateTime Date when the message has been updated in Unixtime
 * @param wasListened Was the audio message inside already listened by you
 * @param pinnedAt Date when the message has been pinned in Unixtime
 * @param isSilent Is silent message, push without sound
 */
@Serializable
data class MessagesMessage (
    @SerialName("pinned_at") val pinnedAt: Int? = null,
    @SerialName("was_listened") val wasListened: Boolean? = null,
    @SerialName("action") val action: MessagesActionOneOf? = null,
    @SerialName("important") val important: Boolean? = null,
    @SerialName("attachments") val attachments: List<MessagesMessageAttachment>? = null,
    @SerialName("ref") val ref: String? = null,
    @SerialName("is_silent") val isSilent: Boolean? = null,
    @SerialName("admin_author_id") val adminAuthorId: Long? = null,
    @SerialName("members_count") val membersCount: Int? = null,
    @SerialName("date") val date: Int,
    @SerialName("from_id") val fromId: Long,
    @SerialName("payload") val payload: String? = null,
    @SerialName("conversation_message_id") val conversationMessageId: Long? = null,
    @SerialName("last_reaction_id") val lastReactionId: Long? = null,
    @SerialName("geo") val geo: BaseGeo? = null,
    @SerialName("id") val id: Long,
    @SerialName("is_hidden") val isHidden: Boolean? = null,
    @SerialName("reply_message") val replyMessage: MessagesForeignMessage? = null,
    @SerialName("random_id") val randomId: Long? = null,
    @SerialName("text") val text: String,
    @SerialName("reaction_id") val reactionId: Long? = null,
    @SerialName("keyboard") val keyboard: MessagesKeyboard? = null,
    @SerialName("peer_id") val peerId: Long,
    @SerialName("out") val out: BaseBoolInt,
    @SerialName("fwd_messages") val fwdMessages: MessagesFwdMessages? = null,
    @SerialName("is_cropped") val isCropped: Boolean? = null,
    @SerialName("deleted") val deleted: BaseBoolInt? = null,
    @SerialName("ref_source") val refSource: String? = null,
    @SerialName("reactions") val reactions: List<MessagesReactionCounterResponseItem>? = null,
    @SerialName("update_time") val updateTime: Int? = null,
)
