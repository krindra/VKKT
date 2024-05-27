package ru.krindra.vknorthtypes.types.adsweb

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
    @SerialName("day_min") val dayMin: String? = null,
    @SerialName("day_max") val dayMax: String? = null,
    @SerialName("days_count") val daysCount: Int? = null,
    @SerialName("months_count") val monthsCount: Int? = null,
    @SerialName("month_min") val monthMin: String? = null,
    @SerialName("hour_min") val hourMin: String? = null,
    @SerialName("overall_count") val overallCount: Int? = null,
    @SerialName("hour_max") val hourMax: String? = null,
    @SerialName("ad_unit_id") val adUnitId: Long? = null,
    @SerialName("hours_count") val hoursCount: Int? = null,
    @SerialName("site_id") val siteId: Long? = null,
    @SerialName("month_max") val monthMax: String? = null,
)
