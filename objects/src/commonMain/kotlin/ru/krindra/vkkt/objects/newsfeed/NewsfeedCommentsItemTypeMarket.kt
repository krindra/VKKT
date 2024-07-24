package ru.krindra.vkkt.objects.newsfeed

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.market.MarketMarketCategory
import ru.krindra.vkkt.objects.market.MarketPrice
import ru.krindra.vkkt.objects.base.BaseLikes
import ru.krindra.vkkt.objects.market.MarketMarketItemAvailability

/**
 *
 * @param comments 
 * @param likes 
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
 * @param type 
 * @param sourceId 
 */
@Serializable
data class NewsfeedCommentsItemTypeMarket (
    @SerialName("id") val id: Int,
    @SerialName("title") val title: String,
    @SerialName("date") val date: Int? = null,
    @SerialName("owner_id") val ownerId: Int,
    @SerialName("sku") val sku: String? = null,
    @SerialName("url") val url: String? = null,
    @SerialName("price") val price: MarketPrice,
    @SerialName("post_id") val postId: Int? = null,
    @SerialName("likes") val likes: BaseLikes? = null,
    @SerialName("description") val description: String,
    @SerialName("source_id") val sourceId: Int? = null,
    @SerialName("is_adult") val isAdult: Boolean? = null,
    @SerialName("is_owner") val isOwner: Boolean? = null,
    @SerialName("access_key") val accessKey: String? = null,
    @SerialName("stock_amount") val stockAmount: Int? = null,
    @SerialName("external_id") val externalId: String? = null,
    @SerialName("thumb_photo") val thumbPhoto: String? = null,
    @SerialName("category") val category: MarketMarketCategory,
    @SerialName("is_favorite") val isFavorite: Boolean? = null,
    @SerialName("post_owner_id") val postOwnerId: Int? = null,
    @SerialName("button_title") val buttonTitle: String? = null,
    @SerialName("is_main_variant") val isMainVariant: Boolean? = null,
    @SerialName("comments") val comments: NewsfeedCommentsBase? = null,
    @SerialName("category_v2") val categoryV2: MarketMarketCategory? = null,
    @SerialName("variants_grouping_id") val variantsGroupingId: Int? = null,
    @SerialName("availability") val availability: MarketMarketItemAvailability,
    @SerialName("type") val type: NewsfeedNewsfeedItemType/* WARN! WallPostType? = null */,
)
