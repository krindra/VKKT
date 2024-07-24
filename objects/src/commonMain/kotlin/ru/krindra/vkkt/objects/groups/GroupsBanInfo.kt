package ru.krindra.vkkt.objects.groups

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param adminId Administrator ID
 * @param comment Comment for a ban
 * @param commentVisible Show comment for user
 * @param isClosed 
 * @param date Date when user has been added to blacklist in Unixtime
 * @param endDate Date when user will be removed from blacklist in Unixtime
 * @param reason 
 */
@Serializable
data class GroupsBanInfo (
    @SerialName("date") val date: Int? = null,
    @SerialName("end_date") val endDate: Int? = null,
    @SerialName("admin_id") val adminId: Int? = null,
    @SerialName("comment") val comment: String? = null,
    @SerialName("is_closed") val isClosed: Boolean? = null,
    @SerialName("reason") val reason: GroupsBanInfoReason? = null,
    @SerialName("comment_visible") val commentVisible: Boolean? = null,
)
