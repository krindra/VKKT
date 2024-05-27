package ru.krindra.vknorthtypes.types.streaming

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param stem part of a word responsible for its lexical meaning
 */
@Serializable
data class StreamingGetStemResponse (
    @SerialName("stem") val stem: String? = null,
)

