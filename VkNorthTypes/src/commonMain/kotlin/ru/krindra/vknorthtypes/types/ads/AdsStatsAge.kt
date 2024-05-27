package ru.krindra.vknorthtypes.types.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param value Age interval
 * @param clicksRate Clicks rate
 * @param impressionsRate Impressions rate
 */
@Serializable
data class AdsStatsAge (
    @SerialName("value") val value: String? = null,
    @SerialName("impressions_rate") val impressionsRate: Double? = null,
    @SerialName("clicks_rate") val clicksRate: Double? = null,
)
