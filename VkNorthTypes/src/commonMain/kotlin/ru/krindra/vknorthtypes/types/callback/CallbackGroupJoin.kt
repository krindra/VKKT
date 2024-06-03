package ru.krindra.vknorthtypes.types.callback

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param userId 
 * @param joinType 
 */
@Serializable
data class CallbackGroupJoin (
    @SerialName("user_id") val userId: Long,
    @SerialName("join_type") val joinType: CallbackGroupJoinType,
)
