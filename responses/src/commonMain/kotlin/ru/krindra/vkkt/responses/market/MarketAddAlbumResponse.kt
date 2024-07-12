package ru.krindra.vkkt.responses.market

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.market.*

/**
 * @param marketAlbumId Album ID
 * @param albumsCount Albums count
 */
@Serializable
data class MarketAddAlbumResponse (
    @SerialName("albums_count") val albumsCount: Int? = null,
    @SerialName("market_album_id") val marketAlbumId: Long? = null,
)

