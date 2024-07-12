package ru.krindra.vkkt.responses.wall

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.wall.*

/**
 * @param count Total number
 * @param items 
 */
@Serializable
data class WallGetResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<WallWallItem>,
)

