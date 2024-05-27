package ru.krindra.vknorthtypes.types.wall

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * Info about paid comments feature
 * 
 * @param text 
 */
@Serializable
data class WallWallpostCommentsDonutPlaceholder (
    @SerialName("text") val text: String,
)
