package ru.krindra.vkkt.responses.bugtracker

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.users.UsersUserFull
import ru.krindra.vkkt.objects.bugtracker.*

/**
 * @param userIds 
 * @param profiles 
 */
@Serializable
data class BugtrackerGetCompanyGroupMembersResponse (
    @SerialName("user_ids") val userIds: List<Int>,
    @SerialName("profiles") val profiles: List<UsersUserFull>? = null,
)

