package ru.krindra.vknorthtypes.longpoll.bot

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.longpoll.bot.objects.*


@Serializable
data class WallReplyNewEvent(
    @SerialName("type") override val type: String,
    @SerialName("event_id") override val eventId: String,
    @SerialName("v") override val v: String,
    @SerialName("group_id") override val groupId: Int,
    @SerialName("object") val `object`: WallReplyObject,
): BaseEvent() {
    companion object { val type = "wall_reply_new"}
}