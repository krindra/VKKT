package ru.krindra.vknorthtypes.types.callback

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param userId 
 */
@Serializable
data class CallbackDonutSubscriptionCancelled (
    @SerialName("user_id") val userId: Long? = null,
)
