package ru.krindra.vkkt.objects.groups

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param comment Ban comment
 * @param endDate End date of ban in Unixtime
 * @param reason 
 */
@Serializable
data class GroupsGroupBanInfo (
    @SerialName("end_date") val endDate: Int? = null,
    @SerialName("comment") val comment: String? = null,
    @SerialName("reason") val reason: GroupsBanInfoReason? = null,
)
