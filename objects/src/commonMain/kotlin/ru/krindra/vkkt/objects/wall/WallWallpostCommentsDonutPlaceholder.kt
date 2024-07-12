package ru.krindra.vkkt.objects.wall

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
