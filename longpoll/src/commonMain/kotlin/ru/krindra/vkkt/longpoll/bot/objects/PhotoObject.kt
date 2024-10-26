package ru.krindra.vkkt.longpoll.bot.objects

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PhotoObject(
    @SerialName("photo_id") val photoId: Int,
    @SerialName("photo_owner_id") val photoOwnerId: Int,
)