package ru.krindra.vkkt.objects.stories

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.video.VideoVideoFull
import ru.krindra.vkkt.objects.base.BaseBoolInt
import ru.krindra.vkkt.objects.photos.PhotosPhoto

/**
 *
 * @param accessKey Access key for private object.
 * @param canComment Information whether current user can comment the story (0 - no, 1 - yes).
 * @param canReply Information whether current user can reply to the story (0 - no, 1 - yes).
 * @param canSee Information whether current user can see the story (0 - no, 1 - yes).
 * @param canLike Information whether current user can like the story.
 * @param canShare Information whether current user can share the story (0 - no, 1 - yes).
 * @param canHide Information whether current user can hide the story (0 - no, 1 - yes).
 * @param date Date when story has been added in Unixtime.
 * @param expiresAt Story expiration time. Unixtime.
 * @param id Story ID.
 * @param isDeleted Information whether the story is deleted (false - no, true - yes).
 * @param isExpired Information whether the story is expired (false - no, true - yes).
 * @param link 
 * @param ownerId Story owner's ID.
 * @param parentStory 
 * @param parentStoryAccessKey Access key for private object.
 * @param parentStoryId Parent story ID.
 * @param parentStoryOwnerId Parent story owner's ID.
 * @param photo 
 * @param replies Replies counters to current story.
 * @param seen Information whether current user has seen the story or not (0 - no, 1 - yes).
 * @param type 
 * @param clickableStickers 
 * @param video 
 * @param views Views number.
 * @param canAsk Information whether story has question sticker and current user can send question to the author
 * @param canAskAnonymous Information whether story has question sticker and current user can send anonymous question to the author
 * @param narrativesCount 
 * @param firstNarrativeTitle 
 * @param canUseInNarrative 
 */
@Serializable
data class StoriesStory (
    @SerialName("id") val id: Long,
    @SerialName("date") val date: Int? = null,
    @SerialName("owner_id") val ownerId: Long,
    @SerialName("views") val views: Int? = null,
    @SerialName("seen") val seen: BaseBoolInt? = null,
    @SerialName("photo") val photo: PhotosPhoto? = null,
    @SerialName("can_like") val canLike: Boolean? = null,
    @SerialName("expires_at") val expiresAt: Int? = null,
    @SerialName("can_ask") val canAsk: BaseBoolInt? = null,
    @SerialName("can_see") val canSee: BaseBoolInt? = null,
    @SerialName("link") val link: StoriesStoryLink? = null,
    @SerialName("type") val type: StoriesStoryType? = null,
    @SerialName("video") val video: VideoVideoFull? = null,
    @SerialName("access_key") val accessKey: String? = null,
    @SerialName("can_hide") val canHide: BaseBoolInt? = null,
    @SerialName("is_deleted") val isDeleted: Boolean? = null,
    @SerialName("is_expired") val isExpired: Boolean? = null,
    @SerialName("can_reply") val canReply: BaseBoolInt? = null,
    @SerialName("can_share") val canShare: BaseBoolInt? = null,
    @SerialName("replies") val replies: StoriesReplies? = null,
    @SerialName("can_comment") val canComment: BaseBoolInt? = null,
    @SerialName("parent_story_id") val parentStoryId: Long? = null,
    @SerialName("narratives_count") val narrativesCount: Int? = null,
    @SerialName("parent_story") val parentStory: StoriesStory? = null,
    @SerialName("can_ask_anonymous") val canAskAnonymous: BaseBoolInt? = null,
    @SerialName("parent_story_owner_id") val parentStoryOwnerId: Long? = null,
    @SerialName("can_use_in_narrative") val canUseInNarrative: Boolean? = null,
    @SerialName("first_narrative_title") val firstNarrativeTitle: String? = null,
    @SerialName("parent_story_access_key") val parentStoryAccessKey: String? = null,
    @SerialName("clickable_stickers") val clickableStickers: StoriesClickableStickers? = null,
)
