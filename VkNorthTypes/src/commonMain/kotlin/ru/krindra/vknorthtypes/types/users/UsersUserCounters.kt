package ru.krindra.vknorthtypes.types.users

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param albums Albums number
 * @param badges Badges number
 * @param audios Audios number
 * @param followers Followers number
 * @param friends Friends number
 * @param gifts Gifts number
 * @param groups Communities number
 * @param notes Notes number
 * @param onlineFriends Online friends number
 * @param pages Public pages number
 * @param photos Photos number
 * @param subscriptions Subscriptions number
 * @param userPhotos Number of photos with user
 * @param userVideos Number of videos with user
 * @param videos Videos number
 * @param videoPlaylists Playlists number
 * @param newPhotoTags 
 * @param newRecognitionTags 
 * @param mutualFriends 
 * @param friendsFollowers 
 * @param posts 
 * @param articles 
 * @param wishes 
 * @param podcasts 
 * @param clips 
 * @param clipsFollowers 
 * @param videosFollowers Videos followers number
 * @param clipsViews 
 * @param clipsLikes 
 */
@Serializable
data class UsersUserCounters (
    @SerialName("clips") val clips: Int? = null,
    @SerialName("gifts") val gifts: Int? = null,
    @SerialName("notes") val notes: Int? = null,
    @SerialName("pages") val pages: Int? = null,
    @SerialName("posts") val posts: Int? = null,
    @SerialName("albums") val albums: Int? = null,
    @SerialName("audios") val audios: Int? = null,
    @SerialName("badges") val badges: Int? = null,
    @SerialName("groups") val groups: Int? = null,
    @SerialName("photos") val photos: Int? = null,
    @SerialName("videos") val videos: Int? = null,
    @SerialName("wishes") val wishes: Int? = null,
    @SerialName("friends") val friends: Int? = null,
    @SerialName("articles") val articles: Int? = null,
    @SerialName("podcasts") val podcasts: Int? = null,
    @SerialName("followers") val followers: Int? = null,
    @SerialName("clips_likes") val clipsLikes: Int? = null,
    @SerialName("clips_views") val clipsViews: Int? = null,
    @SerialName("user_photos") val userPhotos: Int? = null,
    @SerialName("user_videos") val userVideos: Int? = null,
    @SerialName("new_photo_tags") val newPhotoTags: Int? = null,
    @SerialName("subscriptions") val subscriptions: Int? = null,
    @SerialName("mutual_friends") val mutualFriends: Int? = null,
    @SerialName("online_friends") val onlineFriends: Int? = null,
    @SerialName("clips_followers") val clipsFollowers: Int? = null,
    @SerialName("video_playlists") val videoPlaylists: Int? = null,
    @SerialName("videos_followers") val videosFollowers: Int? = null,
    @SerialName("friends_followers") val friendsFollowers: Int? = null,
    @SerialName("new_recognition_tags") val newRecognitionTags: Int? = null,
)
