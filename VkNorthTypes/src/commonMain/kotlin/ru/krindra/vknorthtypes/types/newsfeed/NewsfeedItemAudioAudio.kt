package ru.krindra.vknorthtypes.types.newsfeed

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.audio.AudioAudio

/**
 *
 * @param count Audios number
 * @param items 
 */
@Serializable
data class NewsfeedItemAudioAudio (
    @SerialName("count") val count: Int? = null,
    @SerialName("items") val items: List<AudioAudio>? = null,
)
