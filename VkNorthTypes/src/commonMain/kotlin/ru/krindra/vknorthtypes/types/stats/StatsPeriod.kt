package ru.krindra.vknorthtypes.types.stats

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param activity 
 * @param periodFrom 
 * @param periodTo 
 * @param reach 
 * @param visitors 
 */
@Serializable
data class StatsPeriod (
    @SerialName("visitors") val visitors: StatsVisitorsOneOf? = null,
    @SerialName("activity") val activity: StatsActivity? = null,
    @SerialName("period_to") val periodTo: StatsPeriodToOneOf? = null,
    @SerialName("reach") val reach: StatsReachOneOf? = null,
    @SerialName("period_from") val periodFrom: StatsPeriodFromOneOf? = null,
)
