package ru.krindra.vknorthtypes.types.wall

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param coordinates Coordinates as string. <latitude> <longtitude>
 * @param showmap Information whether a map is showed
 * @param type Place type
 */
@Serializable
data class WallGeo (
    @SerialName("coordinates") val coordinates: String? = null,
    @SerialName("type") val type: String? = null,
    @SerialName("showmap") val showmap: Int? = null,
)
