package ru.krindra.vkkt.objects.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param id Object ID
 * @param stats 
 * @param type 
 */
@Serializable
data class AdsDemoStats (
    @SerialName("id") val id: Long? = null,
    @SerialName("type") val type: AdsObjectType? = null,
    @SerialName("stats") val stats: List<AdsDemostatsFormat>? = null,
)
