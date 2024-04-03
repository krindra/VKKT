package ru.krindra.vknorthtypes.types.wall

// **********
// THIS FILE IS AUTOGENERATED!!! DO NOT EDIT IT!!!
// **********
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class WallRepostResponse (
    val response: WallRepostRawResponse
) {
    /**
     *
     * @param success 
     * @param postId Created post ID
     * @param repostsCount Reposts number
     * @param wallRepostCount Reposts to wall number
     * @param mailRepostCount Reposts to mail number
     * @param likesCount Reposts number
     */
    @Serializable
    data class WallRepostRawResponse (
        @SerialName("success") val success: Int,
        @SerialName("post_id") val postId: Long,
        @SerialName("reposts_count") val repostsCount: Int,
        @SerialName("wall_repost_count") val wallRepostCount: Int? = null,
        @SerialName("mail_repost_count") val mailRepostCount: Int? = null,
        @SerialName("likes_count") val likesCount: Int,
    )
}
