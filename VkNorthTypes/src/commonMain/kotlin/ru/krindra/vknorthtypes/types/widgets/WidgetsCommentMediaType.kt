package ru.krindra.vknorthtypes.types.widgets

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * Media type
 * 
 */
@Serializable
enum class WidgetsCommentMediaType(val value: String){
    @SerialName("audio") AUDIO("audio"),
    @SerialName("photo") PHOTO("photo"),
    @SerialName("video") VIDEO("video"),
}
