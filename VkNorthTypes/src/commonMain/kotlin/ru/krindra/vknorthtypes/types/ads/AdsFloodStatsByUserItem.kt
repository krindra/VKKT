package ru.krindra.vknorthtypes.types.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param userId User ID
 * @param requestsCount Used requests
 */
@Serializable
data class AdsFloodStatsByUserItem (
    @SerialName("requests_count") val requestsCount: Int,
    @SerialName("user_id") val userId: Long,
)
