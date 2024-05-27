package ru.krindra.vknorthtypes.types.newsfeed

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param feedId id of feed in digest
 * @param items 
 * @param mainPostIds 
 * @param template type of digest
 * @param header 
 * @param footer 
 * @param type 
 * @param sourceId Item source ID
 * @param date Date when item has been added in Unixtime
 * @param shortTextRate Preview length control parameter
 * @param feedback 
 */
@Serializable
data class NewsfeedItemDigest (
    @SerialName("footer") val footer: NewsfeedItemDigestFooter? = null,
    @SerialName("feed_id") val feedId: String? = null,
    @SerialName("feedback") val feedback: NewsfeedItemWallpostFeedback? = null,
    @SerialName("items") val items: List<NewsfeedItemDigestItem>? = null,
    @SerialName("source_id") val sourceId: Long,
    @SerialName("date") val date: Int/* WARN! Int? = null */,
    @SerialName("header") val header: NewsfeedItemDigestHeader? = null,
    @SerialName("short_text_rate") val shortTextRate: Double? = null,
    @SerialName("type") val type: NewsfeedNewsfeedItemType/* WARN! WallPostType? = null */,
    @SerialName("main_post_ids") val mainPostIds: List<String>? = null,
    @SerialName("template") val template: String? = null,
)
