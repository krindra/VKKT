package ru.krindra.vknorthtypes.types.video

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param uniqueViewers 
 */
@Serializable
data class VideoStopStreamingResponse (
    @SerialName("unique_viewers") val uniqueViewers: Int? = null,
)

