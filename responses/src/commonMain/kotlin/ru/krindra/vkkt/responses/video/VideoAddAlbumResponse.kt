package ru.krindra.vkkt.responses.video

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.video.*

/**
 * @param albumId Created album ID
 */
@Serializable
data class VideoAddAlbumResponse (
    @SerialName("album_id") val albumId: Long,
)

