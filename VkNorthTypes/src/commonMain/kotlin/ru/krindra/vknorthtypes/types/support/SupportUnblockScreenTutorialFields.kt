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
data class SupportUnblockScreenTutorialFields (
    @SerialName("questions") val questions: List<SupportUnblockScreenTutorialQuestions>? = null,
    @SerialName("target") val target: String? = null,
    @SerialName("type") val type: String,
)
