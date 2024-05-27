package ru.krindra.vknorthtypes.types.wall

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param postId Created post ID
 */
@Serializable
data class WallPostResponse (
    @SerialName("post_id") val postId: Long,
)

