package ru.krindra.vknorthtypes.types.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * Link
 * 
 * @param text Text
 * @param key Key
 * @param url Url
 */
@Serializable
data class AdsClipItemLink (
    @SerialName("url") val url: String? = null,
    @SerialName("key") val key: String? = null,
    @SerialName("text") val text: String? = null,
)
