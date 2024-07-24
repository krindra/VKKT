package ru.krindra.vkkt.methods

import ru.krindra.vkkt.responses.downloadedGames.*
import ru.krindra.vkkt.utils.JsonSingleton
import kotlinx.serialization.json.Json

class Downloadedgames(
    private val method: suspend (String, Map<String, Any?>?) -> String,
    private val json: Json = JsonSingleton.json
    ) {
    /**
     *
     * @param userId 
     */
    suspend fun getPaidStatus(userId: Int? = null): DownloadedGamesPaidStatusResponse {
        val response = method("downloadedGames.getPaidStatus", mapOf("user_id" to userId))
        return decodeResponse(response, json)
    }

}
