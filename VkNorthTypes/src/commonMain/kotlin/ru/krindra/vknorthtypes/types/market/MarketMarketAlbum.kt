package ru.krindra.vknorthtypes.types.market

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.photos.PhotosPhoto

/**
 *
 * @param id Market album ID
 * @param ownerId Market album owner's ID
 * @param title Market album title
 * @param count Items number
 * @param isMain Is album main for owner
 * @param isHidden Is album hidden
 * @param photo 
 * @param updatedTime Date when album has been updated last time in Unixtime
 * @param type Type of album
 * @param isBlurEnabled Is album needed to be blurred (18+) or not
 */
@Serializable
data class MarketMarketAlbum (
    @SerialName("id") val id: Long,
    @SerialName("count") val count: Int,
    @SerialName("title") val title: String,
    @SerialName("owner_id") val ownerId: Long,
    @SerialName("type") val type: Int? = null,
    @SerialName("updated_time") val updatedTime: Int,
    @SerialName("is_main") val isMain: Boolean? = null,
    @SerialName("photo") val photo: PhotosPhoto? = null,
    @SerialName("is_hidden") val isHidden: Boolean? = null,
    @SerialName("is_blur_enabled") val isBlurEnabled: Boolean? = null,
)
