package ru.krindra.vknorthtypes.types.wall

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.market.MarketMarketAlbum
import ru.krindra.vknorthtypes.types.groups.GroupsGroupAttach
import ru.krindra.vknorthtypes.types.photos.PhotosPhotoAlbum
import ru.krindra.vknorthtypes.types.video.VideoVideoFull
import ru.krindra.vknorthtypes.types.base.BaseLink
import ru.krindra.vknorthtypes.types.audio.AudioAudio
import ru.krindra.vknorthtypes.types.polls.PollsPoll
import ru.krindra.vknorthtypes.types.pages.PagesWikipageFull
import ru.krindra.vknorthtypes.types.video.VideoVideoAlbumFull
import ru.krindra.vknorthtypes.types.photos.PhotosPhoto
import ru.krindra.vknorthtypes.types.notes.NotesNote
import ru.krindra.vknorthtypes.types.events.EventsEventAttach
import ru.krindra.vknorthtypes.types.docs.DocsDoc
import ru.krindra.vknorthtypes.types.market.MarketMarketItem

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
    @SerialName("event") val event: EventsEventAttach? = null,
    @SerialName("video") val video: VideoVideoFull? = null,
    @SerialName("type") val type: WallWallpostAttachmentType,
    @SerialName("poll") val poll: PollsPoll? = null,
    @SerialName("link") val link: BaseLink? = null,
    @SerialName("doc") val doc: DocsDoc? = null,
    @SerialName("posted_photo") val postedPhoto: WallPostedPhoto? = null,
    @SerialName("access_key") val accessKey: String? = null,
    @SerialName("market") val market: MarketMarketItem? = null,
    @SerialName("graffiti") val graffiti: WallGraffiti? = null,
    @SerialName("app") val app: WallAppPost? = null,
    @SerialName("album") val album: PhotosPhotoAlbum? = null,
    @SerialName("group") val group: GroupsGroupAttach? = null,
    @SerialName("audio") val audio: AudioAudio? = null,
    @SerialName("market_album") val marketAlbum: MarketMarketAlbum? = null,
    @SerialName("video_playlist") val videoPlaylist: VideoVideoAlbumFull? = null,
    @SerialName("page") val page: PagesWikipageFull? = null,
    @SerialName("photo") val photo: PhotosPhoto? = null,
    @SerialName("note") val note: NotesNote? = null,
)
