package ru.krindra.vkkt.objects.callback

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param userId 
 * @param key 
 */
@Serializable
data class CallbackMessageAllowObject (
    @SerialName("key") val key: String,
    @SerialName("user_id") val userId: Int,
)
