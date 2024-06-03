package ru.krindra.vknorthtypes.types.support

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param type 
 * @param id 
 * @param text 
 */
@Serializable
data class SupportUnblockScreenButtonSupportFields (
    @SerialName("type") val type: String,
    @SerialName("id") val id: Double? = null,
    @SerialName("text") val text: String? = null,
)
