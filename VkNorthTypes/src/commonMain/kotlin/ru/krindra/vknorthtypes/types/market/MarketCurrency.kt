package ru.krindra.vknorthtypes.types.market

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param id Currency ID
 * @param name Currency sign
 * @param title Currency title
 */
@Serializable
data class MarketCurrency (
    @SerialName("name") val name: String,
    @SerialName("title") val title: String,
    @SerialName("id") val id: Long,
)
