package ru.krindra.vknorthtypes.types.ads

// **********
// THIS FILE IS AUTOGENERATED!!! DO NOT EDIT IT!!!
// **********
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param key Key
 * @param text Text
 * @param url Url
 * @param rawUrl Raw url
 */
@Serializable
data class AdsStoryItemLink (
    @SerialName("raw_url") val rawUrl: String? = null,
    @SerialName("key") val key: String? = null,
    @SerialName("url") val url: String? = null,
    @SerialName("text") val text: String? = null,
)