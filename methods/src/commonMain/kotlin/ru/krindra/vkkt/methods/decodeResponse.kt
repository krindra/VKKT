package ru.krindra.vkkt.methods

import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json

@Serializable
internal class Response<T>(
    val response: T
)

internal inline fun <reified T> decodeResponse(rawResponse: String, json: Json): T {
    return json.decodeFromString<Response<T>>(rawResponse).response
}
