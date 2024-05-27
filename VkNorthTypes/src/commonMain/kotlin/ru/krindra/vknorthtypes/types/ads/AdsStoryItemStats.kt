package ru.krindra.vknorthtypes.types.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param follow 
 * @param urlView 
 */
@Serializable
data class AdsStoryItemStats (
    @SerialName("url_view") val urlView: AdsStoryItemStatsUrlView? = null,
    @SerialName("follow") val follow: AdsStoryItemStatsFollow? = null,
)
