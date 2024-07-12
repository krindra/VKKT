package ru.krindra.vkkt.objects.newsfeed

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class NewsfeedItemWallpostFeedbackType(val value: String){
    @SerialName("buttons") BUTTONS("buttons"),
    @SerialName("stars") STARS("stars"),
}
