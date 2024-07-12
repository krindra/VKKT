package ru.krindra.vkkt.responses.gifts

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.gifts.*

/**
 * @param count Total number
 * @param items 
 */
@Serializable
data class GiftsGetResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<GiftsGift>,
)

