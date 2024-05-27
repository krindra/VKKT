package ru.krindra.vknorthtypes.types.groups

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.base.BaseBoolInt

/**
 *
 * @param member Information whether user is a member of the group
 * @param userId User ID
 */
@Serializable
data class GroupsMemberStatus (
    @SerialName("member") val member: BaseBoolInt,
    @SerialName("user_id") val userId: Long,
)
