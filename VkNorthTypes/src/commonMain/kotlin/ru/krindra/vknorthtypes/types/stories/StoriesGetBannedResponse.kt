package ru.krindra.vknorthtypes.types.stories

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param count Stories count
 * @param items 
 */
@Serializable
data class StoriesGetBannedResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<Int>,
)

