package ru.krindra.vknorthtypes.types.bugtracker

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param errors 
 */
@Serializable
data class BugtrackerAddCompanyMembersResponse (
    @SerialName("errors") val errors: List<String>,
)

