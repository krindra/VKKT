package ru.krindra.vknorthtypes.longpoll.bot.events.objects

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class DonutSubscriptionExpiredObject(
    @SerialName("user_id") val userId: Int,
)