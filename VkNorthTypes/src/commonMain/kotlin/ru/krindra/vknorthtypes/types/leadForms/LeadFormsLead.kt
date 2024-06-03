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
    @SerialName("date") val date: Int,
    @SerialName("lead_id") val leadId: Long,
    @SerialName("user_id") val userId: Long,
    @SerialName("ad_id") val adId: Long? = null,
    @SerialName("answers") val answers: List<LeadFormsAnswer>,
)
