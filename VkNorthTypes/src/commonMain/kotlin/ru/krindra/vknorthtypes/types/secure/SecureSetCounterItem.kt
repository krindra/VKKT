package ru.krindra.vknorthtypes.types.secure

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.base.BaseBoolInt

/**
 *
 * @param id User ID
 * @param result 
 */
@Serializable
data class SecureSetCounterItem (
    @SerialName("id") val id: Long,
    @SerialName("result") val result: BaseBoolInt,
)
