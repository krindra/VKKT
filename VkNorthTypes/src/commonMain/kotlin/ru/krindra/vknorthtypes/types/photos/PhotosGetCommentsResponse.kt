package ru.krindra.vknorthtypes.types.photos

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.wall.WallWallComment


/**
 * @param count Total number
 * @param realOffset Real offset of the comments
 * @param items 
 */
@Serializable
data class PhotosGetCommentsResponse (
    @SerialName("count") val count: Int,
    @SerialName("real_offset") val realOffset: Int? = null,
    @SerialName("items") val items: List<WallWallComment>,
)

