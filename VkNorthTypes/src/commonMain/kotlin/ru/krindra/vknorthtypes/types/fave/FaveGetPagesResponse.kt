package ru.krindra.vknorthtypes.types.fave

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param count 
 * @param items 
 */
@Serializable
data class FaveGetPagesResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<FavePage>,
)

