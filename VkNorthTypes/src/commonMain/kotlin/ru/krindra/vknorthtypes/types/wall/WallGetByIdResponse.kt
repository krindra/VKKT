package ru.krindra.vknorthtypes.types.wall

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param items 
 */
@Serializable
data class WallGetByIdResponse (
    @SerialName("items") val items: List<WallWallItem>? = null,
)

