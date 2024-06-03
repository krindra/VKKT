package ru.krindra.vknorthtypes.types.support

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param id 
 * @param type 
 * @param text Надпись на кнопке
 */
@Serializable
data class SupportUnblockScreenButtonFields (
    @SerialName("type") val type: String,
    @SerialName("id") val id: Double? = null,
    @SerialName("text") val text: String? = null,
)
