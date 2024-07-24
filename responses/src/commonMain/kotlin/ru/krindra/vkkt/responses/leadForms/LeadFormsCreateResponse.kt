package ru.krindra.vkkt.responses.leadForms

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.leadForms.*

/**
 * @param formId 
 * @param url 
 */
@Serializable
data class LeadFormsCreateResponse (
    @SerialName("url") val url: String,
    @SerialName("form_id") val formId: Int,
)

