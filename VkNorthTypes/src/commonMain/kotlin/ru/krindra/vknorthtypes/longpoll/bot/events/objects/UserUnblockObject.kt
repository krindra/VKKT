package ru.krindra.vknorthtypes.longpoll.bot.events.objects

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class UserUnblockObject(
    @SerialName("admin_id") val adminId: Int,
    @SerialName("user_id") val userId: Int,
    @SerialName("by_end_date") val byEndDate: Int,
)