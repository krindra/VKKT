package ru.krindra.vknorthtypes.types.base

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param coordinates 
 * @param place 
 * @param showmap Information whether a map is showed
 * @param type Place type
 */
@Serializable
data class BaseGeo (
    @SerialName("type") val type: String? = null,
    @SerialName("showmap") val showmap: Int? = null,
    @SerialName("place") val place: BasePlace? = null,
    @SerialName("coordinates") val coordinates: BaseGeoCoordinates? = null,
)
