package ru.krindra.vknorthtypes.types.stats

// **********
// THIS FILE IS AUTOGENERATED!!! DO NOT EDIT IT!!!
// **********
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * Reach stats
 * 
 * @param age 
 * @param cities 
 * @param countries 
 * @param mobileReach Reach count from mobile devices
 * @param reach Reach count
 * @param reachSubscribers Subscribers reach count
 * @param sex 
 * @param sexAge 
 */
@Serializable
data class StatsReach (
    @SerialName("sex") val sex: List<StatsSexAge>? = null,
    @SerialName("sex_age") val sexAge: List<StatsSexAge>? = null,
    @SerialName("reach") val reach: Int? = null,
    @SerialName("cities") val cities: List<StatsCity>? = null,
    @SerialName("countries") val countries: List<StatsCountry>? = null,
    @SerialName("reach_subscribers") val reachSubscribers: Int? = null,
    @SerialName("age") val age: List<StatsSexAge>? = null,
    @SerialName("mobile_reach") val mobileReach: Int? = null,
)