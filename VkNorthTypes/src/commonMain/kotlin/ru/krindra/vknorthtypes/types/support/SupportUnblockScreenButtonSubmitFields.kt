package ru.krindra.vknorthtypes.types.support

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param type 
 * @param id 
 * @param disabled 
 * @param text Надпись на кнопке
 * @param targetScreen Индекс экрана для перехода
 */
@Serializable
data class SupportUnblockScreenButtonSubmitFields (
    @SerialName("target_screen") val targetScreen: String? = null,
    @SerialName("id") val id: Double? = null,
    @SerialName("type") val type: String,
    @SerialName("disabled") val disabled: Boolean? = null,
    @SerialName("text") val text: String? = null,
)
