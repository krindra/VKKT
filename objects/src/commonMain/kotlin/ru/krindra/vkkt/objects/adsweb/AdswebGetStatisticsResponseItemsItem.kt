package ru.krindra.vkkt.objects.adsweb

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param siteId 
 * @param adUnitId 
 * @param overallCount 
 * @param monthsCount 
 * @param monthMin 
 * @param monthMax 
 * @param daysCount 
 * @param dayMin 
 * @param dayMax 
 * @param hoursCount 
 * @param hourMin 
 * @param hourMax 
 */
@Serializable
data class AdswebGetStatisticsResponseItemsItem (
    @SerialName("site_id") val siteId: Int? = null,
    @SerialName("day_max") val dayMax: String? = null,
    @SerialName("day_min") val dayMin: String? = null,
    @SerialName("hour_max") val hourMax: String? = null,
    @SerialName("hour_min") val hourMin: String? = null,
    @SerialName("ad_unit_id") val adUnitId: Int? = null,
    @SerialName("days_count") val daysCount: Int? = null,
    @SerialName("month_max") val monthMax: String? = null,
    @SerialName("month_min") val monthMin: String? = null,
    @SerialName("hours_count") val hoursCount: Int? = null,
    @SerialName("months_count") val monthsCount: Int? = null,
    @SerialName("overall_count") val overallCount: Int? = null,
)
