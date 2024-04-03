package ru.krindra.vknorthtypes.methods

// **********
// THIS FILE IS AUTOGENERATED!!! DO NOT EDIT IT!!!
// **********


import ru.krindra.vknorthtypes.types.search.*
import kotlinx.serialization.json.Json
import ru.krindra.vknorthtypes.JsonSingleton

class Search(
    private val method: suspend (String, Map<String, Any?>?) -> String,
    private val json: Json = JsonSingleton.json
    ) {
    /**
     *
     * Allows the programmer to do a quick search for any substring.
     * 
     * @param q Search query string.
     * @param offset Offset for querying specific result subset.
     * @param limit Maximum number of results to return.
     * @param filters 
     * @param fields 
     * @param searchGlobal 
     */
    suspend fun getHints(q: String? = null, offset: Int? = null, limit: Int? = 9, filters: List<String>? = null, fields: List<String>? = null, searchGlobal: Boolean? = true): SearchGetHintsResponse {
        val response = method("getHints", mapOf("q" to q, "offset" to offset, "limit" to limit, "filters" to filters, "fields" to fields, "search_global" to searchGlobal))
        return json.decodeFromString<SearchGetHintsResponse>(response)
    }

}
