package ru.krindra.vknorthtypes.types.callback

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param id 
 * @param fromId 
 * @param date 
 * @param text 
 * @param videoOwnerId 
 */
@Serializable
data class CallbackVideoComment (
    @SerialName("id") val id: Long,
    @SerialName("date") val date: Int,
    @SerialName("text") val text: String,
    @SerialName("from_id") val fromId: Long,
    @SerialName("video_owner_id") val videoOwnerId: Long,
)
