package ru.krindra.vknorthtypes.types.wall

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param success 
 * @param postId Created post ID
 * @param repostsCount Reposts number
 * @param wallRepostCount Reposts to wall number
 * @param mailRepostCount Reposts to mail number
 * @param likesCount Reposts number
 */
@Serializable
data class WallRepostResponse (
    @SerialName("post_id") val postId: Long,
    @SerialName("success") val success: Int,
    @SerialName("likes_count") val likesCount: Int,
    @SerialName("reposts_count") val repostsCount: Int,
    @SerialName("mail_repost_count") val mailRepostCount: Int? = null,
    @SerialName("wall_repost_count") val wallRepostCount: Int? = null,
)

