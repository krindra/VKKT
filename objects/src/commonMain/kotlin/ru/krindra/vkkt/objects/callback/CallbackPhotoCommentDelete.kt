package ru.krindra.vkkt.objects.callback

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param id 
 * @param ownerId 
 * @param userId 
 * @param photoId 
 */
@Serializable
data class CallbackPhotoCommentDelete (
    @SerialName("id") val id: Int,
    @SerialName("user_id") val userId: Int,
    @SerialName("owner_id") val ownerId: Int,
    @SerialName("photo_id") val photoId: Int,
)
