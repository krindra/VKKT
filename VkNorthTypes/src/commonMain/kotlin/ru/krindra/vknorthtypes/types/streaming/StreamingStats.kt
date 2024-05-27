package ru.krindra.vknorthtypes.types.streaming

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param eventType Events type
 * @param stats Statistics
 */
@Serializable
data class StreamingStats (
    @SerialName("stats") val stats: List<StreamingStatsPoint>,
    @SerialName("event_type") val eventType: String,
)
