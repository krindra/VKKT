package ru.krindra.vknorthtypes.longpoll.bot.objects

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MessageDenyObject(
    @SerialName("user_id") val userId: Int,
)