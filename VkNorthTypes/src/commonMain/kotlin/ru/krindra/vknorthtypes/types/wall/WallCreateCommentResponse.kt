package ru.krindra.vknorthtypes.types.wall

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param commentId Created comment ID
 * @param parentsStack 
 */
@Serializable
data class WallCreateCommentResponse (
    @SerialName("comment_id") val commentId: Long,
    @SerialName("parents_stack") val parentsStack: List<Int>? = null,
)

