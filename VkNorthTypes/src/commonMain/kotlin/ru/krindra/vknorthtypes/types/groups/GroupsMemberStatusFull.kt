package ru.krindra.vknorthtypes.types.groups

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.base.BaseBoolInt

/**
 *
 * @param canInvite Information whether user can be invited
 * @param canRecall Information whether user's invite to the group can be recalled
 * @param invitation Information whether user has been invited to the group
 * @param member Information whether user is a member of the group
 * @param request Information whether user has send request to the group
 * @param userId User ID
 */
@Serializable
data class GroupsMemberStatusFull (
    @SerialName("user_id") val userId: Long,
    @SerialName("member") val member: BaseBoolInt,
    @SerialName("request") val request: BaseBoolInt? = null,
    @SerialName("can_invite") val canInvite: BaseBoolInt? = null,
    @SerialName("can_recall") val canRecall: BaseBoolInt? = null,
    @SerialName("invitation") val invitation: BaseBoolInt? = null,
)
