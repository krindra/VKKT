package ru.krindra.vkkt.responses.wall

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.wall.*

/**
 * @param items 
 */
@Serializable
data class WallGetByIdResponse (
    @SerialName("items") val items: List<WallWallItem>? = null,
)

