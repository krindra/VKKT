package ru.krindra.vkkt.objects.market

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param accessKey Access key for the market item
 * @param availability 
 * @param buttonTitle Title for button for url
 * @param category 
 * @param categoryV2 
 * @param date Date when the item has been created in Unixtime
 * @param description Item description
 * @param externalId 
 * @param id Item ID
 * @param isFavorite 
 * @param ownerId Item owner's ID
 * @param isOwner 
 * @param isAdult 
 * @param price 
 * @param thumbPhoto URL of the preview image
 * @param title Item title
 * @param url URL to item
 * @param variantsGroupingId 
 * @param isMainVariant 
 * @param sku 
 * @param stockAmount Inventory balances
 * @param postId Attach for post id
 * @param postOwnerId Attach for post owner id
 */
@Serializable
data class MarketMarketItem (
    @SerialName("id") val id: Long,
    @SerialName("title") val title: String,
    @SerialName("date") val date: Int? = null,
    @SerialName("owner_id") val ownerId: Long,
    @SerialName("sku") val sku: String? = null,
    @SerialName("url") val url: String? = null,
    @SerialName("price") val price: MarketPrice,
    @SerialName("post_id") val postId: Long? = null,
    @SerialName("description") val description: String,
    @SerialName("is_adult") val isAdult: Boolean? = null,
    @SerialName("is_owner") val isOwner: Boolean? = null,
    @SerialName("access_key") val accessKey: String? = null,
    @SerialName("stock_amount") val stockAmount: Int? = null,
    @SerialName("external_id") val externalId: String? = null,
    @SerialName("thumb_photo") val thumbPhoto: String? = null,
    @SerialName("category") val category: MarketMarketCategory,
    @SerialName("is_favorite") val isFavorite: Boolean? = null,
    @SerialName("post_owner_id") val postOwnerId: Long? = null,
    @SerialName("button_title") val buttonTitle: String? = null,
    @SerialName("is_main_variant") val isMainVariant: Boolean? = null,
    @SerialName("category_v2") val categoryV2: MarketMarketCategory? = null,
    @SerialName("variants_grouping_id") val variantsGroupingId: Long? = null,
    @SerialName("availability") val availability: MarketMarketItemAvailability,
)
