package ru.krindra.vknorthtypes.types.video

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.base.BaseBoolInt
import ru.krindra.vknorthtypes.types.base.BaseLikes
import ru.krindra.vknorthtypes.types.base.BaseRepostsInfo
import ru.krindra.vknorthtypes.types.base.BasePropertyExists

/**
 *
 * @param responseType 
 * @param accessKey Video access key
 * @param addingDate Date when the video has been added in Unixtime
 * @param canComment Information whether current user can comment the video
 * @param canEdit Information whether current user can edit the video
 * @param canDelete Information whether current user can delete the video
 * @param canLike Information whether current user can like the video
 * @param canRepost Information whether current user can repost the video
 * @param canSubscribe Information whether current user can subscribe to author of the video
 * @param canAddToFaves Information whether current user can add the video to favourites
 * @param canAdd Information whether current user can add the video
 * @param canAttachLink Information whether current user can attach action button to the video
 * @param canEditPrivacy Information whether current user can edit the video privacy
 * @param isPrivate 1 if video is private
 * @param comments Number of comments
 * @param date Date when video has been uploaded in Unixtime
 * @param description Video description
 * @param duration Video duration in seconds
 * @param image 
 * @param firstFrame 
 * @param width Video width
 * @param height Video height
 * @param id Video ID
 * @param ownerId Video owner ID
 * @param userId Id of the user who uploaded the video if it was uploaded to a group by member
 * @param title Video title
 * @param isFavorite Whether video is added to bookmarks
 * @param player Video embed URL
 * @param processing Returns if the video is processing
 * @param converting 1 if  video is being converted
 * @param added 1 if video is added to user's albums
 * @param isSubscribed 1 if user is subscribed to author of the video
 * @param trackCode 
 * @param repeat Information whether the video is repeated
 * @param type 
 * @param views Number of views
 * @param localViews If video is external, number of views on vk
 * @param contentRestricted Restriction code
 * @param contentRestrictedMessage Restriction text
 * @param balance Live donations balance
 * @param live 1 if the video is a live stream
 * @param upcoming 1 if the video is an upcoming stream
 * @param liveStartTime Date in Unixtime when the live stream is scheduled to start by the author
 * @param liveNotify Whether current user is subscribed to the upcoming live stream notification (if not subscribed to the author)
 * @param spectators Number of spectators of the stream
 * @param platform External platform
 * @param likes 
 * @param reposts 
 */
@Serializable
data class VideoVideo (
    @SerialName("id") val id: Long? = null,
    @SerialName("date") val date: Int? = null,
    @SerialName("views") val views: Int? = null,
    @SerialName("width") val width: Int? = null,
    @SerialName("type") val type: String? = null,
    @SerialName("height") val height: Int? = null,
    @SerialName("title") val title: String? = null,
    @SerialName("balance") val balance: Int? = null,
    @SerialName("user_id") val userId: Long? = null,
    @SerialName("player") val player: String? = null,
    @SerialName("comments") val comments: Int? = null,
    @SerialName("duration") val duration: Int? = null,
    @SerialName("likes") val likes: BaseLikes? = null,
    @SerialName("owner_id") val ownerId: Long? = null,
    @SerialName("added") val added: BaseBoolInt? = null,
    @SerialName("can_repost") val canRepost: Int? = null,
    @SerialName("platform") val platform: String? = null,
    @SerialName("spectators") val spectators: Int? = null,
    @SerialName("adding_date") val addingDate: Int? = null,
    @SerialName("can_add") val canAdd: BaseBoolInt? = null,
    @SerialName("local_views") val localViews: Int? = null,
    @SerialName("access_key") val accessKey: String? = null,
    @SerialName("track_code") val trackCode: String? = null,
    @SerialName("can_edit") val canEdit: BaseBoolInt? = null,
    @SerialName("can_like") val canLike: BaseBoolInt? = null,
    @SerialName("live") val live: BasePropertyExists? = null,
    @SerialName("description") val description: String? = null,
    @SerialName("is_favorite") val isFavorite: Boolean? = null,
    @SerialName("reposts") val reposts: BaseRepostsInfo? = null,
    @SerialName("can_delete") val canDelete: BaseBoolInt? = null,
    @SerialName("is_private") val isPrivate: BaseBoolInt? = null,
    @SerialName("repeat") val repeat: BasePropertyExists? = null,
    @SerialName("converting") val converting: BaseBoolInt? = null,
    @SerialName("image") val image: List<VideoVideoImage>? = null,
    @SerialName("live_start_time") val liveStartTime: Int? = null,
    @SerialName("response_type") val responseType: String? = null,
    @SerialName("can_comment") val canComment: BaseBoolInt? = null,
    @SerialName("live_notify") val liveNotify: BaseBoolInt? = null,
    @SerialName("upcoming") val upcoming: BasePropertyExists? = null,
    @SerialName("can_subscribe") val canSubscribe: BaseBoolInt? = null,
    @SerialName("is_subscribed") val isSubscribed: BaseBoolInt? = null,
    @SerialName("content_restricted") val contentRestricted: Int? = null,
    @SerialName("processing") val processing: BasePropertyExists? = null,
    @SerialName("can_attach_link") val canAttachLink: BaseBoolInt? = null,
    @SerialName("can_add_to_faves") val canAddToFaves: BaseBoolInt? = null,
    @SerialName("can_edit_privacy") val canEditPrivacy: BaseBoolInt? = null,
    @SerialName("first_frame") val firstFrame: List<VideoVideoImage>? = null,
    @SerialName("content_restricted_message") val contentRestrictedMessage: String? = null,
)
