package ru.krindra.vknorthtypes.types.base

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param latitude 
 * @param longitude 
 */
@Serializable
data class BaseGeoCoordinates (
    @SerialName("longitude") val longitude: Double,
    @SerialName("latitude") val latitude: Double,
)
