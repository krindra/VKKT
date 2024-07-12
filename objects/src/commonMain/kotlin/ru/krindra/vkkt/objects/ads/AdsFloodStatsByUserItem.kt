package ru.krindra.vkkt.objects.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param userId User ID
 * @param requestsCount Used requests
 */
@Serializable
data class AdsFloodStatsByUserItem (
    @SerialName("user_id") val userId: Long,
    @SerialName("requests_count") val requestsCount: Int,
)
