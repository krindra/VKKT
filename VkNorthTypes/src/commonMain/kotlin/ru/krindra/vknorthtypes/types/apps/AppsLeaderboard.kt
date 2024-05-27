package ru.krindra.vknorthtypes.types.apps

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param level Level
 * @param points Points number
 * @param score Score number
 * @param userId User ID
 */
@Serializable
data class AppsLeaderboard (
    @SerialName("user_id") val userId: Long,
    @SerialName("level") val level: Int? = null,
    @SerialName("score") val score: Int? = null,
    @SerialName("points") val points: Int? = null,
)
