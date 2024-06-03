package ru.krindra.vknorthtypes.types.photos

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.groups.GroupsGroupFull
import ru.krindra.vknorthtypes.types.wall.WallWallComment
import ru.krindra.vknorthtypes.types.users.UsersUserFull

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

