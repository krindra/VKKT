package ru.krindra.vknorthtypes.types.bugtracker

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.users.UsersUserFull

/**
 * @param userIds 
 * @param profiles 
 */
@Serializable
data class BugtrackerGetCompanyGroupMembersResponse (
    @SerialName("user_ids") val userIds: List<Int>,
    @SerialName("profiles") val profiles: List<UsersUserFull>? = null,
)

