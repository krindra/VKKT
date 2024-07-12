package ru.krindra.vkkt.objects.likes

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class LikesType(val value: String){
    @SerialName("post") POST("post"),
    @SerialName("comment") COMMENT("comment"),
    @SerialName("photo") PHOTO("photo"),
    @SerialName("audio") AUDIO("audio"),
    @SerialName("video") VIDEO("video"),
    @SerialName("note") NOTE("note"),
    @SerialName("market") MARKET("market"),
    @SerialName("photo_comment") PHOTO_COMMENT("photo_comment"),
    @SerialName("video_comment") VIDEO_COMMENT("video_comment"),
    @SerialName("topic_comment") TOPIC_COMMENT("topic_comment"),
    @SerialName("market_comment") MARKET_COMMENT("market_comment"),
    @SerialName("sitepage") SITEPAGE("sitepage"),
    @SerialName("textpost") TEXTPOST("textpost"),
    @SerialName("community_review") COMMUNITY_REVIEW("community_review"),
    @SerialName("story") STORY("story"),
    @SerialName("group_like") GROUP_LIKE("group_like"),
}
