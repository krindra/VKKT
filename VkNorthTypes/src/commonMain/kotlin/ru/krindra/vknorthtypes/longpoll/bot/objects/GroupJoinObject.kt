package ru.krindra.vknorthtypes.longpoll.bot.objects

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GroupJoinObject(
    @SerialName("user_id") val userId: Int,
    @SerialName("join_type") val joinType: String,
)