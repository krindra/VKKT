package ru.krindra.vknorthtypes.types.callback

// **********
// THIS FILE IS AUTOGENERATED!!! DO NOT EDIT IT!!!
// **********
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
    @SerialName("text") val text: String? = null,
    @SerialName("id") val id: Long,
    @SerialName("date") val date: Int,
    @SerialName("market_owner_id") val marketOwnerId: Long? = null,
    @SerialName("from_id") val fromId: Long,
    @SerialName("photo_id") val photoId: Long? = null,
)