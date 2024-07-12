package ru.krindra.vkkt.objects.callback

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param id 
 * @param ownerId 
 * @param userId 
 * @param videoId 
 */
@Serializable
data class CallbackVideoCommentDelete (
    @SerialName("id") val id: Long,
    @SerialName("user_id") val userId: Long,
    @SerialName("owner_id") val ownerId: Long,
    @SerialName("video_id") val videoId: Long,
)
