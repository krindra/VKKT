package ru.krindra.vkkt.methods

import ru.krindra.vkkt.responses.podcasts.*
import ru.krindra.vkkt.utils.JsonSingleton
import kotlinx.serialization.json.Json

class Podcasts(
    private val method: suspend (String, Map<String, Any?>?) -> String,
    private val json: Json = JsonSingleton.json
    ) {
    /**
     *
     * @param searchString 
     * @param offset 
     * @param count 
     */
    suspend fun searchPodcast(searchString: String, offset: Int? = 0, count: Int? = 20): PodcastsSearchPodcastResponse {
        val response = method("podcasts.searchPodcast", mapOf("search_string" to searchString, "offset" to offset, "count" to count))
        return decodeResponse(response, json)
    }

}
