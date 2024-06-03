package ru.krindra.vknorthtypes.types.market

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param id Item ID
 * @param ownerId Item owner's ID
 * @param title Item title
 * @param price 
 * @param thumbPhoto URL of the preview image
 * @param isFavorite 
 */
@Serializable
data class MarketMarketItemBasic (
    @SerialName("id") val id: Long,
    @SerialName("title") val title: String,
    @SerialName("owner_id") val ownerId: Long,
    @SerialName("price") val price: MarketPrice,
    @SerialName("thumb_photo") val thumbPhoto: String? = null,
    @SerialName("is_favorite") val isFavorite: Boolean? = null,
)
