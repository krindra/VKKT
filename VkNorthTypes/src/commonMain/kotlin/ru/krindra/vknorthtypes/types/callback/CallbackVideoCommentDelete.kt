package ru.krindra.vknorthtypes.types.callback

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
    @SerialName("owner_id") val ownerId: Long,
    @SerialName("user_id") val userId: Long,
    @SerialName("video_id") val videoId: Long,
    @SerialName("id") val id: Long,
)
