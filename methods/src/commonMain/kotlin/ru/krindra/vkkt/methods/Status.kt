package ru.krindra.vkkt.methods

import ru.krindra.vkkt.responses.status.*
import ru.krindra.vkkt.objects.status.*
import ru.krindra.vkkt.utils.JsonSingleton
import kotlinx.serialization.json.Json
import ru.krindra.vkkt.responses.base.BaseOkResponse

class Status(
    private val method: suspend (String, Map<String, Any?>?) -> String,
    private val json: Json = JsonSingleton.json
    ) {
    /**
     *
     * Returns data required to show the status of a user or community.
     * 
     * @param userId User ID or community ID. Use a negative value to designate a community ID.
     * @param groupId 
     */
    suspend fun get(userId: Long? = null, groupId: Long? = null): StatusGetResponse {
        val response = method("status.get", mapOf("user_id" to userId, "group_id" to groupId))
        return decodeResponse(response, json)
    }

    /**
     *
     * Sets a new status for the current user.
     * 
     * @param text Text of the new status.
     * @param groupId Identifier of a community to set a status in. If left blank the status is set to current user.
     */
    suspend fun set(text: String? = null, groupId: Long? = null): BaseOkResponse {
        val response = method("status.set", mapOf("text" to text, "group_id" to groupId))
        return decodeResponse(response, json)
    }

}
