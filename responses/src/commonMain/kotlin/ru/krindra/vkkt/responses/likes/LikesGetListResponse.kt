package ru.krindra.vkkt.responses.likes

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.likes.*

/**
 * @param count Total number
 * @param items 
 */
@Serializable
data class LikesGetListResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<Int>,
)

