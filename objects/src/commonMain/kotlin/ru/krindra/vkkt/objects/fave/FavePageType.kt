package ru.krindra.vkkt.objects.fave

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class FavePageType(val value: String){
    @SerialName("user") USER("user"),
    @SerialName("group") GROUP("group"),
    @SerialName("hints") HINTS("hints"),
}
