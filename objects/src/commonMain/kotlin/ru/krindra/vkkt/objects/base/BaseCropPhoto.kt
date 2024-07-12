package ru.krindra.vkkt.objects.base

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.photos.PhotosPhoto

/**
 *
 * @param photo 
 * @param crop 
 * @param rect 
 */
@Serializable
data class BaseCropPhoto (
    @SerialName("photo") val photo: PhotosPhoto,
    @SerialName("crop") val crop: BaseCropPhotoCrop,
    @SerialName("rect") val rect: BaseCropPhotoRect,
)
