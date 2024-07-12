package ru.krindra.vkkt.responses.store

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.base.BaseStickerNew
import ru.krindra.vkkt.objects.store.*

/**
 * @param count Count of favorite stickers
 * @param items List of sticker objects
 */
@Serializable
data class StoreGetFavoriteStickersResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<BaseStickerNew>,
)

