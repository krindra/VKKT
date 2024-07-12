package ru.krindra.vkkt.objects.bugtracker

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param bugreportId 
 * @param commentId 
 * @param created 
 * @param text 
 * @param metaText 
 * @param fromId 
 * @param authorName 
 * @param authorPhoto 
 * @param editHash 
 * @param removeHash 
 * @param isHidden 
 * @param attachments 
 * @param isUnread 
 */
@Serializable
data class BugtrackerComment (
    @SerialName("text") val text: String,
    @SerialName("created") val created: Int,
    @SerialName("comment_id") val commentId: Long,
    @SerialName("from_id") val fromId: Long? = null,
    @SerialName("bugreport_id") val bugreportId: Long,
    @SerialName("edit_hash") val editHash: String? = null,
    @SerialName("meta_text") val metaText: String? = null,
    @SerialName("is_hidden") val isHidden: Boolean? = null,
    @SerialName("is_unread") val isUnread: Boolean? = null,
    @SerialName("author_name") val authorName: String? = null,
    @SerialName("remove_hash") val removeHash: String? = null,
    @SerialName("author_photo") val authorPhoto: String? = null,
    @SerialName("attachments") val attachments: List<BugtrackerAttachment>? = null,
)
