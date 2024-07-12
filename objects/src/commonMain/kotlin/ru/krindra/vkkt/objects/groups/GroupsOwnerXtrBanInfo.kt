package ru.krindra.vkkt.objects.groups

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.users.UsersUser

/**
 *
 * @param banInfo 
 * @param group Information about group if type = group
 * @param profile Information about group if type = profile
 * @param type 
 */
@Serializable
data class GroupsOwnerXtrBanInfo (
    @SerialName("group") val group: GroupsGroup? = null,
    @SerialName("profile") val profile: UsersUser? = null,
    @SerialName("ban_info") val banInfo: GroupsBanInfo? = null,
    @SerialName("type") val type: GroupsOwnerXtrBanInfoType? = null,
)
