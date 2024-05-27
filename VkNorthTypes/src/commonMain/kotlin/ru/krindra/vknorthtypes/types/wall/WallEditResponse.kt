package ru.krindra.vknorthtypes.types.wall

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param postId Edited post ID
 */
@Serializable
data class WallEditResponse (
    @SerialName("post_id") val postId: Long,
)

