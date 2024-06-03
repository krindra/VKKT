package ru.krindra.vknorthtypes.types.support

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param id 
 * @param title Текст вопроса
 * @param answers 
 */
@Serializable
data class SupportUnblockScreenTutorialQuestions (
    @SerialName("id") val id: String? = null,
    @SerialName("title") val title: String? = null,
    @SerialName("answers") val answers: List<SupportUnblockScreenTutorialAnswers>? = null,
)
