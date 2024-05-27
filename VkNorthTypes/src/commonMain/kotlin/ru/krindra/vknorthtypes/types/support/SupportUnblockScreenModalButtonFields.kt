package ru.krindra.vknorthtypes.types.support

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param id 
 * @param type 
 * @param label Надпись на кнопке
 * @param modal 
 */
@Serializable
data class SupportUnblockScreenModalButtonFields (
    @SerialName("modal") val modal: SupportUnblockScreenModalButtonModalContent? = null,
    @SerialName("label") val label: String? = null,
    @SerialName("id") val id: Double? = null,
    @SerialName("type") val type: String,
)
