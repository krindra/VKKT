package ru.krindra.vknorthtypes.methods

import ru.krindra.vknorthtypes.types.bugtracker.*
import kotlinx.serialization.json.Json
import ru.krindra.vknorthtypes.JsonSingleton
import ru.krindra.vknorthtypes.types.base.BaseGetUploadServerResponse
import ru.krindra.vknorthtypes.types.base.BaseOkResponse
import ru.krindra.vknorthtypes.types.base.BaseUserGroupFields
import ru.krindra.vknorthtypes.types.base.BaseBoolResponse

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
    suspend fun addCompanyGroupsMembers(companyId: Long, userIds: List<Int>, companyGroupIds: List<Int>): BugtrackerAddCompanyGroupsMembersResponse {
        val response = method("bugtracker.addCompanyGroupsMembers", mapOf("company_id" to companyId, "user_ids" to userIds, "company_group_ids" to companyGroupIds))
        return decodeResponse(response, json)
    }

    /**
     *
     * @param userIds 
     * @param companyId 
     */
    suspend fun addCompanyMembers(userIds: List<Int>, companyId: Long): BugtrackerAddCompanyMembersResponse {
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
    suspend fun changeBugreportStatus(bugreportId: Long, status: Int? = null, comment: String? = null, fromStatuses: List<Int>? = null, notInStatuses: List<Int>? = null): BaseBoolResponse {
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
    suspend fun createComment(bugreportId: Long, text: String? = null, hidden: Boolean? = false, force: Boolean? = false): BugtrackerCreateCommentResponse {
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
    suspend fun getCompanyGroupMembers(companyId: Long, companyGroupId: Long, count: Int? = 10, offset: Int? = 0, filterName: String? = "", extended: Boolean? = false, fields: List<BaseUserGroupFields>? = null): BugtrackerGetCompanyGroupMembersResponse {
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
    suspend fun getCompanyMembers(companyId: Long, count: Int? = 10, offset: Int? = 0, filterName: String? = "", filterRole: Int? = null, filterNotGroup: Int? = 0, filterMemberIds: List<Int>? = listOf(), extended: Boolean? = false, fields: List<BaseUserGroupFields>? = null, extra: Boolean? = false): BugtrackerGetCompanyMembersResponse {
        val response = method("bugtracker.getCompanyMembers", mapOf("company_id" to companyId, "count" to count, "offset" to offset, "filter_name" to filterName, "filter_role" to filterRole, "filter_not_group" to filterNotGroup, "filter_member_ids" to filterMemberIds, "extended" to extended, "fields" to fields, "extra" to extra))
        return decodeResponse(response, json)
    }

    /**
     *
     * @param productId 
     * @param versionId 
     * @param ttl 
     */
    suspend fun getDownloadVersionUrl(productId: Long, versionId: Long, ttl: Int? = 600): BugtrackerGetDownloadVersionUrlResponse {
        val response = method("bugtracker.getDownloadVersionUrl", mapOf("product_id" to productId, "version_id" to versionId, "ttl" to ttl))
        return decodeResponse(response, json)
    }

    /**
     *
     * @param productId 
     */
    suspend fun getProductBuildUploadServer(productId: Long): BaseGetUploadServerResponse {
        val response = method("bugtracker.getProductBuildUploadServer", mapOf("product_id" to productId))
        return decodeResponse(response, json)
    }

    /**
     *
     * @param companyId 
     * @param userId 
     * @param companyGroupId 
     */
    suspend fun removeCompanyGroupMember(companyId: Long, userId: Long, companyGroupId: Long): BaseOkResponse {
        val response = method("bugtracker.removeCompanyGroupMember", mapOf("company_id" to companyId, "user_id" to userId, "company_group_id" to companyGroupId))
        return decodeResponse(response, json)
    }

    /**
     *
     * @param userId 
     * @param companyId 
     */
    suspend fun removeCompanyMember(userId: Long, companyId: Long): BaseOkResponse {
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
    suspend fun saveProductVersion(title: String, productId: Long? = null, versionId: Long? = 0, releaseNotes: String? = null, visible: Boolean? = false, setRft: Boolean? = false): BaseOkResponse {
        val response = method("bugtracker.saveProductVersion", mapOf("product_id" to productId, "version_id" to versionId, "title" to title, "release_notes" to releaseNotes, "visible" to visible, "set_rft" to setRft))
        return decodeResponse(response, json)
    }

    /**
     *
     * @param userId 
     * @param companyId 
     * @param role 
     */
    suspend fun setCompanyMemberRole(userId: Long, companyId: Long, role: Int): BaseOkResponse {
        val response = method("bugtracker.setCompanyMemberRole", mapOf("user_id" to userId, "company_id" to companyId, "role" to role))
        return decodeResponse(response, json)
    }

    /**
     *
     * @param productId 
     * @param isOver 
     */
    suspend fun setProductIsOver(productId: Long, isOver: Boolean? = false): BaseOkResponse {
        val response = method("bugtracker.setProductIsOver", mapOf("product_id" to productId, "is_over" to isOver))
        return decodeResponse(response, json)
    }

}
