package ru.krindra.vkkt.methods

import ru.krindra.vkkt.responses.storage.*
import ru.krindra.vkkt.objects.storage.*
import ru.krindra.vkkt.utils.JsonSingleton
import kotlinx.serialization.json.Json
import ru.krindra.vkkt.responses.base.BaseOkResponse

class Storage(
    private val method: suspend (String, Map<String, Any?>?) -> String,
    private val json: Json = JsonSingleton.json
    ) {
    /**
     *
     * Returns a value of variable with the name set by key parameter.
     * 
     * @param key 
     * @param keys 
     * @param userId 
     */
    suspend fun get(key: String? = null, keys: List<String>? = null, userId: Long? = null): StorageGetResponse {
        val response = method("storage.get", mapOf("key" to key, "keys" to keys, "user_id" to userId))
        return decodeResponse(response, json)
    }

    /**
     *
     * Returns the names of all variables.
     * 
     * @param userId user id, whose variables names are returned if they were requested with a server method.
     * @param offset 
     * @param count amount of variable names the info needs to be collected from.
     */
    suspend fun getKeys(userId: Long? = null, offset: Int? = 0, count: Int? = 100): StorageGetKeysResponse {
        val response = method("storage.getKeys", mapOf("user_id" to userId, "offset" to offset, "count" to count))
        return decodeResponse(response, json)
    }

    /**
     *
     * Saves a value of variable with the name set by 'key' parameter.
     * 
     * @param key 
     * @param value 
     * @param userId 
     */
    suspend fun set(key: String, value: String? = null, userId: Long? = null): BaseOkResponse {
        val response = method("storage.set", mapOf("key" to key, "value" to value, "user_id" to userId))
        return decodeResponse(response, json)
    }

}
