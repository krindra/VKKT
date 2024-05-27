package ru.krindra.vknorthtypes.types.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param id Object ID
 * @param stats 
 * @param type 
 * @param viewsTimes 
 */
@Serializable
data class AdsStats (
    @SerialName("type") val type: AdsObjectType? = null,
    @SerialName("stats") val stats: List<AdsStatsFormat>? = null,
    @SerialName("views_times") val viewsTimes: AdsStatsViewsTimes? = null,
    @SerialName("id") val id: Long? = null,
)
