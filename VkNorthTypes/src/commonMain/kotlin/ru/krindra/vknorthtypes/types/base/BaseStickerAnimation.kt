package ru.krindra.vknorthtypes.types.base

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param type Type of animation script
 * @param url URL of animation script
 */
@Serializable
data class BaseStickerAnimation (
    @SerialName("url") val url: String? = null,
    @SerialName("type") val type: String? = null,
)
