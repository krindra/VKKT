package ru.krindra.vkkt.objects.podcast

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.photos.PhotosPhotoSizes

/**
 *
 * @param sizes 
 */
@Serializable
data class PodcastCover (
    @SerialName("sizes") val sizes: List<PhotosPhotoSizes>? = null,
)
