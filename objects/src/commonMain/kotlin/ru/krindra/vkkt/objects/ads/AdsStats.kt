package ru.krindra.vkkt.objects.ads

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
    @SerialName("id") val id: Int? = null,
    @SerialName("type") val type: AdsObjectType? = null,
    @SerialName("stats") val stats: List<AdsStatsFormat>? = null,
    @SerialName("views_times") val viewsTimes: AdsStatsViewsTimes? = null,
)
