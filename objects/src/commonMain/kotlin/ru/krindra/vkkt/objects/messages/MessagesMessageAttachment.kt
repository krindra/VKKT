package ru.krindra.vkkt.objects.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.market.MarketMarketAlbum
import ru.krindra.vkkt.objects.wall.WallWallComment
import ru.krindra.vkkt.objects.base.BaseSticker
import ru.krindra.vkkt.objects.polls.PollsPoll
import ru.krindra.vkkt.objects.audio.AudioAudio
import ru.krindra.vkkt.objects.gifts.GiftsLayout
import ru.krindra.vkkt.objects.market.MarketMarketItem
import ru.krindra.vkkt.objects.stories.StoriesStory
import ru.krindra.vkkt.objects.docs.DocsDoc
import ru.krindra.vkkt.objects.photos.PhotosPhoto
import ru.krindra.vkkt.objects.calls.CallsCall

/**
 *
 * @param audio 
 * @param audioMessage 
 * @param call 
 * @param doc 
 * @param gift 
 * @param graffiti 
 * @param market 
 * @param marketMarketAlbum 
 * @param photo 
 * @param sticker 
 * @param story 
 * @param type 
 * @param wallReply 
 * @param poll 
 */
@Serializable
data class MessagesMessageAttachment (
    @SerialName("doc") val doc: DocsDoc? = null,
    @SerialName("call") val call: CallsCall? = null,
    @SerialName("poll") val poll: PollsPoll? = null,
    @SerialName("gift") val gift: GiftsLayout? = null,
    @SerialName("audio") val audio: AudioAudio? = null,
    @SerialName("photo") val photo: PhotosPhoto? = null,
    @SerialName("story") val story: StoriesStory? = null,
    @SerialName("sticker") val sticker: BaseSticker? = null,
    @SerialName("market") val market: MarketMarketItem? = null,
    @SerialName("type") val type: MessagesMessageAttachmentType,
    @SerialName("graffiti") val graffiti: MessagesGraffiti? = null,
    @SerialName("wall_reply") val wallReply: WallWallComment? = null,
    @SerialName("audio_message") val audioMessage: MessagesAudioMessage? = null,
    @SerialName("market_market_album") val marketMarketAlbum: MarketMarketAlbum? = null,
)
