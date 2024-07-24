package ru.krindra.vkkt.objects.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.wall.WallWallpostAttachment

/**
 *
 * @param id Post id
 * @param fromId From id
 * @param ownerId Owner id
 * @param date Date
 * @param edited Edited date
 * @param isPinned Is pinned
 * @param markedAsAds Marked as ads
 * @param adsEasyPromote 
 * @param donut 
 * @param comments 
 * @param shortTextRate Short text rate
 * @param type Type
 * @param isFavorite Is favorite
 * @param likes 
 * @param views 
 * @param postType Post type
 * @param reposts 
 * @param text Text
 * @param isPromotedPostStealth Is promoted post stealth
 * @param hash Hash
 * @param owner 
 * @param attachments 
 * @param createdBy Created by
 * @param carouselOffset Carousel offset
 * @param canEdit Can edit
 * @param canDelete Can delete
 * @param canPin Can pin
 */
@Serializable
data class AdsPost (
    @SerialName("id") val id: Int? = null,
    @SerialName("date") val date: Int? = null,
    @SerialName("hash") val hash: String? = null,
    @SerialName("text") val text: String? = null,
    @SerialName("type") val type: String? = null,
    @SerialName("edited") val edited: Int? = null,
    @SerialName("can_pin") val canPin: Int? = null,
    @SerialName("from_id") val fromId: Int? = null,
    @SerialName("can_edit") val canEdit: Int? = null,
    @SerialName("owner_id") val ownerId: Int? = null,
    @SerialName("is_pinned") val isPinned: Int? = null,
    @SerialName("can_delete") val canDelete: Int? = null,
    @SerialName("created_by") val createdBy: Int? = null,
    @SerialName("donut") val donut: AdsPostDonut? = null,
    @SerialName("likes") val likes: AdsPostLikes? = null,
    @SerialName("owner") val owner: AdsPostOwner? = null,
    @SerialName("views") val views: AdsPostViews? = null,
    @SerialName("post_type") val postType: String? = null,
    @SerialName("marked_as_ads") val markedAsAds: Int? = null,
    @SerialName("is_favorite") val isFavorite: Boolean? = null,
    @SerialName("reposts") val reposts: AdsPostReposts? = null,
    @SerialName("comments") val comments: AdsPostComments? = null,
    @SerialName("carousel_offset") val carouselOffset: Int? = null,
    @SerialName("short_text_rate") val shortTextRate: Double? = null,
    @SerialName("ads_easy_promote") val adsEasyPromote: AdsPostEasyPromote? = null,
    @SerialName("attachments") val attachments: List<WallWallpostAttachment>? = null,
    @SerialName("is_promoted_post_stealth") val isPromotedPostStealth: Boolean? = null,
)
