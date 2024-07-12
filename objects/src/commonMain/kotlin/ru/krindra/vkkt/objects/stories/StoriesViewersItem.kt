package ru.krindra.vkkt.objects.stories

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.users.UsersUserFull

/**
 *
 * @param isLiked user has like for this object
 * @param userId user id
 * @param user 
 */
@Serializable
data class StoriesViewersItem (
    @SerialName("user_id") val userId: Long,
    @SerialName("is_liked") val isLiked: Boolean,
    @SerialName("user") val user: UsersUserFull? = null,
)
