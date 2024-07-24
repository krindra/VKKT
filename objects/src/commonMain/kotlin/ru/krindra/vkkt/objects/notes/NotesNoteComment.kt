package ru.krindra.vkkt.objects.notes

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
    @SerialName("id") val id: Int,
    @SerialName("nid") val nid: Int,
    @SerialName("oid") val oid: Int,
    @SerialName("uid") val uid: Int,
    @SerialName("date") val date: Int,
    @SerialName("message") val message: String,
    @SerialName("reply_to") val replyTo: Int? = null,
)
