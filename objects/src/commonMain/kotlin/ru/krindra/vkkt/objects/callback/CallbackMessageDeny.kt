package ru.krindra.vkkt.objects.callback

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param userId 
 */
@Serializable
data class CallbackMessageDeny (
    @SerialName("user_id") val userId: Int,
)
