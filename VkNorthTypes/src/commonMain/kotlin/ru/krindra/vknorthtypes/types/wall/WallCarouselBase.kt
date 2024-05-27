package ru.krindra.vknorthtypes.types.wall

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param carouselOffset Index of current carousel element
 */
@Serializable
data class WallCarouselBase (
    @SerialName("carousel_offset") val carouselOffset: Int? = null,
)
