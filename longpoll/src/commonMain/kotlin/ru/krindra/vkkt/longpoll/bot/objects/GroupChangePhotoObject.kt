package ru.krindra.vkkt.longpoll.bot.objects

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.photos.PhotosPhoto

@Serializable
data class GroupChangePhotoObject(
    @SerialName("user_id") val userId: Int,
    @SerialName("photo") val photo: PhotosPhoto
)