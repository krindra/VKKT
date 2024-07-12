package ru.krindra.vkkt.responses.utils

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.utils.*

/**
 * @param count Total number of available results
 * @param items 
 */
@Serializable
data class UtilsGetLastShortenedLinksResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<UtilsLastShortenedLink>,
)

