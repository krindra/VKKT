package ru.krindra.vknorthtypes.methods

// **********
// THIS FILE IS AUTOGENERATED!!! DO NOT EDIT IT!!!
// **********


import ru.krindra.vknorthtypes.types.streaming.*
import kotlinx.serialization.json.Json
import ru.krindra.vknorthtypes.JsonSingleton
import ru.krindra.vknorthtypes.types.base.BaseOkResponse

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
        val response = method("getServerUrl", mapOf())
        return json.decodeFromString<StreamingGetServerUrlResponse>(response)
    }

    /**
     *
     */
    suspend fun getSettings(): StreamingGetSettingsResponse {
        val response = method("getSettings", mapOf())
        return json.decodeFromString<StreamingGetSettingsResponse>(response)
    }

    /**
     *
     * @param type 
     * @param interval 
     * @param startTime 
     * @param endTime 
     */
    suspend fun getStats(type: String? = null, interval: String? = "5m", startTime: Int? = null, endTime: Int? = null): StreamingGetStatsResponse {
        val response = method("getStats", mapOf("type" to type, "interval" to interval, "start_time" to startTime, "end_time" to endTime))
        return json.decodeFromString<StreamingGetStatsResponse>(response)
    }

    /**
     *
     * @param word 
     */
    suspend fun getStem(word: String): StreamingGetStemResponse {
        val response = method("getStem", mapOf("word" to word))
        return json.decodeFromString<StreamingGetStemResponse>(response)
    }

    /**
     *
     * @param monthlyTier 
     */
    suspend fun setSettings(monthlyTier: String? = null): BaseOkResponse {
        val response = method("setSettings", mapOf("monthly_tier" to monthlyTier))
        return json.decodeFromString<BaseOkResponse>(response)
    }

}
