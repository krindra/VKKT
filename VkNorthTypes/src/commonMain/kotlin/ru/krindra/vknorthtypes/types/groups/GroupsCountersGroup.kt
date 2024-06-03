package ru.krindra.vknorthtypes.types.groups

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param addresses Addresses number
 * @param albums Photo albums number
 * @param audios Audios number
 * @param audioPlaylists Audio playlists number
 * @param docs Docs number
 * @param market Market items number
 * @param photos Photos number
 * @param topics Topics number
 * @param videos Videos number
 * @param videoPlaylists Playlists number
 * @param marketServices Market services number
 * @param podcasts Podcasts number
 * @param articles Articles number
 * @param narratives Narratives number
 * @param clips Clips number
 * @param clipsFollowers Clips followers number
 * @param videosFollowers Videos followers number
 * @param clipsViews Clips views number
 * @param clipsLikes Clips likes number
 */
@Serializable
data class GroupsCountersGroup (
    @SerialName("docs") val docs: Int? = null,
    @SerialName("clips") val clips: Int? = null,
    @SerialName("albums") val albums: Int? = null,
    @SerialName("audios") val audios: Int? = null,
    @SerialName("market") val market: Int? = null,
    @SerialName("photos") val photos: Int? = null,
    @SerialName("topics") val topics: Int? = null,
    @SerialName("videos") val videos: Int? = null,
    @SerialName("articles") val articles: Int? = null,
    @SerialName("podcasts") val podcasts: Int? = null,
    @SerialName("addresses") val addresses: Int? = null,
    @SerialName("narratives") val narratives: Int? = null,
    @SerialName("clips_likes") val clipsLikes: Int? = null,
    @SerialName("clips_views") val clipsViews: Int? = null,
    @SerialName("audio_playlists") val audioPlaylists: Int? = null,
    @SerialName("clips_followers") val clipsFollowers: Int? = null,
    @SerialName("market_services") val marketServices: Int? = null,
    @SerialName("video_playlists") val videoPlaylists: Int? = null,
    @SerialName("videos_followers") val videosFollowers: Int? = null,
)
