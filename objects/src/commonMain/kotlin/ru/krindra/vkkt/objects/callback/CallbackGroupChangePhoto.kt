package ru.krindra.vkkt.objects.callback

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.photos.PhotosPhoto

/**
 *
 * @param userId 
 * @param photo 
 */
@Serializable
data class CallbackGroupChangePhoto (
    @SerialName("user_id") val userId: Int,
    @SerialName("photo") val photo: PhotosPhoto,
)
