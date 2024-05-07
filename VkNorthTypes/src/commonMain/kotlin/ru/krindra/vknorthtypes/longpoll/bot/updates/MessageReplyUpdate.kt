package ru.krindra.vknorthtypes.longpoll.bot.updates

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.longpoll.bot.updates.objects.MessageReplyObject


@Serializable
data class MessageReplyUpdate(
    @SerialName("type") override val type: String,
    @SerialName("event_id") override val eventId: String,
    @SerialName("v") override val v: String,
    @SerialName("group_id") override val groupId: Int,
    @SerialName("object") val `object`: MessageReplyObject,
) : BotLPUpdate() {
    companion object {
        val type = "message_reply"
    }
}