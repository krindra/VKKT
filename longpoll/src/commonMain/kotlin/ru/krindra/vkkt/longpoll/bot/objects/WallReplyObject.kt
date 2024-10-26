package ru.krindra.vkkt.longpoll.bot.objects

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class WallReplyObject(
    @SerialName("post_id") val postId: Int,
    @SerialName("post_owner_id") val postOwnerId: Int,
)