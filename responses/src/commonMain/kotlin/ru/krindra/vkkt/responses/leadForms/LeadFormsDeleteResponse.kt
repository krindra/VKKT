package ru.krindra.vkkt.responses.leadForms

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.leadForms.*

/**
 * @param formId 
 */
@Serializable
data class LeadFormsDeleteResponse (
    @SerialName("form_id") val formId: Int,
)

