package ru.krindra.vknorthtypes.types.groups

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param invitesSendCount Total invited users number
 */
@Serializable
data class GroupsInviteUserIdsListResponse (
    @SerialName("invites_send_count") val invitesSendCount: Int,
)

