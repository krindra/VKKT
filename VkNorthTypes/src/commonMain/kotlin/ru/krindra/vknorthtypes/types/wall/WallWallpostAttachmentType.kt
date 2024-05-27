package ru.krindra.vknorthtypes.types.wall

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * Attachment type
 * 
 */
@Serializable
enum class WallWallpostAttachmentType(val value: String){
    @SerialName("photo") PHOTO("photo"),
    @SerialName("photos_list") PHOTOS_LIST("photos_list"),
    @SerialName("posted_photo") POSTED_PHOTO("posted_photo"),
    @SerialName("audio") AUDIO("audio"),
    @SerialName("audio_playlist") AUDIO_PLAYLIST("audio_playlist"),
    @SerialName("video") VIDEO("video"),
    @SerialName("video_playlist") VIDEO_PLAYLIST("video_playlist"),
    @SerialName("doc") DOC("doc"),
    @SerialName("link") LINK("link"),
    @SerialName("graffiti") GRAFFITI("graffiti"),
    @SerialName("note") NOTE("note"),
    @SerialName("app") APP("app"),
    @SerialName("poll") POLL("poll"),
    @SerialName("page") PAGE("page"),
    @SerialName("album") ALBUM("album"),
    @SerialName("market_album") MARKET_ALBUM("market_album"),
    @SerialName("market") MARKET("market"),
    @SerialName("event") EVENT("event"),
    @SerialName("donut_link") DONUT_LINK("donut_link"),
    @SerialName("article") ARTICLE("article"),
    @SerialName("textlive") TEXTLIVE("textlive"),
    @SerialName("textpost") TEXTPOST("textpost"),
    @SerialName("textpost_publish") TEXTPOST_PUBLISH("textpost_publish"),
    @SerialName("situational_theme") SITUATIONAL_THEME("situational_theme"),
    @SerialName("group") GROUP("group"),
    @SerialName("sticker") STICKER("sticker"),
    @SerialName("podcast") PODCAST("podcast"),
}
