package ru.krindra.vkkt.objects.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param adminsPromoteUsers Only admins can promote users to admins
 * @param onlyAdminsEditInfo Only admins can change chat info
 * @param onlyAdminsEditPin Only admins can edit pinned message
 * @param onlyAdminsInvite Only admins can invite users to this chat
 * @param onlyAdminsKick Only admins can kick users from this chat
 */
@Serializable
data class MessagesChatRestrictions (
    @SerialName("only_admins_kick") val onlyAdminsKick: Boolean? = null,
    @SerialName("only_admins_invite") val onlyAdminsInvite: Boolean? = null,
    @SerialName("only_admins_edit_pin") val onlyAdminsEditPin: Boolean? = null,
    @SerialName("admins_promote_users") val adminsPromoteUsers: Boolean? = null,
    @SerialName("only_admins_edit_info") val onlyAdminsEditInfo: Boolean? = null,
)
