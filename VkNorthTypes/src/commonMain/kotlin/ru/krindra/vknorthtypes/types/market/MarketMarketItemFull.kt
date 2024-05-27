package ru.krindra.vknorthtypes.types.market

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.base.BaseBoolInt
import ru.krindra.vknorthtypes.types.base.BaseLink
import ru.krindra.vknorthtypes.types.photos.PhotosPhoto
import ru.krindra.vknorthtypes.types.base.BaseLikes
import ru.krindra.vknorthtypes.types.base.BaseRepostsInfo

/**
 *
 * @param albumsIds 
 * @param photos 
 * @param canComment Information whether current use can comment the item
 * @param canRepost Information whether current use can repost the item
 * @param likes 
 * @param reposts 
 * @param viewsCount Views number
 * @param wishlistItemId Object identifier in wishlist of viewer
 * @param rating Rating of product
 * @param ordersCount Count of product orders
 * @param cancelInfo Information for cancel and revert order
 * @param userAgreementInfo User agreement info
 * @param adId Contains ad ID if it has
 * @param ownerInfo Information about the group where the item is placed
 * @param canEdit Can the item be updated by current user?
 * @param canDelete Can item be deleted by current user?
 * @param canShowConvertToService Can the item be converted from a product into a service?
 * @param promotion Information about promotion of the item
 * @param vkPayDiscount The amount of the discount if VK Pay is used for payment
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
data class MarketMarketItemFull (
    @SerialName("promotion") val promotion: MarketItemPromotionInfo? = null,
    @SerialName("rating") val rating: Double? = null,
    @SerialName("button_title") val buttonTitle: String? = null,
    @SerialName("category_v2") val categoryV2: MarketMarketCategory? = null,
    @SerialName("thumb_photo") val thumbPhoto: String? = null,
    @SerialName("post_owner_id") val postOwnerId: Long? = null,
    @SerialName("is_favorite") val isFavorite: Boolean? = null,
    @SerialName("can_repost") val canRepost: BaseBoolInt? = null,
    @SerialName("is_owner") val isOwner: Boolean? = null,
    @SerialName("likes") val likes: BaseLikes? = null,
    @SerialName("url") val url: String? = null,
    @SerialName("stock_amount") val stockAmount: Int? = null,
    @SerialName("variants_grouping_id") val variantsGroupingId: Long? = null,
    @SerialName("albums_ids") val albumsIds: List<Int>? = null,
    @SerialName("title") val title: String,
    @SerialName("sku") val sku: String? = null,
    @SerialName("is_adult") val isAdult: Boolean? = null,
    @SerialName("is_main_variant") val isMainVariant: Boolean? = null,
    @SerialName("access_key") val accessKey: String? = null,
    @SerialName("can_edit") val canEdit: Boolean? = null,
    @SerialName("wishlist_item_id") val wishlistItemId: Long? = null,
    @SerialName("owner_id") val ownerId: Long,
    @SerialName("post_id") val postId: Long? = null,
    @SerialName("vk_pay_discount") val vkPayDiscount: Int? = null,
    @SerialName("id") val id: Long,
    @SerialName("views_count") val viewsCount: Int? = null,
    @SerialName("photos") val photos: List<PhotosPhoto>? = null,
    @SerialName("reposts") val reposts: BaseRepostsInfo? = null,
    @SerialName("cancel_info") val cancelInfo: BaseLink? = null,
    @SerialName("external_id") val externalId: String? = null,
    @SerialName("orders_count") val ordersCount: Int? = null,
    @SerialName("can_delete") val canDelete: Boolean? = null,
    @SerialName("price") val price: MarketPrice,
    @SerialName("date") val date: Int? = null,
    @SerialName("owner_info") val ownerInfo: MarketItemOwnerInfo? = null,
    @SerialName("can_show_convert_to_service") val canShowConvertToService: Boolean? = null,
    @SerialName("availability") val availability: MarketMarketItemAvailability,
    @SerialName("category") val category: MarketMarketCategory,
    @SerialName("description") val description: String,
    @SerialName("user_agreement_info") val userAgreementInfo: String? = null,
    @SerialName("ad_id") val adId: Long? = null,
    @SerialName("can_comment") val canComment: BaseBoolInt? = null,
)
