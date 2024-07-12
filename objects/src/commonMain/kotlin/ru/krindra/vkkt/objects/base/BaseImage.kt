package ru.krindra.vkkt.objects.base

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param id 
 * @param url Image url
 * @param width Image width
 * @param height Image height
 * @param theme 
 */
@Serializable
data class BaseImage (
    @SerialName("url") val url: String,
    @SerialName("width") val width: Int,
    @SerialName("height") val height: Int,
    @SerialName("id") val id: String? = null,
    @SerialName("theme") val theme: String? = null,
)
