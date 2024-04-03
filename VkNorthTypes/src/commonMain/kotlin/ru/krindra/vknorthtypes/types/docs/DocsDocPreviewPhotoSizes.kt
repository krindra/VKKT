package ru.krindra.vknorthtypes.types.docs

// **********
// THIS FILE IS AUTOGENERATED!!! DO NOT EDIT IT!!!
// **********
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.photos.PhotosPhotoSizesType

/**
 *
 * @param src URL of the image
 * @param width Width in px
 * @param height Height in px
 * @param type 
 */
@Serializable
data class DocsDocPreviewPhotoSizes (
    @SerialName("height") val height: Int,
    @SerialName("src") val src: String,
    @SerialName("type") val type: PhotosPhotoSizesType,
    @SerialName("width") val width: Int,
)