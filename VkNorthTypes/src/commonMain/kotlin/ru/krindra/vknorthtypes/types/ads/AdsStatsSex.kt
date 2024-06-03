package ru.krindra.vknorthtypes.types.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param value 
 * @param clicksRate Clicks rate
 * @param impressionsRate Impressions rate
 */
@Serializable
data class AdsStatsSex (
    @SerialName("value") val value: AdsStatsSexValue? = null,
    @SerialName("clicks_rate") val clicksRate: Double? = null,
    @SerialName("impressions_rate") val impressionsRate: Double? = null,
)
