package ru.krindra.vkkt.responses.bugtracker

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.bugtracker.*

/**
 * @param errors 
 */
@Serializable
data class BugtrackerAddCompanyGroupsMembersResponse (
    @SerialName("errors") val errors: List<BugtrackerAddCompanyGroupsMembersError>,
)

