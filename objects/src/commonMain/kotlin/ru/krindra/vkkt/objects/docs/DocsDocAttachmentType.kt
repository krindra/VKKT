package ru.krindra.vkkt.objects.docs

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * Doc attachment type
 * 
 */
@Serializable
enum class DocsDocAttachmentType(val value: String){
    @SerialName("doc") DOC("doc"),
    @SerialName("graffiti") GRAFFITI("graffiti"),
    @SerialName("audio_message") AUDIO_MESSAGE("audio_message"),
}
