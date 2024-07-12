package ru.krindra.vkkt.longpoll.bot.updates.objects

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class UserBlockObject(
    @SerialName("admin_id") val adminId: Int,
    @SerialName("user_id") val userId: Int,
    @SerialName("unblock_date") val unblockDate: Int,
    @SerialName("reason") val reason: Int,
    @SerialName("comment") val comment: String,
)