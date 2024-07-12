package ru.krindra.vkkt.objects.wall

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.base.BaseLink
import ru.krindra.vkkt.objects.market.MarketMarketAlbum
import ru.krindra.vkkt.objects.base.BaseSticker
import ru.krindra.vkkt.objects.audio.AudioAudio
import ru.krindra.vkkt.objects.market.MarketMarketItem
import ru.krindra.vkkt.objects.video.VideoVideo
import ru.krindra.vkkt.objects.docs.DocsDoc
import ru.krindra.vkkt.objects.pages.PagesWikipageFull
import ru.krindra.vkkt.objects.photos.PhotosPhoto

/**
 *
 * @param audio 
 * @param doc 
 * @param link 
 * @param market 
 * @param marketMarketAlbum 
 * @param note 
 * @param page 
 * @param photo 
 * @param sticker 
 * @param type 
 * @param video 
 * @param graffiti 
 */
@Serializable
data class WallCommentAttachment (
    @SerialName("doc") val doc: DocsDoc? = null,
    @SerialName("link") val link: BaseLink? = null,
    @SerialName("audio") val audio: AudioAudio? = null,
    @SerialName("video") val video: VideoVideo? = null,
    @SerialName("photo") val photo: PhotosPhoto? = null,
    @SerialName("note") val note: WallAttachedNote? = null,
    @SerialName("page") val page: PagesWikipageFull? = null,
    @SerialName("sticker") val sticker: BaseSticker? = null,
    @SerialName("type") val type: WallCommentAttachmentType,
    @SerialName("graffiti") val graffiti: WallGraffiti? = null,
    @SerialName("market") val market: MarketMarketItem? = null,
    @SerialName("market_market_album") val marketMarketAlbum: MarketMarketAlbum? = null,
)
