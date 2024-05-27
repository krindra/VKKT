package ru.krindra.vknorthtypes.types.notes

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param date Date when the comment has beed added in Unixtime
 * @param id Comment ID
 * @param message Comment text
 * @param nid Note ID
 * @param oid Note ID
 * @param replyTo ID of replied comment 
 * @param uid Comment author's ID
 */
@Serializable
data class NotesNoteComment (
    @SerialName("nid") val nid: Long,
    @SerialName("uid") val uid: Long,
    @SerialName("id") val id: Long,
    @SerialName("message") val message: String,
    @SerialName("reply_to") val replyTo: Int? = null,
    @SerialName("oid") val oid: Long,
    @SerialName("date") val date: Int,
)
