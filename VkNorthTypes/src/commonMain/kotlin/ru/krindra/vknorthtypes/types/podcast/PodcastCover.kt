package ru.krindra.vknorthtypes.types.podcast

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.photos.PhotosPhotoSizes

/**
 *
 * @param sizes 
 */
@Serializable
data class PodcastCover (
    @SerialName("sizes") val sizes: List<PhotosPhotoSizes>? = null,
)
