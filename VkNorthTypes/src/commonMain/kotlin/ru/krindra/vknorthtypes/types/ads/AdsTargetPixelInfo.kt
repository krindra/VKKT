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
    @SerialName("name") val name: String,
    @SerialName("pixel") val pixel: String,
    @SerialName("domain") val domain: String,
    @SerialName("category_id") val categoryId: Long,
    @SerialName("last_updated") val lastUpdated: Int,
    @SerialName("target_pixel_id") val targetPixelId: Long,
)
