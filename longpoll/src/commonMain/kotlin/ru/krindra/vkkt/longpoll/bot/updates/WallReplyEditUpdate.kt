package ru.krindra.vkkt.longpoll.bot.updates

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.longpoll.bot.updates.objects.WallReplyObject


@Serializable
data class WallReplyEditUpdate(
    @SerialName("type") override val type: String,
    @SerialName("event_id") override val eventId: String,
    @SerialName("v") override val v: String,
    @SerialName("group_id") override val groupId: Int,
    @SerialName("object") val `object`: WallReplyObject,
) : BotLPUpdate() {
    companion object {
        val type = "wall_reply_edit"
    }
}