package ru.krindra.vknorthtypes.methods

import ru.krindra.vknorthtypes.types.calls.*
import kotlinx.serialization.json.Json
import ru.krindra.vknorthtypes.JsonSingleton
import ru.krindra.vknorthtypes.types.base.BaseOkResponse

class Calls(
    private val method: suspend (String, Map<String, Any?>?) -> String,
    private val json: Json = JsonSingleton.json
    ) {
    /**
     *
     * @param callId 
     */
    suspend fun forceFinish(callId: String): BaseOkResponse {
        val response = method("calls.forceFinish", mapOf("call_id" to callId))
        return decodeResponse(response, json)
    }

    /**
     *
     * @param groupId 
     */
    suspend fun start(groupId: Long? = 0): CallsStartResponse {
        val response = method("calls.start", mapOf("group_id" to groupId))
        return decodeResponse(response, json)
    }

}
