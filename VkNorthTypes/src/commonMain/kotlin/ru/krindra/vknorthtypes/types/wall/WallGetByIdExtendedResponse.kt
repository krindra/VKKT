package ru.krindra.vknorthtypes.types.wall

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.groups.GroupsGroupFull
import ru.krindra.vknorthtypes.types.users.UsersUserFull

/**
 * @param items 
 * @param profiles 
 * @param groups 
 */
@Serializable
data class WallGetByIdExtendedResponse (
    @SerialName("items") val items: List<WallWallItem>,
    @SerialName("groups") val groups: List<GroupsGroupFull>,
    @SerialName("profiles") val profiles: List<UsersUserFull>,
)

