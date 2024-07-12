package ru.krindra.vkkt.responses.groups

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.groups.*

/**
 * @param invitesSendCount Total invited users number
 */
@Serializable
data class GroupsInviteUserIdsListResponse (
    @SerialName("invites_send_count") val invitesSendCount: Int,
)

