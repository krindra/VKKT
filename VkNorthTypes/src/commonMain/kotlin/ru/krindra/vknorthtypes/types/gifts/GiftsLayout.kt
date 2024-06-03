package ru.krindra.vknorthtypes.types.gifts

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param id Gift ID
 * @param thumb512 URL of the preview image with 512 px in width
 * @param thumb256 URL of the preview image with 256 px in width
 * @param thumb48 URL of the preview image with 48 px in width
 * @param thumb96 URL of the preview image with 96 px in width
 * @param stickersProductId ID of the sticker pack, if the gift is representing one
 * @param isStickersStyle Information whether gift represents a stickers style
 * @param buildId ID of the build of constructor gift
 * @param keywords Keywords used for search
 */
@Serializable
data class GiftsLayout (
    @SerialName("id") val id: Long? = null,
    @SerialName("build_id") val buildId: String? = null,
    @SerialName("thumb_48") val thumb48: String? = null,
    @SerialName("thumb_96") val thumb96: String? = null,
    @SerialName("keywords") val keywords: String? = null,
    @SerialName("thumb_256") val thumb256: String? = null,
    @SerialName("thumb_512") val thumb512: String? = null,
    @SerialName("is_stickers_style") val isStickersStyle: Boolean? = null,
    @SerialName("stickers_product_id") val stickersProductId: Long? = null,
)
