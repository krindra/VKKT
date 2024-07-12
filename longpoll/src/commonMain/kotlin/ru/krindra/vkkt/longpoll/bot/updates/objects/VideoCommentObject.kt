package ru.krindra.vkkt.longpoll.bot.updates.objects

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class VideoCommentObject(
    @SerialName("video_id") val videoId: Int,
    @SerialName("video_owner_id") val videoOwnerId: Int,
)