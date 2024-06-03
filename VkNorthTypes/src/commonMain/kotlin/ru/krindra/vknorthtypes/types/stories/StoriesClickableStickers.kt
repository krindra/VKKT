package ru.krindra.vknorthtypes.types.stories

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param clickableStickers 
 * @param originalHeight 
 * @param originalWidth 
 */
@Serializable
data class StoriesClickableStickers (
    @SerialName("original_width") val originalWidth: Int,
    @SerialName("original_height") val originalHeight: Int,
    @SerialName("clickable_stickers") val clickableStickers: List<StoriesClickableSticker>,
)
