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
    @SerialName("post_id") val postId: Long,
    @SerialName("liker_id") val likerId: Long,
    @SerialName("object_id") val objectId: Long,
    @SerialName("object_type") val objectType: String,
    @SerialName("object_owner_id") val objectOwnerId: Long,
    @SerialName("thread_reply_id") val threadReplyId: Long? = null,
)
