package ru.krindra.vkkt.longpoll.bot.updates.objects

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MessageAllowObject(
    @SerialName("user_id") val userId: Int,
    @SerialName("key") val key: String,
)