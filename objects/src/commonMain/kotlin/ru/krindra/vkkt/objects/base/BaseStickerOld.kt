package ru.krindra.vkkt.objects.base

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param id Sticker ID
 * @param productId Pack ID
 * @param width Width in px
 * @param height Height in px
 * @param photo128 URL of the preview image with 128 px in height
 * @param photo256 URL of the preview image with 256 px in height
 * @param photo352 URL of the preview image with 352 px in height
 * @param photo512 URL of the preview image with 512 px in height
 * @param photo64 URL of the preview image with 64 px in height
 * @param isAllowed Information whether the sticker is allowed
 */
@Serializable
data class BaseStickerOld (
    @SerialName("id") val id: Long? = null,
    @SerialName("width") val width: Int? = null,
    @SerialName("height") val height: Int? = null,
    @SerialName("photo_64") val photo64: String? = null,
    @SerialName("photo_128") val photo128: String? = null,
    @SerialName("photo_256") val photo256: String? = null,
    @SerialName("photo_352") val photo352: String? = null,
    @SerialName("photo_512") val photo512: String? = null,
    @SerialName("product_id") val productId: Long? = null,
    @SerialName("is_allowed") val isAllowed: Boolean? = null,
)
