package ru.krindra.vknorthtypes.types.leadForms

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param formId 
 */
@Serializable
data class LeadFormsDeleteResponse (
    @SerialName("form_id") val formId: Long,
)

