package ru.krindra.vknorthtypes.longpoll.bot.events.objects

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class LikeObject(
    @SerialName("liker_id") val likerId: Int,
    @SerialName("object_type") val objectType: String,
    @SerialName("object_owner_id") val objectOwnerId: Int,
    @SerialName("object_id") val objectId: Int,
    @SerialName("thread_reply_id") val threadReplyId: Int?,
    @SerialName("post_id") val postId: Int,
)