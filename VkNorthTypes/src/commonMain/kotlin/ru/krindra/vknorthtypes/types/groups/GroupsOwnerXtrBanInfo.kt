package ru.krindra.vknorthtypes.types.groups

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.users.UsersUser

/**
 *
 * @param banInfo 
 * @param group Information about group if type = group
 * @param profile Information about group if type = profile
 * @param type 
 */
@Serializable
data class GroupsOwnerXtrBanInfo (
    @SerialName("type") val type: GroupsOwnerXtrBanInfoType? = null,
    @SerialName("ban_info") val banInfo: GroupsBanInfo? = null,
    @SerialName("profile") val profile: UsersUser? = null,
    @SerialName("group") val group: GroupsGroup? = null,
)
