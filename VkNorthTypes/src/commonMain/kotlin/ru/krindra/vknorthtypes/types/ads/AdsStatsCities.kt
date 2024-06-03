package ru.krindra.vknorthtypes.types.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param name City name
 * @param value City ID
 * @param clicksRate Clicks rate
 * @param impressionsRate Impressions rate
 */
@Serializable
data class AdsStatsCities (
    @SerialName("name") val name: String? = null,
    @SerialName("value") val value: String? = null,
    @SerialName("clicks_rate") val clicksRate: Double? = null,
    @SerialName("impressions_rate") val impressionsRate: Double? = null,
)
