package ru.krindra.vknorthtypes.types.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param targetPixelId 
 * @param name 
 * @param domain 
 * @param categoryId 
 * @param lastUpdated 
 * @param pixel 
 */
@Serializable
data class AdsTargetPixelInfo (
    @SerialName("category_id") val categoryId: Long,
    @SerialName("pixel") val pixel: String,
    @SerialName("last_updated") val lastUpdated: Int,
    @SerialName("domain") val domain: String,
    @SerialName("name") val name: String,
    @SerialName("target_pixel_id") val targetPixelId: Long,
)
