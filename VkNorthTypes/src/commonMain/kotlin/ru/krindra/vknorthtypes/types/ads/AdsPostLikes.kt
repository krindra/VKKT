package ru.krindra.vknorthtypes.types.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * Likes
 * 
 * @param canLike Can like
 * @param count Count
 * @param userLikes User likes
 */
@Serializable
data class AdsPostLikes (
    @SerialName("count") val count: Int? = null,
    @SerialName("can_like") val canLike: Int? = null,
    @SerialName("user_likes") val userLikes: Int? = null,
)
