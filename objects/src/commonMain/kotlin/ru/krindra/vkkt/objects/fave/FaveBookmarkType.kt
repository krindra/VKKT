package ru.krindra.vkkt.objects.fave

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class FaveBookmarkType(val value: String){
    @SerialName("post") POST("post"),
    @SerialName("video") VIDEO("video"),
    @SerialName("product") PRODUCT("product"),
    @SerialName("article") ARTICLE("article"),
    @SerialName("link") LINK("link"),
    @SerialName("clip") CLIP("clip"),
}
