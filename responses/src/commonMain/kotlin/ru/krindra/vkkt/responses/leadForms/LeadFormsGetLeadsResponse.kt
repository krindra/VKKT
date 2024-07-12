package ru.krindra.vkkt.responses.leadForms

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.leadForms.*

/**
 * @param leads 
 * @param nextPageToken 
 */
@Serializable
data class LeadFormsGetLeadsResponse (
    @SerialName("leads") val leads: List<LeadFormsLead>,
    @SerialName("next_page_token") val nextPageToken: String? = null,
)

