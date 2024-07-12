package ru.krindra.vkkt.objects.wall

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param text 
 */
@Serializable
data class WallWallpostDonutPlaceholder (
    @SerialName("text") val text: String,
)
