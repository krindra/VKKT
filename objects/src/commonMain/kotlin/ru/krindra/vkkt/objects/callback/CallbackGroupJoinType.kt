package ru.krindra.vkkt.objects.callback

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class CallbackGroupJoinType(val value: String){
    @SerialName("join") JOIN("join"),
    @SerialName("unsure") UNSURE("unsure"),
    @SerialName("accepted") ACCEPTED("accepted"),
    @SerialName("approved") APPROVED("approved"),
    @SerialName("request") REQUEST("request"),
}
