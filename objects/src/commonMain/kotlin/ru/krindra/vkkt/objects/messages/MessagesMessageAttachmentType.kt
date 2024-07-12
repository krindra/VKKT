package ru.krindra.vkkt.objects.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * Attachment type
 * 
 */
@Serializable
enum class MessagesMessageAttachmentType(val value: String){
    @SerialName("photo") PHOTO("photo"),
    @SerialName("audio") AUDIO("audio"),
    @SerialName("video") VIDEO("video"),
    @SerialName("video_playlist") VIDEO_PLAYLIST("video_playlist"),
    @SerialName("doc") DOC("doc"),
    @SerialName("link") LINK("link"),
    @SerialName("market") MARKET("market"),
    @SerialName("market_album") MARKET_ALBUM("market_album"),
    @SerialName("gift") GIFT("gift"),
    @SerialName("sticker") STICKER("sticker"),
    @SerialName("wall") WALL("wall"),
    @SerialName("wall_reply") WALL_REPLY("wall_reply"),
    @SerialName("article") ARTICLE("article"),
    @SerialName("poll") POLL("poll"),
    @SerialName("call") CALL("call"),
    @SerialName("graffiti") GRAFFITI("graffiti"),
    @SerialName("audio_message") AUDIO_MESSAGE("audio_message"),
    @SerialName("mini_app") MINI_APP("mini_app"),
}
