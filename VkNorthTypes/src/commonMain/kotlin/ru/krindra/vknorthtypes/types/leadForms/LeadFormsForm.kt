package ru.krindra.vknorthtypes.types.leadForms

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.base.BaseBoolInt

/**
 *
 * @param formId 
 * @param groupId 
 * @param photo 
 * @param name 
 * @param title 
 * @param description 
 * @param confirmation 
 * @param siteLinkUrl 
 * @param policyLinkUrl 
 * @param questions 
 * @param active 
 * @param leadsCount 
 * @param pixelCode 
 * @param oncePerUser 
 * @param notifyAdmins 
 * @param notifyEmails 
 * @param url 
 */
@Serializable
data class LeadFormsForm (
    @SerialName("url") val url: String,
    @SerialName("form_id") val formId: Long,
    @SerialName("group_id") val groupId: Long,
    @SerialName("name") val name: String? = null,
    @SerialName("leads_count") val leadsCount: Int,
    @SerialName("photo") val photo: String? = null,
    @SerialName("title") val title: String? = null,
    @SerialName("active") val active: BaseBoolInt? = null,
    @SerialName("pixel_code") val pixelCode: String? = null,
    @SerialName("once_per_user") val oncePerUser: Int? = null,
    @SerialName("description") val description: String? = null,
    @SerialName("confirmation") val confirmation: String? = null,
    @SerialName("site_link_url") val siteLinkUrl: String? = null,
    @SerialName("notify_admins") val notifyAdmins: String? = null,
    @SerialName("notify_emails") val notifyEmails: String? = null,
    @SerialName("policy_link_url") val policyLinkUrl: String? = null,
    @SerialName("questions") val questions: List<LeadFormsQuestionItem>? = null,
)
