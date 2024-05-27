package ru.krindra.vknorthtypes.types.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param accessKey Access key for audio message
 * @param transcriptError 
 * @param duration Audio message duration in seconds
 * @param id Audio message ID
 * @param linkMp3 MP3 file URL
 * @param linkOgg OGG file URL
 * @param ownerId Audio message owner ID
 * @param waveform 
 */
@Serializable
data class MessagesAudioMessage (
    @SerialName("link_mp3") val linkMp3: String,
    @SerialName("transcript_error") val transcriptError: Int? = null,
    @SerialName("id") val id: Long,
    @SerialName("duration") val duration: Int,
    @SerialName("access_key") val accessKey: String? = null,
    @SerialName("owner_id") val ownerId: Long,
    @SerialName("link_ogg") val linkOgg: String,
    @SerialName("waveform") val waveform: List<Int>,
)
