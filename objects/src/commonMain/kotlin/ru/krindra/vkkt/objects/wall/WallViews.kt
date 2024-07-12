package ru.krindra.vkkt.objects.wall

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param count Count
 */
@Serializable
data class WallViews (
    @SerialName("count") val count: Int? = null,
)
