package ru.krindra.vknorthtypes.types.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param left Requests left
 * @param refresh Time to refresh in seconds
 * @param statsByUser Used requests per user
 */
@Serializable
data class AdsFloodStats (
    @SerialName("left") val left: Int,
    @SerialName("refresh") val refresh: Int,
    @SerialName("stats_by_user") val statsByUser: List<AdsFloodStatsByUserItem>? = null,
)
