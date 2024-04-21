package ru.krindra.vknorthtypes.longpoll.bot.objects

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.base.BaseBoolInt
import ru.krindra.vknorthtypes.types.base.BaseLikes
import ru.krindra.vknorthtypes.types.base.BasePropertyExists
import ru.krindra.vknorthtypes.types.base.BaseRepostsInfo
import ru.krindra.vknorthtypes.types.video.VideoVideoImage

@Serializable
data class VideoNewObject(
    @SerialName("can_edit_privacy") val canEditPrivacy: BaseBoolInt? = null,
    @SerialName("can_add_to_faves") val canAddToFaves: BaseBoolInt? = null,
    @SerialName("date") val date: Int? = null,
    @SerialName("live") val live: BasePropertyExists? = null,
    @SerialName("content_restricted") val contentRestricted: Int? = null,
    @SerialName("spectators") val spectators: Int? = null,
    @SerialName("platform") val platform: String? = null,
    @SerialName("can_edit") val canEdit: BaseBoolInt? = null,
    @SerialName("owner_id") val ownerId: Long? = null,
    @SerialName("image") val image: List<VideoVideoImage>? = null,
    @SerialName("can_comment") val canComment: BaseBoolInt? = null,
    @SerialName("added") val added: BaseBoolInt? = null,
    @SerialName("content_restricted_message") val contentRestrictedMessage: String? = null,
    @SerialName("can_subscribe") val canSubscribe: BaseBoolInt? = null,
    @SerialName("id") val id: Long? = null,
    @SerialName("views") val views: Int? = null,
    @SerialName("type") val type: String? = null,
    @SerialName("local_views") val localViews: Int? = null,
    @SerialName("adding_date") val addingDate: Int? = null,
    @SerialName("height") val height: Int? = null,
    @SerialName("title") val title: String? = null,
    @SerialName("access_key") val accessKey: String? = null,
    @SerialName("can_repost") val canRepost: Int? = null,
    @SerialName("duration") val duration: Int? = null,
    @SerialName("can_attach_link") val canAttachLink: BaseBoolInt? = null,
    @SerialName("first_frame") val firstFrame: List<VideoVideoImage>? = null,
    @SerialName("player") val player: String? = null,
    @SerialName("reposts") val reposts: BaseRepostsInfo? = null,
    @SerialName("balance") val balance: Int? = null,
    @SerialName("description") val description: String? = null,
    @SerialName("is_favorite") val isFavorite: Boolean? = null,
    @SerialName("is_subscribed") val isSubscribed: BaseBoolInt? = null,
    @SerialName("can_add") val canAdd: BaseBoolInt? = null,
    @SerialName("response_type") val responseType: String? = null,
    @SerialName("repeat") val repeat: BasePropertyExists? = null,
    @SerialName("processing") val processing: BasePropertyExists? = null,
    @SerialName("width") val width: Int? = null,
    @SerialName("track_code") val trackCode: String? = null,
    @SerialName("converting") val converting: BaseBoolInt? = null,
    @SerialName("live_notify") val liveNotify: BaseBoolInt? = null,
    @SerialName("can_like") val canLike: BaseBoolInt? = null,
    @SerialName("likes") val likes: BaseLikes? = null,
    @SerialName("is_private") val isPrivate: BaseBoolInt? = null,
    @SerialName("upcoming") val upcoming: BasePropertyExists? = null,
    @SerialName("live_start_time") val liveStartTime: Int? = null,
    @SerialName("can_delete") val canDelete: BaseBoolInt? = null,
    @SerialName("comments") val comments: Int? = null,
    @SerialName("user_id") val userId: Long? = null,
)