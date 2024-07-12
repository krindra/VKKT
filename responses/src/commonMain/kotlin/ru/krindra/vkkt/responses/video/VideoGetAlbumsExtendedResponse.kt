package ru.krindra.vkkt.responses.video

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.video.*

/**
 * @param count Total number
 * @param items 
 */
@Serializable
data class VideoGetAlbumsExtendedResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<VideoVideoAlbumFull>,
)

