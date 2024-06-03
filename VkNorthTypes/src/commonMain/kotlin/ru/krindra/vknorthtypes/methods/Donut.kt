package ru.krindra.vknorthtypes.methods

import ru.krindra.vknorthtypes.types.donut.*
import kotlinx.serialization.json.Json
import ru.krindra.vknorthtypes.JsonSingleton
import ru.krindra.vknorthtypes.types.base.BaseBoolResponse
import ru.krindra.vknorthtypes.types.base.BaseUserGroupFields
import ru.krindra.vknorthtypes.types.groups.GroupsGetMembersFieldsResponse

class Donut(
    private val method: suspend (String, Map<String, Any?>?) -> String,
    private val json: Json = JsonSingleton.json
    ) {
    /**
     *
     * @param ownerId 
     * @param offset 
     * @param count 
     * @param fields 
     */
    suspend fun getFriends(ownerId: Long, offset: Int? = 0, count: Int? = 10, fields: List<String>? = null): GroupsGetMembersFieldsResponse {
        val response = method("donut.getFriends", mapOf("owner_id" to ownerId, "offset" to offset, "count" to count, "fields" to fields))
        return decodeResponse(response, json)
    }

    /**
     *
     * @param ownerId 
     */
    suspend fun getSubscription(ownerId: Long): DonutGetSubscriptionResponse {
        val response = method("donut.getSubscription", mapOf("owner_id" to ownerId))
        return decodeResponse(response, json)
    }

    /**
     *
     * Returns a list of user's VK Donut subscriptions.
     * 
     * @param fields 
     * @param offset 
     * @param count 
     */
    suspend fun getSubscriptions(fields: List<BaseUserGroupFields>? = null, offset: Int? = 0, count: Int? = 10): DonutGetSubscriptionsResponse {
        val response = method("donut.getSubscriptions", mapOf("fields" to fields, "offset" to offset, "count" to count))
        return decodeResponse(response, json)
    }

    /**
     *
     * @param ownerId 
     */
    suspend fun isDon(ownerId: Long): BaseBoolResponse {
        val response = method("donut.isDon", mapOf("owner_id" to ownerId))
        return decodeResponse(response, json)
    }

}
