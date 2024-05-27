package ru.krindra.vknorthtypes.types.base

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param color Hex color code without #
 * @param position Point position
 */
@Serializable
data class BaseGradientPoint (
    @SerialName("color") val color: String,
    @SerialName("position") val position: Double,
)
