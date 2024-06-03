package ru.krindra.vknorthtypes.types.docs

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param audioMsg 
 * @param graffiti 
 * @param photo 
 * @param video 
 */
@Serializable
data class DocsDocPreview (
    @SerialName("photo") val photo: DocsDocPreviewPhoto? = null,
    @SerialName("video") val video: DocsDocPreviewVideo? = null,
    @SerialName("graffiti") val graffiti: DocsDocPreviewGraffiti? = null,
    @SerialName("audio_msg") val audioMsg: DocsDocPreviewAudioMsg? = null,
)
