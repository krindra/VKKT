package ru.krindra.vkkt.methods

import ru.krindra.vkkt.responses.streaming.*
import ru.krindra.vkkt.objects.streaming.*
import ru.krindra.vkkt.utils.JsonSingleton
import kotlinx.serialization.json.Json
import ru.krindra.vkkt.responses.base.BaseOkResponse

class Streaming(
    private val method: suspend (String, Map<String, Any?>?) -> String,
    private val json: Json = JsonSingleton.json
    ) {
    /**
     *
     * Allows to receive data for the connection to Streaming API.
     * 
     */
    suspend fun getServerUrl(): StreamingGetServerUrlResponse {
        val response = method("streaming.getServerUrl", mapOf())
        return decodeResponse(response, json)
    }

    /**
     *
     */
    suspend fun getSettings(): StreamingGetSettingsResponse {
        val response = method("streaming.getSettings", mapOf())
        return decodeResponse(response, json)
    }

    /**
     *
     * @param type 
     * @param interval 
     * @param startTime 
     * @param endTime 
     */
    suspend fun getStats(type: String? = null, interval: String? = "5m", startTime: Int? = null, endTime: Int? = null): StreamingGetStatsResponse {
        val response = method("streaming.getStats", mapOf("type" to type, "interval" to interval, "start_time" to startTime, "end_time" to endTime))
        return decodeResponse(response, json)
    }

    /**
     *
     * @param word 
     */
    suspend fun getStem(word: String): StreamingGetStemResponse {
        val response = method("streaming.getStem", mapOf("word" to word))
        return decodeResponse(response, json)
    }

    /**
     *
     * @param monthlyTier 
     */
    suspend fun setSettings(monthlyTier: String? = null): BaseOkResponse {
        val response = method("streaming.setSettings", mapOf("monthly_tier" to monthlyTier))
        return decodeResponse(response, json)
    }

}
