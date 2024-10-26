package ru.krindra.vkkt.longpoll.bot.objects

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GroupOfficersEditObject(
    @SerialName("admin_id") val adminId: Int,
    @SerialName("user_id") val userId: Int,
    @SerialName("level_old") val levelOld: Int,
    @SerialName("level_new") val levelNew: Int,
)