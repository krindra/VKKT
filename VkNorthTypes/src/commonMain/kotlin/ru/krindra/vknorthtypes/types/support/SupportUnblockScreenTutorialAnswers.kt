package ru.krindra.vknorthtypes.types.support

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param id 
 * @param title Текст ответа
 * @param isRight Является ли вариант ответа правильным
 * @param explanation Текст, который отображается при выборе этого варианта
 */
@Serializable
data class SupportUnblockScreenTutorialAnswers (
    @SerialName("title") val title: String? = null,
    @SerialName("explanation") val explanation: String? = null,
    @SerialName("id") val id: String? = null,
    @SerialName("is_right") val isRight: Boolean? = null,
)
