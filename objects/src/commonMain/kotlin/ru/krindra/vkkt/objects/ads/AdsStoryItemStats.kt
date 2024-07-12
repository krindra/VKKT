package ru.krindra.vkkt.objects.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param follow 
 * @param urlView 
 */
@Serializable
data class AdsStoryItemStats (
    @SerialName("follow") val follow: AdsStoryItemStatsFollow? = null,
    @SerialName("url_view") val urlView: AdsStoryItemStatsUrlView? = null,
)
