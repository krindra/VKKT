package ru.krindra.vknorthtypes.types.video

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.base.BasePropertyExists

/**
 *
 * @param withPadding 
 * @param id 
 * @param url Image url
 * @param width Image width
 * @param height Image height
 * @param theme 
 */
@Serializable
data class VideoVideoImage (
    @SerialName("url") val url: String,
    @SerialName("width") val width: Int,
    @SerialName("height") val height: Int,
    @SerialName("id") val id: String? = null,
    @SerialName("theme") val theme: String? = null,
    @SerialName("with_padding") val withPadding: BasePropertyExists? = null,
)
