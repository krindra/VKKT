package ru.krindra.vknorthtypes.types.base

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param x Coordinate X of the left upper corner
 * @param y Coordinate Y of the left upper corner
 * @param x2 Coordinate X of the right lower corner
 * @param y2 Coordinate Y of the right lower corner
 */
@Serializable
data class BaseCropPhotoRect (
    @SerialName("x") val x: Double,
    @SerialName("y") val y: Double,
    @SerialName("x2") val x2: Double,
    @SerialName("y2") val y2: Double,
)
