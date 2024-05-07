package ru.krindra.vknorthtypes.longpoll.bot.updates.objects

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.base.BaseBoolInt
import ru.krindra.vknorthtypes.types.base.BaseGeo
import ru.krindra.vknorthtypes.types.messages.*

@Serializable
data class MessageEditObject(
    @SerialName("update_time") val updateTime: Int? = null,
    @SerialName("admin_author_id") val adminAuthorId: Long? = null,
    @SerialName("was_listened") val wasListened: Boolean? = null,
    @SerialName("geo") val geo: BaseGeo? = null,
    @SerialName("deleted") val deleted: BaseBoolInt? = null,
    @SerialName("is_silent") val isSilent: Boolean? = null,
    @SerialName("ref") val ref: String? = null,
    @SerialName("action") val action: MessagesActionOneOf? = null,
    @SerialName("reply_message") val replyMessage: MessagesForeignMessage? = null,
    @SerialName("last_reaction_id") val lastReactionId: Long? = null,
    @SerialName("ref_source") val refSource: String? = null,
    @SerialName("fwd_messages") val fwdMessages: MessagesFwdMessages? = null,
    @SerialName("keyboard") val keyboard: MessagesKeyboard? = null,
    @SerialName("conversation_message_id") val conversationMessageId: Long? = null,
    @SerialName("date") val date: Int,
    @SerialName("out") val out: BaseBoolInt,
    @SerialName("members_count") val membersCount: Int? = null,
    @SerialName("attachments") val attachments: List<MessagesMessageAttachment>? = null,
    @SerialName("text") val text: String,
    @SerialName("payload") val payload: String? = null,
    @SerialName("from_id") val fromId: Long,
    @SerialName("important") val important: Boolean? = null,
    @SerialName("reactions") val reactions: List<MessagesReactionCounterResponseItem>? = null,
    @SerialName("random_id") val randomId: Long? = null,
    @SerialName("reaction_id") val reactionId: Long? = null,
    @SerialName("is_cropped") val isCropped: Boolean? = null,
    @SerialName("id") val id: Long,
    @SerialName("is_hidden") val isHidden: Boolean? = null,
    @SerialName("pinned_at") val pinnedAt: Int? = null,
    @SerialName("peer_id") val peerId: Long,
)