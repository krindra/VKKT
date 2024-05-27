package ru.krindra.vknorthtypes.types.stories

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param count Replies number.
 * @param new New replies number.
 */
@Serializable
data class StoriesReplies (
    @SerialName("new") val new: Int? = null,
    @SerialName("count") val count: Int,
)
