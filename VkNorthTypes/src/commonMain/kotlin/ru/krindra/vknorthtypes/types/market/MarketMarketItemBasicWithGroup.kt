package ru.krindra.vknorthtypes.types.market

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param isGroupVerified 
 * @param groupName 
 * @param groupLink 
 * @param isOwner 
 * @param isAdult 
 * @param id Item ID
 * @param ownerId Item owner's ID
 * @param title Item title
 * @param price 
 * @param thumbPhoto URL of the preview image
 * @param isFavorite 
 */
@Serializable
data class MarketMarketItemBasicWithGroup (
    @SerialName("title") val title: String,
    @SerialName("is_group_verified") val isGroupVerified: Boolean? = null,
    @SerialName("is_favorite") val isFavorite: Boolean? = null,
    @SerialName("id") val id: Long,
    @SerialName("is_adult") val isAdult: Boolean? = null,
    @SerialName("thumb_photo") val thumbPhoto: String? = null,
    @SerialName("owner_id") val ownerId: Long,
    @SerialName("price") val price: MarketPrice,
    @SerialName("is_owner") val isOwner: Boolean? = null,
    @SerialName("group_name") val groupName: String? = null,
    @SerialName("group_link") val groupLink: String? = null,
)
