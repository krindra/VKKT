package ru.krindra.vknorthtypes.types.stats

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param code Country code
 * @param count Visitors number
 * @param name Country name
 * @param value Country ID
 */
@Serializable
data class StatsCountry (
    @SerialName("count") val count: Int? = null,
    @SerialName("value") val value: Int? = null,
    @SerialName("code") val code: String? = null,
    @SerialName("name") val name: String? = null,
)
