package ru.krindra.vkkt.objects

import ru.krindra.vkkt.utils.JsonSingleton
import kotlinx.serialization.Serializable

/**
 * VK API error exception class
 *
 * @param code error code
 * @param description description of the error
 */
@Serializable
class VkApiError(
    val code: Int,
    val description: String
): Exception("$description\ncode: $code") {
    companion object {
        /**
         * VkApiError from string
         *
         * @param string raw json string
         */
        fun fromString(string: String): VkApiError =
            JsonSingleton.json.decodeFromString(string)
    }
}
