package ru.krindra.vkkt.responses.wall

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.wall.*

/**
 * @param postId Created post ID
 */
@Serializable
data class WallPostResponse (
    @SerialName("post_id") val postId: Long,
)

