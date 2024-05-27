package ru.krindra.vknorthtypes.types.callback

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param userId 
 */
@Serializable
data class CallbackDonutSubscriptionExpired (
    @SerialName("user_id") val userId: Long? = null,
)
