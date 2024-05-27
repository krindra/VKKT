package ru.krindra.vknorthtypes.types.callback

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param id 
 * @param fromId 
 * @param date 
 * @param text 
 * @param marketOwnerId 
 * @param photoId 
 */
@Serializable
data class CallbackMarketComment (
    @SerialName("photo_id") val photoId: Long? = null,
    @SerialName("id") val id: Long,
    @SerialName("market_owner_id") val marketOwnerId: Long? = null,
    @SerialName("date") val date: Int,
    @SerialName("from_id") val fromId: Long,
    @SerialName("text") val text: String? = null,
)
