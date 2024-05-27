package ru.krindra.vknorthtypes.types.support

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param type 
 * @param target Экран, на который происходит переход после ответа на все вопросы
 * @param questions 
 */
@Serializable
data class SupportUnblockScreenStepperFields (
    @SerialName("questions") val questions: List<SupportUnblockScreenStepperQuestions>? = null,
    @SerialName("target") val target: String? = null,
    @SerialName("type") val type: String,
)
