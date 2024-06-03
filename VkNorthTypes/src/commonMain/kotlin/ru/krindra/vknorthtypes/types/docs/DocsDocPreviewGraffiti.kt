package ru.krindra.vknorthtypes.types.docs

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param src Graffiti file URL
 * @param width Graffiti width
 * @param height Graffiti height
 */
@Serializable
data class DocsDocPreviewGraffiti (
    @SerialName("src") val src: String,
    @SerialName("width") val width: Int,
    @SerialName("height") val height: Int,
)
