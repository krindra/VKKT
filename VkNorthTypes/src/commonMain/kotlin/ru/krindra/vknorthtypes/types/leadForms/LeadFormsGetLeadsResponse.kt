package ru.krindra.vknorthtypes.types.leadForms

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param leads 
 * @param nextPageToken 
 */
@Serializable
data class LeadFormsGetLeadsResponse (
    @SerialName("leads") val leads: List<LeadFormsLead>,
    @SerialName("next_page_token") val nextPageToken: String? = null,
)

