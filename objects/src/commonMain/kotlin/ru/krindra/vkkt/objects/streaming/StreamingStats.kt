package ru.krindra.vkkt.objects.streaming

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param eventType Events type
 * @param stats Statistics
 */
@Serializable
data class StreamingStats (
    @SerialName("event_type") val eventType: String,
    @SerialName("stats") val stats: List<StreamingStatsPoint>,
)
