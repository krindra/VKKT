package ru.krindra.vkkt.objects.widgets

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.base.BaseObjectCount

/**
 *
 * @param comments 
 * @param date Date when widgets on the page has been initialized firstly in Unixtime
 * @param description Page description
 * @param id Page ID
 * @param likes 
 * @param pageId page_id parameter value
 * @param photo URL of the preview image
 * @param title Page title
 * @param url Page absolute URL
 */
@Serializable
data class WidgetsWidgetPage (
    @SerialName("id") val id: Long? = null,
    @SerialName("date") val date: Int? = null,
    @SerialName("url") val url: String? = null,
    @SerialName("photo") val photo: String? = null,
    @SerialName("title") val title: String? = null,
    @SerialName("page_id") val pageId: String? = null,
    @SerialName("likes") val likes: BaseObjectCount? = null,
    @SerialName("description") val description: String? = null,
    @SerialName("comments") val comments: BaseObjectCount? = null,
)
