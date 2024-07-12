package ru.krindra.vkkt.objects.market

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
    @SerialName("id") val id: Long,
    @SerialName("name") val name: String,
    @SerialName("title") val title: String,
)
