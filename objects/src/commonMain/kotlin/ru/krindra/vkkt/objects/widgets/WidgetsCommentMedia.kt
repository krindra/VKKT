package ru.krindra.vkkt.objects.widgets

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param itemId Media item ID
 * @param ownerId Media owner's ID
 * @param thumbSrc URL of the preview image (type=photo only)
 * @param type 
 */
@Serializable
data class WidgetsCommentMedia (
    @SerialName("item_id") val itemId: Int? = null,
    @SerialName("owner_id") val ownerId: Int? = null,
    @SerialName("thumb_src") val thumbSrc: String? = null,
    @SerialName("type") val type: WidgetsCommentMediaType? = null,
)
