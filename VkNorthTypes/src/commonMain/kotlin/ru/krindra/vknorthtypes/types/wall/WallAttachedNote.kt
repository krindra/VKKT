package ru.krindra.vknorthtypes.types.wall

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param comments Comments number
 * @param date Date when the note has been created in Unixtime
 * @param id Note ID
 * @param ownerId Note owner's ID
 * @param readComments Read comments number
 * @param title Note title
 * @param text Note text
 * @param privacyView 
 * @param privacyComment 
 * @param canComment 
 * @param textWiki Note wiki text
 * @param viewUrl URL of the page with note preview
 */
@Serializable
data class WallAttachedNote (
    @SerialName("title") val title: String,
    @SerialName("view_url") val viewUrl: String,
    @SerialName("comments") val comments: Int,
    @SerialName("id") val id: Long,
    @SerialName("can_comment") val canComment: Int? = null,
    @SerialName("text_wiki") val textWiki: String? = null,
    @SerialName("privacy_comment") val privacyComment: List<String>? = null,
    @SerialName("privacy_view") val privacyView: List<String>? = null,
    @SerialName("owner_id") val ownerId: Long,
    @SerialName("date") val date: Int,
    @SerialName("read_comments") val readComments: Int,
    @SerialName("text") val text: String? = null,
)
