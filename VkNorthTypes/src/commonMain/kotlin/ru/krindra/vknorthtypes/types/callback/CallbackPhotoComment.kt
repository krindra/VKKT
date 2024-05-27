package ru.krindra.vknorthtypes.types.callback

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
    @SerialName("id") val id: Long,
    @SerialName("photo_owner_id") val photoOwnerId: Long,
    @SerialName("date") val date: Int,
    @SerialName("from_id") val fromId: Long,
    @SerialName("text") val text: String,
)
