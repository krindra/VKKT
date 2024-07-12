package ru.krindra.vkkt.objects.stats

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * Views stats
 * 
 * @param age 
 * @param cities 
 * @param countries 
 * @param mobileViews Number of views from mobile devices
 * @param sex 
 * @param sexAge 
 * @param views Views number
 * @param visitors Visitors number
 */
@Serializable
data class StatsViews (
    @SerialName("views") val views: Int? = null,
    @SerialName("visitors") val visitors: Int? = null,
    @SerialName("age") val age: List<StatsSexAge>? = null,
    @SerialName("sex") val sex: List<StatsSexAge>? = null,
    @SerialName("mobile_views") val mobileViews: Int? = null,
    @SerialName("cities") val cities: List<StatsCity>? = null,
    @SerialName("sex_age") val sexAge: List<StatsSexAge>? = null,
    @SerialName("countries") val countries: List<StatsCountry>? = null,
)
