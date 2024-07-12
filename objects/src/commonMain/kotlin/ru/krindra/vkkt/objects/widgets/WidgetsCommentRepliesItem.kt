package ru.krindra.vkkt.objects.widgets

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.users.UsersUserFull

/**
 *
 * @param cid Comment ID
 * @param date Date when the comment has been added in Unixtime
 * @param likes 
 * @param text Comment text
 * @param uid User ID
 * @param user 
 */
@Serializable
data class WidgetsCommentRepliesItem (
    @SerialName("cid") val cid: Long? = null,
    @SerialName("uid") val uid: Long? = null,
    @SerialName("date") val date: Int? = null,
    @SerialName("text") val text: String? = null,
    @SerialName("user") val user: UsersUserFull? = null,
    @SerialName("likes") val likes: WidgetsWidgetLikes? = null,
)
