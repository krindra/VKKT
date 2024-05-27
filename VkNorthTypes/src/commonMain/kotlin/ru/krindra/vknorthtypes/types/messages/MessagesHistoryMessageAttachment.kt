package ru.krindra.vknorthtypes.types.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.audio.AudioAudio
import ru.krindra.vknorthtypes.types.photos.PhotosPhoto
import ru.krindra.vknorthtypes.types.docs.DocsDoc
import ru.krindra.vknorthtypes.types.market.MarketMarketItem

/**
 *
 * @param audio 
 * @param audioMessage 
 * @param doc 
 * @param graffiti 
 * @param market 
 * @param photo 
 * @param type 
 */
@Serializable
data class MessagesHistoryMessageAttachment (
    @SerialName("doc") val doc: DocsDoc? = null,
    @SerialName("audio") val audio: AudioAudio? = null,
    @SerialName("market") val market: MarketMarketItem? = null,
    @SerialName("audio_message") val audioMessage: MessagesAudioMessage? = null,
    @SerialName("type") val type: MessagesHistoryMessageAttachmentType,
    @SerialName("graffiti") val graffiti: MessagesGraffiti? = null,
    @SerialName("photo") val photo: PhotosPhoto? = null,
)
