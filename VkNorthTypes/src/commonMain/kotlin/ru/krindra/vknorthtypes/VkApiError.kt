package ru.krindra.vknorthtypes

import kotlinx.serialization.Serializable

@Serializable
class VkApiError(
    val code: Int,
    val description: String
): Exception("$description\ncode: $code") {
    operator fun get(code: Int): Boolean = code == this.code

    companion object {
        fun fromString(string: String): VkApiError =
            JsonSingleton.json.decodeFromString(string)
    }
}
