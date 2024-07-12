package ru.krindra.vkkt.objects.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param clicksRate Clicks rate
 * @param impressionsRate Impressions rate
 */
@Serializable
data class AdsDemographicStatsPeriodItemBase (
    @SerialName("clicks_rate") val clicksRate: Double? = null,
    @SerialName("impressions_rate") val impressionsRate: Double? = null,
)
