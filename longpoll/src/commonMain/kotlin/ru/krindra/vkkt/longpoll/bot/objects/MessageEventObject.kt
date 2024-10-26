package ru.krindra.vkkt.longpoll.bot.objects

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MessageEventObject(
    @SerialName("user_id") val userId: Int,
    @SerialName("peer_id") val peerId: Int,
    @SerialName("event_id") val eventId: String,
    @SerialName("payload") val payload: String,
    @SerialName("conversation_message_id") val conversationMessageId: Int,
)