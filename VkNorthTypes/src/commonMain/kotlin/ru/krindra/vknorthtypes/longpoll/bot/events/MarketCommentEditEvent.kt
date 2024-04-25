package ru.krindra.vknorthtypes.longpoll.bot.events

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.longpoll.bot.objects.*


@Serializable
data class MarketCommentEditEvent(
    @SerialName("type") override val type: String,
    @SerialName("event_id") override val eventId: String,
    @SerialName("v") override val v: String,
    @SerialName("group_id") override val groupId: Int,
    @SerialName("object") val `object`: MarketCommentObject,
): ru.krindra.vknorthtypes.longpoll.bot.events.BaseEvent() {
    companion object { val type = "market_comment_edit"}
}