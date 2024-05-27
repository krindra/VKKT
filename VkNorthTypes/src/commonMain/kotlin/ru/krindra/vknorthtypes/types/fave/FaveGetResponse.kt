package ru.krindra.vknorthtypes.types.fave

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param count Total number
 * @param items 
 */
@Serializable
data class FaveGetResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<FaveBookmark>,
)

