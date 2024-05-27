package ru.krindra.vknorthtypes.types.likes

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param count Total number
 * @param items 
 */
@Serializable
data class LikesGetListResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<Int>,
)

