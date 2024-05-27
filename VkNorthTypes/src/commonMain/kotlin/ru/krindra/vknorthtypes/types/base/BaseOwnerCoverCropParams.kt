package ru.krindra.vknorthtypes.types.base

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param x 
 * @param y 
 * @param width 
 * @param height 
 */
@Serializable
data class BaseOwnerCoverCropParams (
    @SerialName("width") val width: Int? = null,
    @SerialName("height") val height: Int? = null,
    @SerialName("y") val y: Int? = null,
    @SerialName("x") val x: Int? = null,
)
