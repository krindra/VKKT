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
    @SerialName("id") val id: Int,
    @SerialName("post_id") val postId: Int,
    @SerialName("user_id") val userId: Int,
    @SerialName("owner_id") val ownerId: Int,
)
