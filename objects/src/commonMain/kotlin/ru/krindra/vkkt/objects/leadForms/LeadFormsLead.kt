package ru.krindra.vkkt.objects.leadForms

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param leadId 
 * @param userId 
 * @param date 
 * @param answers 
 * @param adId 
 */
@Serializable
data class LeadFormsLead (
    @SerialName("date") val date: Int,
    @SerialName("lead_id") val leadId: Int,
    @SerialName("user_id") val userId: Int,
    @SerialName("ad_id") val adId: Int? = null,
    @SerialName("answers") val answers: List<LeadFormsAnswer>,
)
