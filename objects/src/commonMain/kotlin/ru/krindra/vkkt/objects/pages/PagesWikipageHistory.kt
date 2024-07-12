package ru.krindra.vkkt.objects.pages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param id Version ID
 * @param length Page size in bytes
 * @param date Date when the page has been edited in Unixtime
 * @param editorId Last editor ID
 * @param editorName Last editor name
 */
@Serializable
data class PagesWikipageHistory (
    @SerialName("id") val id: Long,
    @SerialName("date") val date: Int,
    @SerialName("length") val length: Int,
    @SerialName("editor_id") val editorId: Long,
    @SerialName("editor_name") val editorName: String,
)
