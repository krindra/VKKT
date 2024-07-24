package ru.krindra.vkkt.methods

import ru.krindra.vkkt.responses.bugtracker.*
import ru.krindra.vkkt.objects.bugtracker.*
import ru.krindra.vkkt.utils.JsonSingleton
import kotlinx.serialization.json.Json
import ru.krindra.vkkt.responses.base.BaseOkResponse
import ru.krindra.vkkt.responses.base.BaseBoolResponse
import ru.krindra.vkkt.objects.base.BaseUserGroupFields
import ru.krindra.vkkt.responses.base.BaseGetUploadServerResponse

class Bugtracker(
    private val method: suspend (String, Map<String, Any?>?) -> String,
    private val json: Json = JsonSingleton.json
    ) {
    /**
     *
     * @param companyId 
     * @param userIds 
     * @param companyGroupIds 
     */
    suspend fun addCompanyGroupsMembers(companyId: Int, userIds: List<Int>, companyGroupIds: List<Int>): BugtrackerAddCompanyGroupsMembersResponse {
        val response = method("bugtracker.addCompanyGroupsMembers", mapOf("company_id" to companyId, "user_ids" to userIds, "company_group_ids" to companyGroupIds))
        return decodeResponse(response, json)
    }

    /**
     *
     * @param userIds 
     * @param companyId 
     */
    suspend fun addCompanyMembers(userIds: List<Int>, companyId: Int): BugtrackerAddCompanyMembersResponse {
        val response = method("bugtracker.addCompanyMembers", mapOf("user_ids" to userIds, "company_id" to companyId))
        return decodeResponse(response, json)
    }

    /**
     *
     * @param bugreportId 
     * @param status 
     * @param comment 
     * @param fromStatuses 
     * @param notInStatuses 
     */
    suspend fun changeBugreportStatus(bugreportId: Int, status: Int? = null, comment: String? = null, fromStatuses: List<Int>? = null, notInStatuses: List<Int>? = null): BaseBoolResponse {
        val response = method("bugtracker.changeBugreportStatus", mapOf("bugreport_id" to bugreportId, "status" to status, "comment" to comment, "from_statuses" to fromStatuses, "not_in_statuses" to notInStatuses))
        return decodeResponse(response, json)
    }

    /**
     *
     * Creates the comment to bugreport
     * 
     * @param bugreportId 
     * @param text 
     * @param hidden 
     * @param force 
     */
    suspend fun createComment(bugreportId: Int, text: String? = null, hidden: Boolean? = false, force: Boolean? = false): BugtrackerCreateCommentResponse {
        val response = method("bugtracker.createComment", mapOf("bugreport_id" to bugreportId, "text" to text, "hidden" to hidden, "force" to force))
        return decodeResponse(response, json)
    }

    /**
     *
     * @param companyId 
     * @param companyGroupId 
     * @param count 
     * @param offset 
     * @param filterName 
     * @param extended 
     * @param fields 
     */
    suspend fun getCompanyGroupMembers(companyId: Int, companyGroupId: Int, count: Int? = 10, offset: Int? = 0, filterName: String? = "", extended: Boolean? = false, fields: List<BaseUserGroupFields>? = null): BugtrackerGetCompanyGroupMembersResponse {
        val response = method("bugtracker.getCompanyGroupMembers", mapOf("company_id" to companyId, "company_group_id" to companyGroupId, "count" to count, "offset" to offset, "filter_name" to filterName, "extended" to extended, "fields" to fields))
        return decodeResponse(response, json)
    }

    /**
     *
     * @param companyId 
     * @param count 
     * @param offset 
     * @param filterName 
     * @param filterRole 
     * @param filterNotGroup 
     * @param filterMemberIds 
     * @param extended 
     * @param fields 
     * @param extra 
     */
    suspend fun getCompanyMembers(companyId: Int, count: Int? = 10, offset: Int? = 0, filterName: String? = "", filterRole: Int? = null, filterNotGroup: Int? = 0, filterMemberIds: List<Int>? = listOf(), extended: Boolean? = false, fields: List<BaseUserGroupFields>? = null, extra: Boolean? = false): BugtrackerGetCompanyMembersResponse {
        val response = method("bugtracker.getCompanyMembers", mapOf("company_id" to companyId, "count" to count, "offset" to offset, "filter_name" to filterName, "filter_role" to filterRole, "filter_not_group" to filterNotGroup, "filter_member_ids" to filterMemberIds, "extended" to extended, "fields" to fields, "extra" to extra))
        return decodeResponse(response, json)
    }

    /**
     *
     * @param productId 
     * @param versionId 
     * @param ttl 
     */
    suspend fun getDownloadVersionUrl(productId: Int, versionId: Int, ttl: Int? = 600): BugtrackerGetDownloadVersionUrlResponse {
        val response = method("bugtracker.getDownloadVersionUrl", mapOf("product_id" to productId, "version_id" to versionId, "ttl" to ttl))
        return decodeResponse(response, json)
    }

    /**
     *
     * @param productId 
     */
    suspend fun getProductBuildUploadServer(productId: Int): BaseGetUploadServerResponse {
        val response = method("bugtracker.getProductBuildUploadServer", mapOf("product_id" to productId))
        return decodeResponse(response, json)
    }

    /**
     *
     * @param companyId 
     * @param userId 
     * @param companyGroupId 
     */
    suspend fun removeCompanyGroupMember(companyId: Int, userId: Int, companyGroupId: Int): BaseOkResponse {
        val response = method("bugtracker.removeCompanyGroupMember", mapOf("company_id" to companyId, "user_id" to userId, "company_group_id" to companyGroupId))
        return decodeResponse(response, json)
    }

    /**
     *
     * @param userId 
     * @param companyId 
     */
    suspend fun removeCompanyMember(userId: Int, companyId: Int): BaseOkResponse {
        val response = method("bugtracker.removeCompanyMember", mapOf("user_id" to userId, "company_id" to companyId))
        return decodeResponse(response, json)
    }

    /**
     *
     * @param productId 
     * @param versionId 
     * @param title 
     * @param releaseNotes 
     * @param visible 
     * @param setRft 
     */
    suspend fun saveProductVersion(title: String, productId: Int? = null, versionId: Int? = 0, releaseNotes: String? = null, visible: Boolean? = false, setRft: Boolean? = false): BaseOkResponse {
        val response = method("bugtracker.saveProductVersion", mapOf("product_id" to productId, "version_id" to versionId, "title" to title, "release_notes" to releaseNotes, "visible" to visible, "set_rft" to setRft))
        return decodeResponse(response, json)
    }

    /**
     *
     * @param userId 
     * @param companyId 
     * @param role 
     */
    suspend fun setCompanyMemberRole(userId: Int, companyId: Int, role: Int): BaseOkResponse {
        val response = method("bugtracker.setCompanyMemberRole", mapOf("user_id" to userId, "company_id" to companyId, "role" to role))
        return decodeResponse(response, json)
    }

    /**
     *
     * @param productId 
     * @param isOver 
     */
    suspend fun setProductIsOver(productId: Int, isOver: Boolean? = false): BaseOkResponse {
        val response = method("bugtracker.setProductIsOver", mapOf("product_id" to productId, "is_over" to isOver))
        return decodeResponse(response, json)
    }

}
