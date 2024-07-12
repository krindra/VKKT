package ru.krindra.vkkt.methods

import ru.krindra.vkkt.utils.JsonSingleton
import kotlinx.serialization.json.Json
import ru.krindra.vkkt.responses.base.BaseUndefinedResponse

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
