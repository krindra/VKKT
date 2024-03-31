package ru.krindra.vknorthtypes

import kotlinx.serialization.json.Json

internal object JsonSingleton {
    val json = Json {
        ignoreUnknownKeys = true
        prettyPrint = true
    }
}
