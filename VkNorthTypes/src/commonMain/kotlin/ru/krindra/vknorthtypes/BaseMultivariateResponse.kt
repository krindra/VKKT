package ru.krindra.vknorthtypes

import kotlinx.serialization.KSerializer
import kotlinx.serialization.json.Json

open class BaseMultivariateResponse(private val json: Json) {
    /**
     * Returns [T] or null on serialization error
     *
     * @param kSerializer Serializer [T]
     * @param rawResponse Raw JSON string
     */
    protected fun <T> getResponse(kSerializer: KSerializer<T>, rawResponse: String): T? {
        return try {
            json.decodeFromString(kSerializer, rawResponse)
        } catch (e: Exception) {
            null
        }
    }
}
