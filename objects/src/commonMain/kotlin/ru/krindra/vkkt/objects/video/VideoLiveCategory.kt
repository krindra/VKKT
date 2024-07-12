package ru.krindra.vkkt.objects.video

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param id 
 * @param label 
 * @param sublist 
 */
@Serializable
data class VideoLiveCategory (
    @SerialName("id") val id: Long,
    @SerialName("label") val label: String,
    @SerialName("sublist") val sublist: List<VideoLiveCategory>? = null,
)
