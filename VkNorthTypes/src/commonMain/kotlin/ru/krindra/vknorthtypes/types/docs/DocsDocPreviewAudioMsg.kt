package ru.krindra.vknorthtypes.types.docs

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param duration Audio message duration in seconds
 * @param linkMp3 MP3 file URL
 * @param linkOgg OGG file URL
 * @param waveform 
 */
@Serializable
data class DocsDocPreviewAudioMsg (
    @SerialName("link_mp3") val linkMp3: String,
    @SerialName("link_ogg") val linkOgg: String,
    @SerialName("duration") val duration: Int,
    @SerialName("waveform") val waveform: List<Int>,
)
