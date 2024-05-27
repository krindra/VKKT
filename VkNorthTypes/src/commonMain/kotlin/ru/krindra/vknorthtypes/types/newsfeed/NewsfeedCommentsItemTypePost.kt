package ru.krindra.vknorthtypes.types.newsfeed

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.wall.WallPostCopyright
import ru.krindra.vknorthtypes.types.wall.WallWallpostAttachment
import ru.krindra.vknorthtypes.types.wall.WallPostSource
import ru.krindra.vknorthtypes.types.wall.WallWallpostDonut
import ru.krindra.vknorthtypes.types.base.BaseBoolInt
import ru.krindra.vknorthtypes.types.wall.WallGeo
import ru.krindra.vknorthtypes.types.wall.WallPostType
import ru.krindra.vknorthtypes.types.base.BaseLikesInfo
import ru.krindra.vknorthtypes.types.wall.WallViews
import ru.krindra.vknorthtypes.types.wall.WallWallpostFull
import ru.krindra.vknorthtypes.types.base.BaseRepostsInfo

/**
 *
 * @param fromId 
 * @param comments 
 * @param type 
 * @param sourceId 
 * @param date 
 * @param postId 
 * @param copyHistory 
 * @param canEdit Information whether current user can edit the post
 * @param createdBy Post creator ID (if post still can be edited)
 * @param canDelete Information whether current user can delete the post
 * @param canPin Information whether current user can pin the post
 * @param donut 
 * @param isPinned Information whether the post is pinned
 * @param markedAsAds Information whether the post is marked as ads
 * @param topicId Topic ID. Allowed values can be obtained from newsfeed.getPostTopics method
 * @param shortTextRate Preview length control parameter
 * @param hash Hash for sharing
 * @param feedback 
 * @param toId 
 * @param carouselOffset Index of current carousel element
 * @param accessKey Access key to private object
 * @param isDeleted 
 * @param deletedReason 
 * @param deletedDetails 
 * @param attachments 
 * @param copyright Information about the source of the post
 * @param edited Date of editing in Unixtime
 * @param geo 
 * @param id Post ID
 * @param isArchived Is post archived, only for post owners
 * @param isFavorite Information whether the post in favorites list
 * @param likes Count of likes
 * @param ownerId Wall owner's ID
 * @param parentsStack If post type 'reply', contains original parent IDs stack
 * @param postSource 
 * @param postType 
 * @param reposts 
 * @param signerId Post signer ID
 * @param text Post text
 * @param views Count of views
 */
@Serializable
data class NewsfeedCommentsItemTypePost (
    @SerialName("source_id") val sourceId: Long? = null,
    @SerialName("is_pinned") val isPinned: BaseBoolInt? = null,
    @SerialName("feedback") val feedback: NewsfeedItemWallpostFeedback? = null,
    @SerialName("can_edit") val canEdit: BaseBoolInt? = null,
    @SerialName("is_archived") val isArchived: Boolean? = null,
    @SerialName("id") val id: Long? = null,
    @SerialName("copyright") val copyright: WallPostCopyright? = null,
    @SerialName("can_pin") val canPin: BaseBoolInt? = null,
    @SerialName("attachments") val attachments: List<WallWallpostAttachment>? = null,
    @SerialName("carousel_offset") val carouselOffset: Int? = null,
    @SerialName("geo") val geo: WallGeo? = null,
    @SerialName("parents_stack") val parentsStack: List<Int>? = null,
    @SerialName("is_favorite") val isFavorite: Boolean? = null,
    @SerialName("type") val type: NewsfeedNewsfeedItemType/* WARN! WallPostType? = null */,
    @SerialName("signer_id") val signerId: Long? = null,
    @SerialName("post_type") val postType: WallPostType? = null,
    @SerialName("created_by") val createdBy: Int? = null,
    @SerialName("can_delete") val canDelete: BaseBoolInt? = null,
    @SerialName("to_id") val toId: Long? = null,
    @SerialName("views") val views: WallViews? = null,
    @SerialName("deleted_details") val deletedDetails: String? = null,
    @SerialName("access_key") val accessKey: String? = null,
    @SerialName("post_id") val postId: Long? = null,
    @SerialName("hash") val hash: String? = null,
    @SerialName("post_source") val postSource: WallPostSource? = null,
    @SerialName("reposts") val reposts: BaseRepostsInfo? = null,
    @SerialName("donut") val donut: WallWallpostDonut? = null,
    @SerialName("likes") val likes: BaseLikesInfo? = null,
    @SerialName("edited") val edited: Int? = null,
    @SerialName("text") val text: String? = null,
    @SerialName("date") val date: Int? = null,
    @SerialName("topic_id") val topicId: Long? = null,
    @SerialName("from_id") val fromId: Long? = null,
    @SerialName("copy_history") val copyHistory: List<WallWallpostFull>? = null,
    @SerialName("is_deleted") val isDeleted: Boolean? = null,
    @SerialName("comments") val comments: NewsfeedCommentsBase? = null/* WARN! BaseCommentsInfo? = null */,
    @SerialName("marked_as_ads") val markedAsAds: BaseBoolInt? = null,
    @SerialName("short_text_rate") val shortTextRate: Double? = null,
    @SerialName("owner_id") val ownerId: Long? = null,
    @SerialName("deleted_reason") val deletedReason: String? = null,
)
