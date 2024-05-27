package ru.krindra.vknorthtypes.types.video

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param albumId Created album ID
 */
@Serializable
data class VideoAddAlbumResponse (
    @SerialName("album_id") val albumId: Long,
)

