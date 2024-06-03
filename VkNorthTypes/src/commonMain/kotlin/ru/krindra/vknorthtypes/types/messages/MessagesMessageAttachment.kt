package ru.krindra.vknorthtypes.types.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.calls.CallsCall
import ru.krindra.vknorthtypes.types.market.MarketMarketItem
import ru.krindra.vknorthtypes.types.docs.DocsDoc
import ru.krindra.vknorthtypes.types.audio.AudioAudio
import ru.krindra.vknorthtypes.types.wall.WallWallComment
import ru.krindra.vknorthtypes.types.polls.PollsPoll
import ru.krindra.vknorthtypes.types.stories.StoriesStory
import ru.krindra.vknorthtypes.types.market.MarketMarketAlbum
import ru.krindra.vknorthtypes.types.gifts.GiftsLayout
import ru.krindra.vknorthtypes.types.photos.PhotosPhoto
import ru.krindra.vknorthtypes.types.base.BaseSticker

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
