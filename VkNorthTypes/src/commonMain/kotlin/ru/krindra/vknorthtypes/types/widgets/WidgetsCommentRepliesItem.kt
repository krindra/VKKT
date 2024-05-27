package ru.krindra.vknorthtypes.types.widgets

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.users.UsersUserFull

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
    @SerialName("date") val date: Int? = null,
    @SerialName("cid") val cid: Long? = null,
    @SerialName("likes") val likes: WidgetsWidgetLikes? = null,
    @SerialName("uid") val uid: Long? = null,
    @SerialName("user") val user: UsersUserFull? = null,
    @SerialName("text") val text: String? = null,
)
