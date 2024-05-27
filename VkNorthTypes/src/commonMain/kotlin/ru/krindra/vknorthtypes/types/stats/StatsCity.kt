package ru.krindra.vknorthtypes.types.stats

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
    @SerialName("name") val name: String? = null,
    @SerialName("value") val value: Int? = null,
)
