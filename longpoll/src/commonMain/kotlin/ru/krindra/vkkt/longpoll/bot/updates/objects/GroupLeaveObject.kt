package ru.krindra.vkkt.longpoll.bot.updates.objects

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GroupLeaveObject(
    @SerialName("user_id") val userId: Int,
    @SerialName("self") val self: Int,
)