package ru.krindra.vknorthtypes.types.newsfeed

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.video.VideoVideoFull

/**
 *
 * @param count Tags number
 * @param items 
 */
@Serializable
data class NewsfeedItemVideoVideo (
    @SerialName("count") val count: Int? = null,
    @SerialName("items") val items: List<VideoVideoFull>? = null,
)
