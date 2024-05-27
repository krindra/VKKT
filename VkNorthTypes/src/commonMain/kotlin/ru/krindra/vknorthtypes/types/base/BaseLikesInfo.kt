package ru.krindra.vknorthtypes.types.base

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param canLike Information whether current user can like the post
 * @param canPublish Information whether current user can repost
 * @param count Likes number
 * @param userLikes Information whether current uer has liked the post
 * @param repostDisabled Remove repost feature for post
 */
@Serializable
data class BaseLikesInfo (
    @SerialName("can_like") val canLike: BaseBoolInt,
    @SerialName("repost_disabled") val repostDisabled: Boolean? = null,
    @SerialName("count") val count: Int,
    @SerialName("user_likes") val userLikes: BaseBoolInt,
    @SerialName("can_publish") val canPublish: BaseBoolInt? = null,
)
