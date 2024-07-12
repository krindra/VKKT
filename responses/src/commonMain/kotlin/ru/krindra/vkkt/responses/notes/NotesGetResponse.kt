package ru.krindra.vkkt.responses.notes

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.notes.*

/**
 * @param count Total number
 * @param items 
 */
@Serializable
data class NotesGetResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<NotesNote>,
)

