package ru.krindra.vknorthtypes.types.leadForms

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param key 
 * @param type 
 * @param label 
 * @param options Опции выбора для типов radio, checkbox, select
 */
@Serializable
data class LeadFormsQuestionItem (
    @SerialName("options") val options: List<LeadFormsQuestionItemOption>? = null,
    @SerialName("label") val label: String? = null,
    @SerialName("type") val type: String,
    @SerialName("key") val key: String,
)
