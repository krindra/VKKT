package ru.krindra.vkkt.objects.newsfeed

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param text 
 * @param title 
 * @param action 
 * @param images 
 * @param type 
 * @param sourceId Item source ID
 * @param date Date when item has been added in Unixtime
 * @param shortTextRate Preview length control parameter
 * @param feedback 
 */
@Serializable
data class NewsfeedItemPromoButton (
    @SerialName("source_id") val sourceId: Long,
    @SerialName("text") val text: String? = null,
    @SerialName("title") val title: String? = null,
    @SerialName("date") val date: Int/* WARN! Int? = null */,
    @SerialName("short_text_rate") val shortTextRate: Double? = null,
    @SerialName("action") val action: NewsfeedItemPromoButtonAction? = null,
    @SerialName("feedback") val feedback: NewsfeedItemWallpostFeedback? = null,
    @SerialName("images") val images: List<NewsfeedItemPromoButtonImage>? = null,
    @SerialName("type") val type: NewsfeedNewsfeedItemType/* WARN! WallPostType? = null */,
)
