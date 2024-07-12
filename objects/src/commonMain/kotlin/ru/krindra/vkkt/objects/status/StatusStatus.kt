package ru.krindra.vkkt.objects.status

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.audio.AudioAudio

/**
 *
 * @param text Status text
 * @param audio 
 */
@Serializable
data class StatusStatus (
    @SerialName("text") val text: String,
    @SerialName("audio") val audio: AudioAudio? = null,
)
