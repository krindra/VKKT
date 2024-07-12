package ru.krindra.vkkt.longpoll.bot.updates.objects

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class WallReplyDeleteObject(
    @SerialName("owner_id") val ownerId: Int,
    @SerialName("id") val id: Int,
    @SerialName("deleter_id") val deleterId: Int,
    @SerialName("post_id") val postId: Int,
)