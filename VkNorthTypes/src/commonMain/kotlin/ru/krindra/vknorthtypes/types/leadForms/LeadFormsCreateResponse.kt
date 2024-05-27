package ru.krindra.vknorthtypes.types.leadForms

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param formId 
 * @param url 
 */
@Serializable
data class LeadFormsCreateResponse (
    @SerialName("form_id") val formId: Long,
    @SerialName("url") val url: String,
)

