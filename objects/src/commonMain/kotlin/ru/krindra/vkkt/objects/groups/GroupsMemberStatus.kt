package ru.krindra.vkkt.objects.groups

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.base.BaseBoolInt

/**
 *
 * @param member Information whether user is a member of the group
 * @param userId User ID
 */
@Serializable
data class GroupsMemberStatus (
    @SerialName("user_id") val userId: Int,
    @SerialName("member") val member: BaseBoolInt,
)
