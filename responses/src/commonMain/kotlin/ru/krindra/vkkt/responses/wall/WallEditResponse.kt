package ru.krindra.vkkt.responses.wall

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.wall.*

/**
 * @param postId Edited post ID
 */
@Serializable
data class WallEditResponse (
    @SerialName("post_id") val postId: Int,
)

