package ru.krindra.vknorthtypes.types.gifts

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param count Total number
 * @param items 
 */
@Serializable
data class GiftsGetResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<GiftsGift>,
)

