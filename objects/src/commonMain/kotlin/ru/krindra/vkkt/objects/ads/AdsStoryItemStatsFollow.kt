package ru.krindra.vkkt.objects.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * Follow event stats
 * 
 * @param eventType Event type
 * @param rhash Event hash
 */
@Serializable
data class AdsStoryItemStatsFollow (
    @SerialName("rhash") val rhash: String? = null,
    @SerialName("event_type") val eventType: String? = null,
)
