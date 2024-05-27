package ru.krindra.vknorthtypes.types.docs

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param src Video URL
 * @param width Video's width in pixels
 * @param height Video's height in pixels
 * @param fileSize Video file size in bites
 */
@Serializable
data class DocsDocPreviewVideo (
    @SerialName("src") val src: String,
    @SerialName("file_size") val fileSize: Int,
    @SerialName("height") val height: Int,
    @SerialName("width") val width: Int,
)
