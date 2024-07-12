package ru.krindra.vkkt.objects.support

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
    @SerialName("type") val type: String,
    @SerialName("id") val id: Double? = null,
    @SerialName("text") val text: String? = null,
)
