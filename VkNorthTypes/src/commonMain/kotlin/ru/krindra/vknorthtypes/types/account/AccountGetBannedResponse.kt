package ru.krindra.vknorthtypes.types.account

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
data class AccountGetBannedResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<Int>,
    @SerialName("groups") val groups: List<GroupsGroup>? = null,
    @SerialName("profiles") val profiles: List<UsersUserFull>? = null,
)

