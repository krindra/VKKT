package ru.krindra.vkkt.objects.secure

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.base.BaseBoolInt

/**
 *
 * @param id User ID
 * @param result 
 */
@Serializable
data class SecureSetCounterItem (
    @SerialName("id") val id: Int,
    @SerialName("result") val result: BaseBoolInt,
)
