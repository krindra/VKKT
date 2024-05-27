package ru.krindra.vknorthtypes.types.market

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param marketAlbumId Album ID
 * @param albumsCount Albums count
 */
@Serializable
data class MarketAddAlbumResponse (
    @SerialName("market_album_id") val marketAlbumId: Long? = null,
    @SerialName("albums_count") val albumsCount: Int? = null,
)

