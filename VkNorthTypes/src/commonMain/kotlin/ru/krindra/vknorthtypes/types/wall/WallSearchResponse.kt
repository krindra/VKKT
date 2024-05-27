package ru.krindra.vknorthtypes.types.wall

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param count Total number
 * @param items 
 */
@Serializable
data class WallSearchResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<WallWallItem>,
)

