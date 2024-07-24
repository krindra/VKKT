package ru.krindra.vkkt.longpoll.bot.updates.objects

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.base.BaseBoolInt
import ru.krindra.vkkt.objects.base.BaseGeo
import ru.krindra.vkkt.objects.messages.*

@Serializable
data class MessageEditObject(
    @SerialName("update_time") val updateTime: Int? = null,
    @SerialName("admin_author_id") val adminAuthorId: Int? = null,
    @SerialName("was_listened") val wasListened: Boolean? = null,
    @SerialName("geo") val geo: BaseGeo? = null,
    @SerialName("deleted") val deleted: BaseBoolInt? = null,
    @SerialName("is_silent") val isSilent: Boolean? = null,
    @SerialName("ref") val ref: String? = null,
    @SerialName("action") val action: MessagesActionOneOf? = null,
    @SerialName("reply_message") val replyMessage: MessagesForeignMessage? = null,
    @SerialName("last_reaction_id") val lastReactionId: Int? = null,
    @SerialName("ref_source") val refSource: String? = null,
    @SerialName("fwd_messages") val fwdMessages: MessagesFwdMessages? = null,
    @SerialName("keyboard") val keyboard: MessagesKeyboard? = null,
    @SerialName("conversation_message_id") val conversationMessageId: Int? = null,
    @SerialName("date") val date: Int,
    @SerialName("out") val out: BaseBoolInt,
    @SerialName("members_count") val membersCount: Int? = null,
    @SerialName("attachments") val attachments: List<MessagesMessageAttachment>? = null,
    @SerialName("text") val text: String,
    @SerialName("payload") val payload: String? = null,
    @SerialName("from_id") val fromId: Int,
    @SerialName("important") val important: Boolean? = null,
    @SerialName("reactions") val reactions: List<MessagesReactionCounterResponseItem>? = null,
    @SerialName("random_id") val randomId: Int? = null,
    @SerialName("reaction_id") val reactionId: Int? = null,
    @SerialName("is_cropped") val isCropped: Boolean? = null,
    @SerialName("id") val id: Int,
    @SerialName("is_hidden") val isHidden: Boolean? = null,
    @SerialName("pinned_at") val pinnedAt: Int? = null,
    @SerialName("peer_id") val peerId: Int,
)