package ru.krindra.vkkt.objects.stats

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param count Visitors number
 * @param name City name
 * @param value City ID
 */
@Serializable
data class StatsCity (
    @SerialName("count") val count: Int? = null,
    @SerialName("value") val value: Int? = null,
    @SerialName("name") val name: String? = null,
)
