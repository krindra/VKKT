package ru.krindra.vknorthtypes.types.store

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param items 
 * @param count 
 */
@Serializable
data class StoreGetProductsResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<StoreProduct>,
)

