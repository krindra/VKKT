package ru.krindra.vknorthtypes.types.docs

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.messages.MessagesGraffiti
import ru.krindra.vknorthtypes.types.messages.MessagesAudioMessage

/**
 * @param type 
 * @param audioMessage 
 * @param doc 
 * @param graffiti 
 */
@Serializable
data class DocsSaveResponse (
    @SerialName("doc") val doc: DocsDoc? = null,
    @SerialName("type") val type: DocsDocAttachmentType? = null,
    @SerialName("graffiti") val graffiti: MessagesGraffiti? = null,
    @SerialName("audio_message") val audioMessage: MessagesAudioMessage? = null,
)

