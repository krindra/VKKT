package ru.krindra.vknorthtypes.types.base

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.photos.PhotosPhoto

/**
 *
 * @param photo 
 * @param crop 
 * @param rect 
 */
@Serializable
data class BaseCropPhoto (
    @SerialName("crop") val crop: BaseCropPhotoCrop,
    @SerialName("photo") val photo: PhotosPhoto,
    @SerialName("rect") val rect: BaseCropPhotoRect,
)
