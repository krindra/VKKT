package ru.krindra.vkkt.objects.widgets

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.base.BaseRepostsInfo
import ru.krindra.vkkt.objects.base.BaseLikesInfo
import ru.krindra.vkkt.objects.base.BaseBoolInt
import ru.krindra.vkkt.objects.users.UsersUserFull
import ru.krindra.vkkt.objects.wall.WallCommentAttachment
import ru.krindra.vkkt.objects.wall.WallPostSource

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
    @SerialName("id") val id: Int,
    @SerialName("date") val date: Int,
    @SerialName("to_id") val toId: Int,
    @SerialName("text") val text: String,
    @SerialName("from_id") val fromId: Int,
    @SerialName("post_type") val postType: String,
    @SerialName("owner_id") val ownerId: Int? = null,
    @SerialName("user") val user: UsersUserFull? = null,
    @SerialName("likes") val likes: BaseLikesInfo? = null,
    @SerialName("media") val media: WidgetsCommentMedia? = null,
    @SerialName("reposts") val reposts: BaseRepostsInfo? = null,
    @SerialName("can_delete") val canDelete: BaseBoolInt? = null,
    @SerialName("is_favorite") val isFavorite: BaseBoolInt? = null,
    @SerialName("short_text_rate") val shortTextRate: Double? = null,
    @SerialName("post_source") val postSource: WallPostSource? = null,
    @SerialName("comments") val comments: WidgetsCommentReplies? = null,
    @SerialName("attachments") val attachments: List<WallCommentAttachment>? = null,
)
