package ru.krindra.vkkt.responses.search

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.search.*

/**
 * @param count 
 * @param items 
 * @param suggestedQueries 
 */
@Serializable
data class SearchGetHintsResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<SearchHint>,
    @SerialName("suggested_queries") val suggestedQueries: List<String>? = null,
)

