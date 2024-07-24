package ru.krindra.vkkt.objects.docs

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.base.BaseBoolInt

/**
 *
 * @param id Document ID
 * @param ownerId Document owner ID
 * @param title Document title
 * @param size File size in bites
 * @param ext File extension
 * @param url File URL
 * @param date Date when file has been uploaded in Unixtime
 * @param type Document type
 * @param preview 
 * @param isLicensed 
 * @param accessKey Access key for the document
 * @param tags Document tags
 */
@Serializable
data class DocsDoc (
    @SerialName("id") val id: Int,
    @SerialName("date") val date: Int,
    @SerialName("size") val size: Int,
    @SerialName("type") val type: Int,
    @SerialName("ext") val ext: String,
    @SerialName("title") val title: String,
    @SerialName("owner_id") val ownerId: Int,
    @SerialName("url") val url: String? = null,
    @SerialName("tags") val tags: List<String>? = null,
    @SerialName("access_key") val accessKey: String? = null,
    @SerialName("preview") val preview: DocsDocPreview? = null,
    @SerialName("is_licensed") val isLicensed: BaseBoolInt? = null,
)
