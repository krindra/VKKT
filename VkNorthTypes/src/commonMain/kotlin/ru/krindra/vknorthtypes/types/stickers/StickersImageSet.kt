package ru.krindra.vknorthtypes.types.stickers

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.base.BaseImage

/**
 *
 * @param baseUrl Base URL for images in set
 * @param version Version number to be appended to the image URL
 * @param images 
 */
@Serializable
data class StickersImageSet (
    @SerialName("base_url") val baseUrl: String,
    @SerialName("version") val version: Int? = null,
    @SerialName("images") val images: List<BaseImage>? = null,
)
