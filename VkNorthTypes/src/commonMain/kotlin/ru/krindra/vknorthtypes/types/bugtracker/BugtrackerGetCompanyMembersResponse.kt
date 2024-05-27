package ru.krindra.vknorthtypes.types.bugtracker

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.users.UsersUserFull


/**
 * @param companyMembers 
 * @param count 
 * @param profiles 
 */
@Serializable
data class BugtrackerGetCompanyMembersResponse (
    @SerialName("company_members") val companyMembers: List<BugtrackerCompanyMember>,
    @SerialName("count") val count: Int,
    @SerialName("profiles") val profiles: List<UsersUserFull>? = null,
)

