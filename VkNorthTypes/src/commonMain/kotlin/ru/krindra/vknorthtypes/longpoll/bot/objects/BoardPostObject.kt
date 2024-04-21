package ru.krindra.vknorthtypes.longpoll.bot.objects

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class BoardPostObject(
    @SerialName("topic_id") val topicId: Int,
    @SerialName("topic_owner_id") val topicOwnerId: Int,
)