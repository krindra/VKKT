package ru.krindra.vknorthtypes.types.stories

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param count Viewers count
 * @param items 
 * @param hiddenReason 
 * @param nextFrom 
 */
@Serializable
data class StoriesGetViewersExtendedV5115Response (
    @SerialName("count") val count: Int,
    @SerialName("next_from") val nextFrom: String? = null,
    @SerialName("items") val items: List<StoriesViewersItem>,
    @SerialName("hidden_reason") val hiddenReason: String? = null,
)

