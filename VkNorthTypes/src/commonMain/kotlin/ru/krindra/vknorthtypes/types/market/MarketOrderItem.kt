package ru.krindra.vknorthtypes.types.market

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.photos.PhotosPhoto

/**
 *
 * @param ownerId 
 * @param itemId 
 * @param price 
 * @param quantity 
 * @param item 
 * @param title 
 * @param photo 
 * @param variants 
 * @param canAddReview Extended field. Can current viewer add review for this ordered item
 */
@Serializable
data class MarketOrderItem (
    @SerialName("item_id") val itemId: Long,
    @SerialName("item") val item: MarketMarketItem,
    @SerialName("variants") val variants: List<String>? = null,
    @SerialName("quantity") val quantity: Int,
    @SerialName("photo") val photo: PhotosPhoto? = null,
    @SerialName("owner_id") val ownerId: Long,
    @SerialName("price") val price: MarketPrice,
    @SerialName("title") val title: String? = null,
    @SerialName("can_add_review") val canAddReview: Boolean? = null,
)
