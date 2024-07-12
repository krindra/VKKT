package ru.krindra.vkkt.responses.photos

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.wall.WallWallComment
import ru.krindra.vkkt.objects.photos.*

/**
 * @param count Total number
 * @param realOffset Real offset of the comments
 * @param items 
 */
@Serializable
data class PhotosGetCommentsResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<WallWallComment>,
    @SerialName("real_offset") val realOffset: Int? = null,
)

