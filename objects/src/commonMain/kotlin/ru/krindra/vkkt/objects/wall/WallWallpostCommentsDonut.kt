package ru.krindra.vkkt.objects.wall

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param placeholder 
 */
@Serializable
data class WallWallpostCommentsDonut (
    @SerialName("placeholder") val placeholder: WallWallpostCommentsDonutPlaceholder? = null,
)
