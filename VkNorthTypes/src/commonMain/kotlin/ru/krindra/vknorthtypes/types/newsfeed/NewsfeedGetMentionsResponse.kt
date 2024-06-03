package ru.krindra.vknorthtypes.types.newsfeed

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.wall.WallWallpostFull

/**
 * @param count Total number
 * @param items 
 */
@Serializable
data class NewsfeedGetMentionsResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<WallWallpostFull>,
)

