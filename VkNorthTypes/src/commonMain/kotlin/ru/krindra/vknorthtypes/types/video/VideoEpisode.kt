package ru.krindra.vknorthtypes.types.video

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param time Seconds from start of the video
 * @param text Description of episode
 */
@Serializable
data class VideoEpisode (
    @SerialName("time") val time: Int? = null,
    @SerialName("text") val text: String? = null,
)
