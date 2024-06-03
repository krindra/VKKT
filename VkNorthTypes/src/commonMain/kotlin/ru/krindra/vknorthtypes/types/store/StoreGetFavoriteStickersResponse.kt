package ru.krindra.vknorthtypes.types.store

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.base.BaseStickerNew

/**
 * @param count Count of favorite stickers
 * @param items List of sticker objects
 */
@Serializable
data class StoreGetFavoriteStickersResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<BaseStickerNew>,
)

