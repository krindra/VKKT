package ru.krindra.vkkt.responses.prettyCards

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.prettyCards.*

/**
 * @param count Total number
 * @param items 
 */
@Serializable
data class PrettyCardsGetResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<PrettyCardsPrettyCard>,
)

