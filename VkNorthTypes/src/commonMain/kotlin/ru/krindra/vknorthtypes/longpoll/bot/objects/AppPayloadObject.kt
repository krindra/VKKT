package ru.krindra.vknorthtypes.longpoll.bot.objects

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AppPayloadObject(
    @SerialName("user_id") val userId: Int,
    @SerialName("app_id") val appId: Int,
    @SerialName("payload") val payload: String,
    @SerialName("group_id") val groupId: Int,
)