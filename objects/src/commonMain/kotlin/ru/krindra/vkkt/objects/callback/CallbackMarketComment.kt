package ru.krindra.vkkt.objects.callback

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
    @SerialName("id") val id: Int,
    @SerialName("date") val date: Int,
    @SerialName("from_id") val fromId: Int,
    @SerialName("text") val text: String? = null,
    @SerialName("photo_id") val photoId: Int? = null,
    @SerialName("market_owner_id") val marketOwnerId: Int? = null,
)
