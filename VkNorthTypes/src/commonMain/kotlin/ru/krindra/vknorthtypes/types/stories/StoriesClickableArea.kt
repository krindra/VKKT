package ru.krindra.vknorthtypes.types.stories

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param x 
 * @param y 
 */
@Serializable
data class StoriesClickableArea (
    @SerialName("x") val x: Int,
    @SerialName("y") val y: Int,
)
