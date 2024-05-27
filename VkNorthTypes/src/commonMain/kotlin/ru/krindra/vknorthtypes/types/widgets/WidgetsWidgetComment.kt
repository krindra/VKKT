package ru.krindra.vknorthtypes.types.widgets

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.wall.WallCommentAttachment
import ru.krindra.vknorthtypes.types.users.UsersUserFull
import ru.krindra.vknorthtypes.types.wall.WallPostSource
import ru.krindra.vknorthtypes.types.base.BaseBoolInt
import ru.krindra.vknorthtypes.types.base.BaseLikesInfo
import ru.krindra.vknorthtypes.types.base.BaseRepostsInfo

/**
 *
 * @param attachments 
 * @param ownerId Wall owner's ID
 * @param canDelete Information whether current user can delete the comment
 * @param comments 
 * @param date Date when the comment has been added in Unixtime
 * @param fromId Comment author ID
 * @param id Comment ID
 * @param likes 
 * @param media 
 * @param postSource 
 * @param postType Post type
 * @param reposts 
 * @param text Comment text
 * @param toId Wall owner
 * @param user 
 * @param isFavorite Information whether the post in favorites list
 * @param shortTextRate Preview length control parameter
 */
@Serializable
data class WidgetsWidgetComment (
    @SerialName("attachments") val attachments: List<WallCommentAttachment>? = null,
    @SerialName("post_source") val postSource: WallPostSource? = null,
    @SerialName("id") val id: Long,
    @SerialName("to_id") val toId: Long,
    @SerialName("from_id") val fromId: Long,
    @SerialName("media") val media: WidgetsCommentMedia? = null,
    @SerialName("reposts") val reposts: BaseRepostsInfo? = null,
    @SerialName("owner_id") val ownerId: Long? = null,
    @SerialName("is_favorite") val isFavorite: BaseBoolInt? = null,
    @SerialName("likes") val likes: BaseLikesInfo? = null,
    @SerialName("date") val date: Int,
    @SerialName("post_type") val postType: String,
    @SerialName("user") val user: UsersUserFull? = null,
    @SerialName("comments") val comments: WidgetsCommentReplies? = null,
    @SerialName("short_text_rate") val shortTextRate: Double? = null,
    @SerialName("text") val text: String,
    @SerialName("can_delete") val canDelete: BaseBoolInt? = null,
)
