package ru.krindra.vknorthtypes.types.pages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param creatorId Page creator ID
 * @param creatorName Page creator name
 * @param editorId Last editor ID
 * @param editorName Last editor name
 * @param groupId Community ID
 * @param id Page ID
 * @param title Page title
 * @param views Views number
 * @param whoCanEdit Edit settings of the page
 * @param whoCanView View settings of the page
 */
@Serializable
data class PagesWikipage (
    @SerialName("id") val id: Long,
    @SerialName("views") val views: Int,
    @SerialName("title") val title: String,
    @SerialName("group_id") val groupId: Long,
    @SerialName("editor_id") val editorId: Long? = null,
    @SerialName("creator_id") val creatorId: Long? = null,
    @SerialName("editor_name") val editorName: String? = null,
    @SerialName("creator_name") val creatorName: String? = null,
    @SerialName("who_can_edit") val whoCanEdit: PagesPrivacySettings,
    @SerialName("who_can_view") val whoCanView: PagesPrivacySettings,
)
