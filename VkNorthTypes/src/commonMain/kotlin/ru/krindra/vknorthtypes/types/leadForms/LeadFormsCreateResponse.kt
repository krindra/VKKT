package ru.krindra.vknorthtypes.types.leadForms

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param formId 
 * @param url 
 */
@Serializable
data class LeadFormsCreateResponse (
    @SerialName("url") val url: String,
    @SerialName("form_id") val formId: Long,
)

