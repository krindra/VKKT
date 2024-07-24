package ru.krindra.vkkt.objects.utils

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param countryId Country ID
 * @param views Views number
 */
@Serializable
data class UtilsStatsCountry (
    @SerialName("views") val views: Int? = null,
    @SerialName("country_id") val countryId: Int? = null,
)
