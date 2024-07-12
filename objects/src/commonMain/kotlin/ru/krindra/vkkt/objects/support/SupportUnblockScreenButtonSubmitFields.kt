package ru.krindra.vkkt.objects.support

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
    @SerialName("type") val type: String,
    @SerialName("id") val id: Double? = null,
    @SerialName("text") val text: String? = null,
    @SerialName("disabled") val disabled: Boolean? = null,
    @SerialName("target_screen") val targetScreen: String? = null,
)
