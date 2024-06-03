package ru.krindra.vknorthtypes.types.podcasts

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.podcast.PodcastExternalData

/**
 * @param podcasts 
 * @param resultsTotal Total amount of found results
 */
@Serializable
data class PodcastsSearchPodcastResponse (
    @SerialName("results_total") val resultsTotal: Int,
    @SerialName("podcasts") val podcasts: List<PodcastExternalData>,
)

