package ru.krindra.vknorthtypes.methods

import kotlinx.serialization.json.Json
import ru.krindra.vknorthtypes.JsonSingleton
import ru.krindra.vknorthtypes.types.base.BaseUndefinedResponse

class Execute(
    private val method: suspend (String, Map<String, Any?>?) -> String,
    private val json: Json = JsonSingleton.json
    ) {
    /**
     *
     */
    suspend fun execute(): BaseUndefinedResponse {
        val response = method("execute", mapOf())
        return decodeResponse(response, json)
    }

}
