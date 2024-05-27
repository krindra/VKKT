package ru.krindra.vknorthtypes.types.status

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.audio.AudioAudio

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
