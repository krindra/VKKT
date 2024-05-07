package ru.krindra.vknorthtypes.longpoll.bot.updates.objects

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class VideoCommentDeleteObject(
    @SerialName("owner_id") val ownerId: Int,
    @SerialName("id") val id: Int,
    @SerialName("user_id") val userId: Int,
    @SerialName("deleter_id") val deleterId: Int,
    @SerialName("video_id") val videoId: Int,
)