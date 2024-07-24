package ru.krindra.vkkt.responses.wall

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.wall.*

/**
 * @param commentId Created comment ID
 * @param parentsStack 
 */
@Serializable
data class WallCreateCommentResponse (
    @SerialName("comment_id") val commentId: Int,
    @SerialName("parents_stack") val parentsStack: List<Int>? = null,
)

