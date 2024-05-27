package ru.krindra.vknorthtypes.types.leadForms

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
    @SerialName("lead_id") val leadId: Long,
    @SerialName("ad_id") val adId: Long? = null,
    @SerialName("date") val date: Int,
    @SerialName("user_id") val userId: Long,
    @SerialName("answers") val answers: List<LeadFormsAnswer>,
)
