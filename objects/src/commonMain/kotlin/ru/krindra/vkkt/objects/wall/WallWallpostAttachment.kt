package ru.krindra.vkkt.objects.wall

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.video.VideoVideoAlbumFull
import ru.krindra.vkkt.objects.photos.PhotosPhoto
import ru.krindra.vkkt.objects.events.EventsEventAttach
import ru.krindra.vkkt.objects.base.BaseLink
import ru.krindra.vkkt.objects.docs.DocsDoc
import ru.krindra.vkkt.objects.market.MarketMarketItem
import ru.krindra.vkkt.objects.video.VideoVideoFull
import ru.krindra.vkkt.objects.pages.PagesWikipageFull
import ru.krindra.vkkt.objects.groups.GroupsGroupAttach
import ru.krindra.vkkt.objects.notes.NotesNote
import ru.krindra.vkkt.objects.market.MarketMarketAlbum
import ru.krindra.vkkt.objects.polls.PollsPoll
import ru.krindra.vkkt.objects.audio.AudioAudio
import ru.krindra.vkkt.objects.photos.PhotosPhotoAlbum

/**
 *
 * @param accessKey Access key for the audio
 * @param album 
 * @param app 
 * @param audio 
 * @param doc 
 * @param event 
 * @param group 
 * @param graffiti 
 * @param link 
 * @param market 
 * @param marketAlbum 
 * @param note 
 * @param page 
 * @param photo 
 * @param poll 
 * @param postedPhoto 
 * @param type 
 * @param video 
 * @param videoPlaylist 
 */
@Serializable
data class WallWallpostAttachment (
    @SerialName("doc") val doc: DocsDoc? = null,
    @SerialName("link") val link: BaseLink? = null,
    @SerialName("app") val app: WallAppPost? = null,
    @SerialName("note") val note: NotesNote? = null,
    @SerialName("poll") val poll: PollsPoll? = null,
    @SerialName("audio") val audio: AudioAudio? = null,
    @SerialName("photo") val photo: PhotosPhoto? = null,
    @SerialName("video") val video: VideoVideoFull? = null,
    @SerialName("access_key") val accessKey: String? = null,
    @SerialName("page") val page: PagesWikipageFull? = null,
    @SerialName("album") val album: PhotosPhotoAlbum? = null,
    @SerialName("type") val type: WallWallpostAttachmentType,
    @SerialName("event") val event: EventsEventAttach? = null,
    @SerialName("group") val group: GroupsGroupAttach? = null,
    @SerialName("graffiti") val graffiti: WallGraffiti? = null,
    @SerialName("market") val market: MarketMarketItem? = null,
    @SerialName("posted_photo") val postedPhoto: WallPostedPhoto? = null,
    @SerialName("market_album") val marketAlbum: MarketMarketAlbum? = null,
    @SerialName("video_playlist") val videoPlaylist: VideoVideoAlbumFull? = null,
)
