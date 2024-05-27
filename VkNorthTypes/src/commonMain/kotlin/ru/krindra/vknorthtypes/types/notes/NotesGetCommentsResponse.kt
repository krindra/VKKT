package ru.krindra.vknorthtypes.types.notes

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param count Total number
 * @param items 
 */
@Serializable
data class NotesGetCommentsResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<NotesNoteComment>,
)

