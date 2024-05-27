package ru.krindra.vknorthtypes.types.docs

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.base.BaseBoolInt

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
    @SerialName("title") val title: String,
    @SerialName("id") val id: Long,
    @SerialName("type") val type: Int,
    @SerialName("access_key") val accessKey: String? = null,
    @SerialName("owner_id") val ownerId: Long,
    @SerialName("is_licensed") val isLicensed: BaseBoolInt? = null,
    @SerialName("date") val date: Int,
    @SerialName("preview") val preview: DocsDocPreview? = null,
    @SerialName("ext") val ext: String,
    @SerialName("tags") val tags: List<String>? = null,
    @SerialName("size") val size: Int,
    @SerialName("url") val url: String? = null,
)
