package ru.krindra.vkkt.responses.streaming

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.streaming.*

/**
 * @param stem part of a word responsible for its lexical meaning
 */
@Serializable
data class StreamingGetStemResponse (
    @SerialName("stem") val stem: String? = null,
)

