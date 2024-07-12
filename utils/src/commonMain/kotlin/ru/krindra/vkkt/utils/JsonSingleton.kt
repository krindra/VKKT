package ru.krindra.vkkt.utils

import kotlinx.serialization.json.Json

/**
 * Json singleton
 *
 * @property json customized Json
 */
object JsonSingleton {
    val json = Json {
        ignoreUnknownKeys = true
        prettyPrint = true
    }
}
