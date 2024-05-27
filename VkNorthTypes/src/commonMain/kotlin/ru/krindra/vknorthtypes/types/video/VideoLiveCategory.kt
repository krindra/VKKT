package ru.krindra.vknorthtypes.types.video

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
    @SerialName("sublist") val sublist: List<VideoLiveCategory>? = null,
    @SerialName("label") val label: String,
    @SerialName("id") val id: Long,
)
