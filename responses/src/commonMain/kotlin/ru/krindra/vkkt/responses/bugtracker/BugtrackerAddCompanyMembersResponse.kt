package ru.krindra.vkkt.responses.bugtracker

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.bugtracker.*

/**
 * @param errors 
 */
@Serializable
data class BugtrackerAddCompanyMembersResponse (
    @SerialName("errors") val errors: List<String>,
)

