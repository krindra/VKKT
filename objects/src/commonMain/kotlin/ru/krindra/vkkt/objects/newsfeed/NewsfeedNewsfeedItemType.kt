package ru.krindra.vkkt.objects.newsfeed

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * Item type
 * 
 */
@Serializable
enum class NewsfeedNewsfeedItemType(val value: String){
    @SerialName("post") POST("post"),
    @SerialName("photo") PHOTO("photo"),
    @SerialName("photo_tag") PHOTO_TAG("photo_tag"),
    @SerialName("wall_photo") WALL_PHOTO("wall_photo"),
    @SerialName("friend") FRIEND("friend"),
    @SerialName("audio") AUDIO("audio"),
    @SerialName("video") VIDEO("video"),
    @SerialName("topic") TOPIC("topic"),
    @SerialName("digest") DIGEST("digest"),
    @SerialName("stories") STORIES("stories"),
    @SerialName("note") NOTE("note"),
    @SerialName("audio_playlist") AUDIO_PLAYLIST("audio_playlist"),
    @SerialName("clip") CLIP("clip"),
}
