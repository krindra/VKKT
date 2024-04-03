package ru.krindra.vknorthtypes.methods

// **********
// THIS FILE IS AUTOGENERATED!!! DO NOT EDIT IT!!!
// **********


import ru.krindra.vknorthtypes.types.downloadedGames.*
import kotlinx.serialization.json.Json
import ru.krindra.vknorthtypes.JsonSingleton

class Downloadedgames(
    private val method: suspend (String, Map<String, Any?>?) -> String,
    private val json: Json = JsonSingleton.json
    ) {
    /**
     *
     * @param userId 
     */
    suspend fun getPaidStatus(userId: Long? = null): DownloadedGamesPaidStatusResponse {
        val response = method("getPaidStatus", mapOf("user_id" to userId))
        return json.decodeFromString<DownloadedGamesPaidStatusResponse>(response)
    }

}
