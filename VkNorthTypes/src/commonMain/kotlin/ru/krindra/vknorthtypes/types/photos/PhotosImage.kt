package ru.krindra.vknorthtypes.types.photos

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param height Height of the photo in px.
 * @param type 
 * @param url Photo URL.
 * @param width Width of the photo in px.
 */
@Serializable
data class PhotosImage (
    @SerialName("url") val url: String? = null,
    @SerialName("width") val width: Int? = null,
    @SerialName("height") val height: Int? = null,
    @SerialName("type") val type: PhotosImageType? = null,
)
