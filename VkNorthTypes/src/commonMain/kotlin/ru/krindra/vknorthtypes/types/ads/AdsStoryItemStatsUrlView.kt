package ru.krindra.vknorthtypes.types.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * Url view event stats
 * 
 * @param eventType Event type
 * @param rhash Event hash
 */
@Serializable
data class AdsStoryItemStatsUrlView (
    @SerialName("rhash") val rhash: String? = null,
    @SerialName("event_type") val eventType: String? = null,
)
