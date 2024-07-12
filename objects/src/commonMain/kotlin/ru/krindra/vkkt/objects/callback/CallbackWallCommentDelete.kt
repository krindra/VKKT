package ru.krindra.vkkt.objects.callback

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param ownerId 
 * @param id 
 * @param userId 
 * @param postId 
 */
@Serializable
data class CallbackWallCommentDelete (
    @SerialName("id") val id: Long,
    @SerialName("post_id") val postId: Long,
    @SerialName("user_id") val userId: Long,
    @SerialName("owner_id") val ownerId: Long,
)
