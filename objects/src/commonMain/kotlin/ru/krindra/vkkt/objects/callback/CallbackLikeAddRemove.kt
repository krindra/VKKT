package ru.krindra.vkkt.objects.callback

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param likerId 
 * @param objectType 
 * @param objectOwnerId 
 * @param objectId 
 * @param postId 
 * @param threadReplyId 
 */
@Serializable
data class CallbackLikeAddRemove (
    @SerialName("post_id") val postId: Int,
    @SerialName("liker_id") val likerId: Int,
    @SerialName("object_id") val objectId: Int,
    @SerialName("object_type") val objectType: String,
    @SerialName("object_owner_id") val objectOwnerId: Int,
    @SerialName("thread_reply_id") val threadReplyId: Int? = null,
)
