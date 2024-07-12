package ru.krindra.vkkt.responses.podcasts

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.podcast.PodcastExternalData
/**
 * @param podcasts 
 * @param resultsTotal Total amount of found results
 */
@Serializable
data class PodcastsSearchPodcastResponse (
    @SerialName("results_total") val resultsTotal: Int,
    @SerialName("podcasts") val podcasts: List<PodcastExternalData>,
)

