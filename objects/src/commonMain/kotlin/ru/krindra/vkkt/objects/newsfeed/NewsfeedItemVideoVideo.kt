package ru.krindra.vkkt.objects.newsfeed

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.video.VideoVideoFull

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
