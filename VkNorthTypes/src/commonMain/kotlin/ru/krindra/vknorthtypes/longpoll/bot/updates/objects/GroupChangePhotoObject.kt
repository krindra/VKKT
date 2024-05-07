package ru.krindra.vknorthtypes.longpoll.bot.updates.objects

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.photos.PhotosPhoto

@Serializable
data class GroupChangePhotoObject(
    @SerialName("user_id") val userId: Int,
    @SerialName("photo") val photo: PhotosPhoto // Нврн не правильно, но я хз как тестить,
)