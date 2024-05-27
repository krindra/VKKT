package ru.krindra.vknorthtypes.types.newsfeed

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class NewsfeedCommentsFilters(val value: String){
    @SerialName("post") POST("post"),
    @SerialName("photo") PHOTO("photo"),
    @SerialName("video") VIDEO("video"),
    @SerialName("topic") TOPIC("topic"),
    @SerialName("note") NOTE("note"),
}
