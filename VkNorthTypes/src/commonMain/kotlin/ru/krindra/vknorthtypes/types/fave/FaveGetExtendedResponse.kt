package ru.krindra.vknorthtypes.types.fave

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.groups.GroupsGroup

import ru.krindra.vknorthtypes.types.users.UsersUserFull


/**
 * @param count Total number
 * @param items 
 * @param profiles 
 * @param groups 
 */
@Serializable
data class FaveGetExtendedResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<FaveBookmark>,
    @SerialName("profiles") val profiles: List<UsersUserFull>? = null,
    @SerialName("groups") val groups: List<GroupsGroup>? = null,
)

