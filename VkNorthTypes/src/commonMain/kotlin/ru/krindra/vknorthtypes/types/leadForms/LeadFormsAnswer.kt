package ru.krindra.vknorthtypes.types.leadForms

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param key 
 * @param answer 
 */
@Serializable
data class LeadFormsAnswer (
    @SerialName("answer") val answer: LeadFormsAnswerOneOf,
    @SerialName("key") val key: String,
)
