package ru.krindra.vknorthtypes.types.support

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param type 
 * @param id 
 * @param text Надпись на кнопке
 */
@Serializable
data class SupportUnblockScreenButtonUnblockFields (
    @SerialName("id") val id: Double? = null,
    @SerialName("type") val type: String,
    @SerialName("text") val text: String? = null,
)
