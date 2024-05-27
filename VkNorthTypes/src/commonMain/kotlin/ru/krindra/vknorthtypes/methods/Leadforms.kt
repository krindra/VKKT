package ru.krindra.vknorthtypes.methods

import ru.krindra.vknorthtypes.types.leadForms.*
import kotlinx.serialization.json.Json
import ru.krindra.vknorthtypes.JsonSingleton

class Leadforms(
    private val method: suspend (String, Map<String, Any?>?) -> String,
    private val json: Json = JsonSingleton.json
    ) {
    /**
     *
     * @param groupId 
     * @param name 
     * @param title 
     * @param description 
     * @param questions 
     * @param policyLinkUrl 
     * @param photo 
     * @param confirmation 
     * @param siteLinkUrl 
     * @param active 
     * @param oncePerUser 
     * @param pixelCode 
     * @param notifyAdmins 
     * @param notifyEmails 
     */
    suspend fun create(groupId: Long, name: String, title: String, description: String, questions: String, policyLinkUrl: String, photo: String? = null, confirmation: String? = null, siteLinkUrl: String? = null, active: Boolean? = false, oncePerUser: Boolean? = false, pixelCode: String? = null, notifyAdmins: List<Int>? = null, notifyEmails: List<String>? = null): LeadFormsCreateResponse {
        val response = method("leadForms.create", mapOf("group_id" to groupId, "name" to name, "title" to title, "description" to description, "questions" to questions, "policy_link_url" to policyLinkUrl, "photo" to photo, "confirmation" to confirmation, "site_link_url" to siteLinkUrl, "active" to active, "once_per_user" to oncePerUser, "pixel_code" to pixelCode, "notify_admins" to notifyAdmins, "notify_emails" to notifyEmails))
        return decodeResponse(response, json)
    }

    /**
     *
     * @param groupId 
     * @param formId 
     */
    suspend fun delete(groupId: Long, formId: Long): LeadFormsDeleteResponse {
        val response = method("leadForms.delete", mapOf("group_id" to groupId, "form_id" to formId))
        return decodeResponse(response, json)
    }

    /**
     *
     * @param groupId 
     * @param formId 
     */
    suspend fun get(groupId: Long, formId: Long): LeadFormsGetResponse {
        val response = method("leadForms.get", mapOf("group_id" to groupId, "form_id" to formId))
        return decodeResponse(response, json)
    }

    /**
     *
     * @param groupId 
     * @param formId 
     * @param limit 
     * @param nextPageToken 
     */
    suspend fun getLeads(groupId: Long, formId: Long, limit: Int? = 10, nextPageToken: String? = null): LeadFormsGetLeadsResponse {
        val response = method("leadForms.getLeads", mapOf("group_id" to groupId, "form_id" to formId, "limit" to limit, "next_page_token" to nextPageToken))
        return decodeResponse(response, json)
    }

    /**
     *
     */
    suspend fun getUploadURL(): LeadFormsUploadUrlResponse {
        val response = method("leadForms.getUploadURL", mapOf())
        return decodeResponse(response, json)
    }

    /**
     *
     * @param groupId 
     */
    suspend fun list(groupId: Long): LeadFormsListResponse {
        val response = method("leadForms.list", mapOf("group_id" to groupId))
        return decodeResponse(response, json)
    }

    /**
     *
     * @param groupId 
     * @param formId 
     * @param name 
     * @param title 
     * @param description 
     * @param questions 
     * @param policyLinkUrl 
     * @param photo 
     * @param confirmation 
     * @param siteLinkUrl 
     * @param active 
     * @param oncePerUser 
     * @param pixelCode 
     * @param notifyAdmins 
     * @param notifyEmails 
     */
    suspend fun update(groupId: Long, formId: Long, name: String, title: String, description: String, questions: String, policyLinkUrl: String, photo: String? = null, confirmation: String? = null, siteLinkUrl: String? = null, active: Boolean? = false, oncePerUser: Boolean? = false, pixelCode: String? = null, notifyAdmins: List<Int>? = null, notifyEmails: List<String>? = null): LeadFormsCreateResponse {
        val response = method("leadForms.update", mapOf("group_id" to groupId, "form_id" to formId, "name" to name, "title" to title, "description" to description, "questions" to questions, "policy_link_url" to policyLinkUrl, "photo" to photo, "confirmation" to confirmation, "site_link_url" to siteLinkUrl, "active" to active, "once_per_user" to oncePerUser, "pixel_code" to pixelCode, "notify_admins" to notifyAdmins, "notify_emails" to notifyEmails))
        return decodeResponse(response, json)
    }

}
