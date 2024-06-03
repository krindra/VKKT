package ru.krindra.vknorthtypes.types.photos

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param height Height in px
 * @param url URL of the image
 * @param src URL of the image
 * @param type 
 * @param width Width in px
 */
@Serializable
data class PhotosPhotoSizes (
    @SerialName("width") val width: Int,
    @SerialName("height") val height: Int,
    @SerialName("src") val src: String? = null,
    @SerialName("url") val url: String? = null,
    @SerialName("type") val type: PhotosPhotoSizesType,
)
