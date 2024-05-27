package ru.krindra.vknorthtypes.types.docs

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param count Total number
 * @param items 
 */
@Serializable
data class DocsGetResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<DocsDoc>,
)

