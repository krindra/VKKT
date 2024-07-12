package ru.krindra.vkkt.responses.docs

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.docs.*

/**
 * @param count Total number
 * @param items 
 */
@Serializable
data class DocsGetTypesResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<DocsDocTypes>,
)

