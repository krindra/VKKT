package ru.krindra.vkkt.objects.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param videoId Video id
 * @param previewUrl Preview url
 * @param link 
 */
@Serializable
data class AdsClipItem (
    @SerialName("video_id") val videoId: Int? = null,
    @SerialName("link") val link: AdsClipItemLink? = null,
    @SerialName("preview_url") val previewUrl: String? = null,
)
