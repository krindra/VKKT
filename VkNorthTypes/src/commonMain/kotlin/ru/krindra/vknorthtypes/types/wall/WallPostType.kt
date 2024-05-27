package ru.krindra.vknorthtypes.types.wall

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * Post type
 * 
 */
@Serializable
enum class WallPostType(val value: String){
    @SerialName("post") POST("post"),
    @SerialName("copy") COPY("copy"),
    @SerialName("reply") REPLY("reply"),
    @SerialName("postpone") POSTPONE("postpone"),
    @SerialName("suggest") SUGGEST("suggest"),
    @SerialName("post_ads") POST_ADS("post_ads"),
    @SerialName("photo") PHOTO("photo"),
    @SerialName("video") VIDEO("video"),
}
