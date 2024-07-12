package ru.krindra.vkkt.responses.wall

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.wall.*

/**
 * @param items 
 * @param canPost Information whether current user can comment the post
 * @param showReplyButton 
 * @param groupsCanPost Information whether groups can comment the post
 */
@Serializable
data class WallGetCommentResponse (
    @SerialName("can_post") val canPost: Boolean? = null,
    @SerialName("items") val items: List<WallWallComment>,
    @SerialName("groups_can_post") val groupsCanPost: Boolean? = null,
    @SerialName("show_reply_button") val showReplyButton: Boolean? = null,
)

