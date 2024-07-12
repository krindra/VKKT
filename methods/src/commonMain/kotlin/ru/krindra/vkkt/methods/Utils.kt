package ru.krindra.vkkt.methods

import ru.krindra.vkkt.responses.utils.*
import ru.krindra.vkkt.objects.utils.*
import ru.krindra.vkkt.utils.JsonSingleton
import kotlinx.serialization.json.Json
import ru.krindra.vkkt.responses.base.BaseOkResponse

class Utils(
    private val method: suspend (String, Map<String, Any?>?) -> String,
    private val json: Json = JsonSingleton.json
    ) {
    /**
     *
     * Checks whether a link is blocked in VK.
     * 
     * @param url Link to check (e.g., 'http://google.com').
     */
    suspend fun checkLink(url: String): UtilsCheckLinkResponse {
        val response = method("utils.checkLink", mapOf("url" to url))
        return decodeResponse(response, json)
    }

    /**
     *
     * Deletes shortened link from user's list.
     * 
     * @param key Link key (characters after vk.cc/).
     */
    suspend fun deleteFromLastShortened(key: String): BaseOkResponse {
        val response = method("utils.deleteFromLastShortened", mapOf("key" to key))
        return decodeResponse(response, json)
    }

    /**
     *
     * Returns a list of user's shortened links.
     * 
     * @param count Number of links to return.
     * @param offset Offset needed to return a specific subset of links.
     */
    suspend fun getLastShortenedLinks(count: Int? = 10, offset: Int? = 0): UtilsGetLastShortenedLinksResponse {
        val response = method("utils.getLastShortenedLinks", mapOf("count" to count, "offset" to offset))
        return decodeResponse(response, json)
    }

    /**
     *
     * Returns stats data for shortened link.
     * 
     * @param key Link key (characters after vk.cc/).
     * @param source Source of scope.
     * @param accessKey Access key for private link stats.
     * @param interval Interval.
     * @param intervalsCount Number of intervals to return.
     * @param extended 1 - to return extended stats data (sex, age, geo). 0 - to return views number only.
     */
    suspend fun getLinkStats(key: String, source: String? = "vk_cc", accessKey: String? = null, interval: String? = "day", intervalsCount: Int? = 1, extended: Boolean? = false): GetLinkStatsResponse {
        val response = method("utils.getLinkStats", mapOf("key" to key, "source" to source, "access_key" to accessKey, "interval" to interval, "intervals_count" to intervalsCount, "extended" to extended))
        return GetLinkStatsResponse(response, json)
    }
    class GetLinkStatsResponse(
        private val rawResponse: String, json: Json
    ): BaseMultivariateResponse(json) {
        fun UtilsGetLinkStatsExtendedResponse(): UtilsGetLinkStatsExtendedResponse? {
            return getResponseOrNull(UtilsLinkStatsExtended.serializer(), rawResponse)
        }
        fun UtilsGetLinkStatsResponse(): UtilsGetLinkStatsResponse? {
            return getResponseOrNull(UtilsLinkStats.serializer(), rawResponse)
        }
    }

    /**
     *
     * Returns the current time of the VK server.
     * 
     */
    suspend fun getServerTime(): UtilsGetServerTimeResponse {
        val response = method("utils.getServerTime", mapOf())
        return decodeResponse(response, json)
    }

    /**
     *
     * Allows to receive a link shortened via vk.cc.
     * 
     * @param url URL to be shortened.
     * @param private 1 - private stats, 0 - public stats.
     */
    suspend fun getShortLink(url: String, private: Boolean? = false): UtilsGetShortLinkResponse {
        val response = method("utils.getShortLink", mapOf("url" to url, "private" to private))
        return decodeResponse(response, json)
    }

    /**
     *
     * Detects a type of object (e.g., user, community, application) and its ID by screen name.
     * 
     * @param screenName Screen name of the user, community (e.g., 'apiclub,' 'andrew', or 'rules_of_war'), or application.
     */
    suspend fun resolveScreenName(screenName: String): UtilsResolveScreenNameResponse {
        val response = method("utils.resolveScreenName", mapOf("screen_name" to screenName))
        return decodeResponse(response, json)
    }

}
