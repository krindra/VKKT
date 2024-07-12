package ru.krindra.vkkt.objects.wall

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * Attachment type
 * 
 */
@Serializable
enum class WallCommentAttachmentType(val value: String){
    @SerialName("photo") PHOTO("photo"),
    @SerialName("audio") AUDIO("audio"),
    @SerialName("audio_playlist") AUDIO_PLAYLIST("audio_playlist"),
    @SerialName("video") VIDEO("video"),
    @SerialName("doc") DOC("doc"),
    @SerialName("link") LINK("link"),
    @SerialName("note") NOTE("note"),
    @SerialName("page") PAGE("page"),
    @SerialName("market_market_album") MARKET_MARKET_ALBUM("market_market_album"),
    @SerialName("market") MARKET("market"),
    @SerialName("sticker") STICKER("sticker"),
    @SerialName("graffiti") GRAFFITI("graffiti"),
}
