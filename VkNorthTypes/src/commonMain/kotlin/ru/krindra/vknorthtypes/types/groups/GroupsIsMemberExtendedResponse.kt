package ru.krindra.vknorthtypes.types.groups

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.base.BaseBoolInt


/**
 * @param member Information whether user is a member of the group
 * @param invitation Information whether user has been invited to the group
 * @param canInvite Information whether user can be invited
 * @param canRecall Information whether user's invite to the group can be recalled
 * @param request Information whether user has sent request to the group
 */
@Serializable
data class GroupsIsMemberExtendedResponse (
    @SerialName("member") val member: BaseBoolInt,
    @SerialName("invitation") val invitation: BaseBoolInt? = null,
    @SerialName("can_invite") val canInvite: BaseBoolInt? = null,
    @SerialName("can_recall") val canRecall: BaseBoolInt? = null,
    @SerialName("request") val request: BaseBoolInt? = null,
)

