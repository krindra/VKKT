package ru.krindra.vkkt.responses.bugtracker

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.users.UsersUserFull
import ru.krindra.vkkt.objects.bugtracker.*

/**
 * @param companyMembers 
 * @param count 
 * @param profiles 
 */
@Serializable
data class BugtrackerGetCompanyMembersResponse (
    @SerialName("count") val count: Int,
    @SerialName("profiles") val profiles: List<UsersUserFull>? = null,
    @SerialName("company_members") val companyMembers: List<BugtrackerCompanyMember>,
)

