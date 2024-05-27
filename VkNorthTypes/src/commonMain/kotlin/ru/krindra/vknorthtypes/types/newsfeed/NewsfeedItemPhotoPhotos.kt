package ru.krindra.vknorthtypes.types.newsfeed

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.photos.PhotosPhoto

/**
 *
 * @param count Photos number
 * @param items 
 */
@Serializable
data class NewsfeedItemPhotoPhotos (
    @SerialName("count") val count: Int? = null,
    @SerialName("items") val items: List<PhotosPhoto>? = null,
)
