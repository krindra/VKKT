package ru.krindra.vknorthtypes.types.video

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param count Total number
 * @param items 
 */
@Serializable
data class VideoGetAlbumsResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<VideoVideoAlbum>,
)

