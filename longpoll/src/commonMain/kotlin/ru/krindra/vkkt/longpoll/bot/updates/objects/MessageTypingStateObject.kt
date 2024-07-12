package ru.krindra.vkkt.longpoll.bot.updates.objects

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MessageTypingStateObject(
    @SerialName("state") val state: String,
    @SerialName("from_id") val fromId: Int,
    @SerialName("to_id") val toId: Int,
)