package ru.krindra.vkkt.objects.newsfeed

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class NewsfeedIgnoreItemType(val value: String){
    @SerialName("wall") POST_ON_THE_WALL("wall"),
    @SerialName("tag") TAG_ON_A_PHOTO("tag"),
    @SerialName("profilephoto") PROFILE_PHOTO("profilephoto"),
    @SerialName("video") VIDEO("video"),
    @SerialName("photo") PHOTO("photo"),
    @SerialName("audio") AUDIO("audio"),
}
