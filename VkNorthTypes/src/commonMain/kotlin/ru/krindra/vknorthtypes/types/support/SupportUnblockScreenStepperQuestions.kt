package ru.krindra.vknorthtypes.types.support

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param title Текст вопроса
 * @param yesDesc Текст, отображаемый при нажатии на да
 * @param noDesc Текст, отображаемый при нажатии на нет
 * @param targetScreen Экран, на который происходит переход; обычно содержимое другого экрана - просто заголовок с текстом и кнопкой
 * @param step 
 */
@Serializable
data class SupportUnblockScreenStepperQuestions (
    @SerialName("title") val title: String,
    @SerialName("step") val step: Double? = null,
    @SerialName("no_desc") val noDesc: String? = null,
    @SerialName("yes_desc") val yesDesc: String? = null,
    @SerialName("target_screen") val targetScreen: String,
)
