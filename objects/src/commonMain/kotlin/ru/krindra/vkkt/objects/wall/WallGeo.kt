package ru.krindra.vkkt.objects.wall

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
    @SerialName("type") val type: String? = null,
    @SerialName("showmap") val showmap: Int? = null,
    @SerialName("coordinates") val coordinates: String? = null,
)
