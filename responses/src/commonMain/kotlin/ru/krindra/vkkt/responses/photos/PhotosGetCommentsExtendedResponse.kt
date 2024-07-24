package ru.krindra.vkkt.responses.photos

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.groups.GroupsGroupFull
import ru.krindra.vkkt.objects.users.UsersUserFull
import ru.krindra.vkkt.objects.wall.WallWallComment
import ru.krindra.vkkt.objects.photos.*

/**
 * @param count Total number
 * @param realOffset Real offset of the comments
 * @param items 
 * @param profiles 
 * @param groups 
 */
@Serializable
data class PhotosGetCommentsExtendedResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<WallWallComment>,
    @SerialName("real_offset") val realOffset: Int? = null,
    @SerialName("groups") val groups: List<GroupsGroupFull>,
    @SerialName("profiles") val profiles: List<UsersUserFull>,
)

