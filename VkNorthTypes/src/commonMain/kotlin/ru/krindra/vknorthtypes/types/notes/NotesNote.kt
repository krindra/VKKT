package ru.krindra.vknorthtypes.types.notes

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.base.BaseBoolInt

/**
 *
 * @param readComments 
 * @param canComment Information whether current user can comment the note
 * @param comments Comments number
 * @param date Date when the note has been created in Unixtime
 * @param id Note ID
 * @param ownerId Note owner's ID
 * @param text Note text
 * @param textWiki Note text in wiki format
 * @param title Note title
 * @param viewUrl URL of the page with note preview
 * @param privacyView 
 * @param privacyComment 
 */
@Serializable
data class NotesNote (
    @SerialName("id") val id: Long,
    @SerialName("date") val date: Int,
    @SerialName("title") val title: String,
    @SerialName("comments") val comments: Int,
    @SerialName("owner_id") val ownerId: Long,
    @SerialName("view_url") val viewUrl: String,
    @SerialName("text") val text: String? = null,
    @SerialName("text_wiki") val textWiki: String? = null,
    @SerialName("read_comments") val readComments: Int? = null,
    @SerialName("can_comment") val canComment: BaseBoolInt? = null,
    @SerialName("privacy_view") val privacyView: List<String>? = null,
    @SerialName("privacy_comment") val privacyComment: List<String>? = null,
)
