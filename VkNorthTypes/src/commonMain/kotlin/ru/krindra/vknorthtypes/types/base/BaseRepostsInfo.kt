package ru.krindra.vknorthtypes.types.base

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * Count of views
 * 
 * @param count Total reposts counter. Sum of wall and mail reposts counters
 * @param wallCount Wall reposts counter
 * @param mailCount Mail reposts counter
 * @param userReposted Information whether current user has reposted the post
 */
@Serializable
data class BaseRepostsInfo (
    @SerialName("count") val count: Int,
    @SerialName("mail_count") val mailCount: Int? = null,
    @SerialName("wall_count") val wallCount: Int? = null,
    @SerialName("user_reposted") val userReposted: BaseBoolInt? = null,
)
