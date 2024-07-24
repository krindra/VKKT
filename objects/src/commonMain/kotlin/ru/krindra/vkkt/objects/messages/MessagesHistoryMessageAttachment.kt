package ru.krindra.vkkt.objects.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.photos.PhotosPhoto
import ru.krindra.vkkt.objects.audio.AudioAudio
import ru.krindra.vkkt.objects.docs.DocsDoc
import ru.krindra.vkkt.objects.market.MarketMarketItem

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
    @SerialName("photo") val photo: PhotosPhoto? = null,
    @SerialName("market") val market: MarketMarketItem? = null,
    @SerialName("graffiti") val graffiti: MessagesGraffiti? = null,
    @SerialName("type") val type: MessagesHistoryMessageAttachmentType,
    @SerialName("audio_message") val audioMessage: MessagesAudioMessage? = null,
)
