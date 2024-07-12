package ru.krindra.vkkt.objects.base

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param enabled Information whether cover is enabled
 * @param images 
 * @param cropParams 
 * @param originalImage 
 * @param photoId 
 */
@Serializable
data class BaseOwnerCover (
    @SerialName("enabled") val enabled: BaseBoolInt,
    @SerialName("photo_id") val photoId: Long? = null,
    @SerialName("images") val images: List<BaseImage>? = null,
    @SerialName("original_image") val originalImage: BaseImage? = null,
    @SerialName("crop_params") val cropParams: BaseOwnerCoverCropParams? = null,
)
