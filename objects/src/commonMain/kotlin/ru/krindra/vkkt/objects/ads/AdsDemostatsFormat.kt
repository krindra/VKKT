package ru.krindra.vkkt.objects.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param age 
 * @param cities 
 * @param day Day as YYYY-MM-DD
 * @param dayFrom 
 * @param dayTo 
 * @param month Month as YYYY-MM
 * @param overall 1 if period=overall
 * @param sex 
 * @param sexAge 
 */
@Serializable
data class AdsDemostatsFormat (
    @SerialName("day") val day: String? = null,
    @SerialName("month") val month: String? = null,
    @SerialName("day_to") val dayTo: String? = null,
    @SerialName("overall") val overall: Int? = null,
    @SerialName("day_from") val dayFrom: String? = null,
    @SerialName("age") val age: List<AdsStatsAge>? = null,
    @SerialName("sex") val sex: List<AdsStatsSex>? = null,
    @SerialName("cities") val cities: List<AdsStatsCities>? = null,
    @SerialName("sex_age") val sexAge: List<AdsStatsSexAge>? = null,
)
