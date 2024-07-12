package ru.krindra.vkkt.objects.docs

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.photos.PhotosPhotoSizesType

/**
 *
 * @param src URL of the image
 * @param width Width in px
 * @param height Height in px
 * @param type 
 */
@Serializable
data class DocsDocPreviewPhotoSizes (
    @SerialName("src") val src: String,
    @SerialName("width") val width: Int,
    @SerialName("height") val height: Int,
    @SerialName("type") val type: PhotosPhotoSizesType,
)
