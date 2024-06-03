package ru.krindra.vknorthtypes.types.utils

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param cities 
 * @param countries 
 * @param sexAge 
 * @param timestamp Start time
 * @param views Total views number
 */
@Serializable
data class UtilsStatsExtended (
    @SerialName("views") val views: Int? = null,
    @SerialName("timestamp") val timestamp: Int? = null,
    @SerialName("cities") val cities: List<UtilsStatsCity>? = null,
    @SerialName("sex_age") val sexAge: List<UtilsStatsSexAge>? = null,
    @SerialName("countries") val countries: List<UtilsStatsCountry>? = null,
)
