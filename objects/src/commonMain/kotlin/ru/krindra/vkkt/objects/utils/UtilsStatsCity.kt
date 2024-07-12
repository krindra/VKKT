package ru.krindra.vkkt.objects.utils

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param cityId City ID
 * @param views Views number
 */
@Serializable
data class UtilsStatsCity (
    @SerialName("views") val views: Int? = null,
    @SerialName("city_id") val cityId: Long? = null,
)
