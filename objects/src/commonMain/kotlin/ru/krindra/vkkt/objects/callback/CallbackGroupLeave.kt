package ru.krindra.vkkt.objects.callback

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.base.BaseBoolInt

/**
 *
 * @param userId 
 * @param self 
 */
@Serializable
data class CallbackGroupLeave (
    @SerialName("user_id") val userId: Int? = null,
    @SerialName("self") val self: BaseBoolInt? = null,
)
