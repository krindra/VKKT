package ru.krindra.vknorthtypes.types.photos

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.wall.WallWallComment


/**
 * @param count Total number
 * @param items 
 */
@Serializable
data class PhotosGetAllCommentsResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<WallWallComment>,
)

