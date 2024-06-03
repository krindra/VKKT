package ru.krindra.vknorthtypes.types.podcast

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param url Url of the podcast page
 * @param ownerUrl Url of the podcasts owner community
 * @param title Podcast title
 * @param ownerName Name of the podcasts owner community
 * @param cover Podcast cover
 */
@Serializable
data class PodcastExternalData (
    @SerialName("url") val url: String? = null,
    @SerialName("title") val title: String? = null,
    @SerialName("cover") val cover: PodcastCover? = null,
    @SerialName("owner_url") val ownerUrl: String? = null,
    @SerialName("owner_name") val ownerName: String? = null,
)
