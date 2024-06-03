package ru.krindra.vknorthtypes.types.pages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.base.BaseBoolInt

/**
 *
 * @param created Date when the page has been created in Unixtime
 * @param creatorId Page creator ID
 * @param currentUserCanEdit Information whether current user can edit the page
 * @param currentUserCanEditAccess Information whether current user can edit the page access settings
 * @param edited Date when the page has been edited in Unixtime
 * @param editorId Last editor ID
 * @param groupId Community ID
 * @param html Page content, HTML
 * @param id Page ID
 * @param source Page content, wiki
 * @param title Page title
 * @param viewUrl URL of the page preview
 * @param views Views number
 * @param whoCanEdit Edit settings of the page
 * @param whoCanView View settings of the page
 * @param url URL
 * @param parent Parent
 * @param parent2 Parent2
 * @param ownerId Owner ID
 */
@Serializable
data class PagesWikipageFull (
    @SerialName("id") val id: Long,
    @SerialName("views") val views: Int,
    @SerialName("edited") val edited: Int,
    @SerialName("title") val title: String,
    @SerialName("created") val created: Int,
    @SerialName("group_id") val groupId: Long,
    @SerialName("url") val url: String? = null,
    @SerialName("view_url") val viewUrl: String,
    @SerialName("html") val html: String? = null,
    @SerialName("parent") val parent: String? = null,
    @SerialName("source") val source: String? = null,
    @SerialName("owner_id") val ownerId: Long? = null,
    @SerialName("parent2") val parent2: String? = null,
    @SerialName("editor_id") val editorId: Long? = null,
    @SerialName("creator_id") val creatorId: Long? = null,
    @SerialName("who_can_edit") val whoCanEdit: PagesPrivacySettings,
    @SerialName("who_can_view") val whoCanView: PagesPrivacySettings,
    @SerialName("current_user_can_edit") val currentUserCanEdit: BaseBoolInt? = null,
    @SerialName("current_user_can_edit_access") val currentUserCanEditAccess: BaseBoolInt? = null,
)
