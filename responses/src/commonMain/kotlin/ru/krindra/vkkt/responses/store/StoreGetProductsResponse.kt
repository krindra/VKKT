package ru.krindra.vkkt.responses.store

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.store.*

/**
 * @param items 
 * @param count 
 */
@Serializable
data class StoreGetProductsResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<StoreProduct>,
)

