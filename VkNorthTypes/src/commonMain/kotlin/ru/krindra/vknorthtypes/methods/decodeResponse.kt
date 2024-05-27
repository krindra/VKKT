package ru.krindra.vknorthtypes.methods

import kotlinx.serialization.json.Json

internal inline fun <reified T> decodeResponse(rawResponse: String, json: Json): T {
    return json.decodeFromString<T>(
        with(rawResponse) {
            substring(12..<length - 1)
        }
    )
}