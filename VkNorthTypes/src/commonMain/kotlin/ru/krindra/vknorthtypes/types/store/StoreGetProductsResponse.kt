package ru.krindra.vknorthtypes.types.store

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param items 
 * @param count 
 */
@Serializable
data class StoreGetProductsResponse (
    @SerialName("items") val items: List<StoreProduct>,
    @SerialName("count") val count: Int,
)

