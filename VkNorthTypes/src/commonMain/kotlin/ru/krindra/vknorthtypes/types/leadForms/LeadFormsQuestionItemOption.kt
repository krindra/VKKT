package ru.krindra.vknorthtypes.types.leadForms

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param key 
 * @param label 
 */
@Serializable
data class LeadFormsQuestionItemOption (
    @SerialName("label") val label: String,
    @SerialName("key") val key: String? = null,
)
