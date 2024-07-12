package ru.krindra.vkkt.methods

import ru.krindra.vkkt.responses.auth.*
import ru.krindra.vkkt.utils.JsonSingleton
import kotlinx.serialization.json.Json

class Auth(
    private val method: suspend (String, Map<String, Any?>?) -> String,
    private val json: Json = JsonSingleton.json
    ) {
    /**
     *
     * Allows to restore account access using a code received via SMS. " This method is only available for apps with [vk.com/dev/auth_direct|Direct authorization] access. "
     * 
     * @param phone User phone number.
     * @param lastName User last name.
     */
    suspend fun restore(phone: String, lastName: String): AuthRestoreResponse {
        val response = method("auth.restore", mapOf("phone" to phone, "last_name" to lastName))
        return decodeResponse(response, json)
    }

}
