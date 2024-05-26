package ru.krindra.vknorthtypes

import kotlinx.serialization.json.Json

/**
 * Json singleton
 *
 * @property json customized Json
 */
internal object JsonSingleton {
    val json = Json {
        ignoreUnknownKeys = true
        prettyPrint = true
    }
}
