package ru.krindra.vknorthtypes.types.video

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param url 
 * @param key 
 * @param okmpUrl 
 * @param webrtcUrl 
 */
@Serializable
data class VideoStreamInputParams (
    @SerialName("key") val key: String? = null,
    @SerialName("url") val url: String? = null,
    @SerialName("okmp_url") val okmpUrl: String? = null,
    @SerialName("webrtc_url") val webrtcUrl: String? = null,
)
