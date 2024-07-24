package ru.krindra.vkkt.objects.callback

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param id 
 * @param fromId 
 * @param date 
 * @param text 
 * @param photoOwnerId 
 */
@Serializable
data class CallbackPhotoComment (
    @SerialName("id") val id: Int,
    @SerialName("date") val date: Int,
    @SerialName("text") val text: String,
    @SerialName("from_id") val fromId: Int,
    @SerialName("photo_owner_id") val photoOwnerId: Int,
)
