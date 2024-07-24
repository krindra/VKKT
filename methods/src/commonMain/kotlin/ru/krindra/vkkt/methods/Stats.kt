package ru.krindra.vkkt.methods

import ru.krindra.vkkt.responses.stats.*
import ru.krindra.vkkt.objects.stats.*
import ru.krindra.vkkt.utils.JsonSingleton
import kotlinx.serialization.json.Json
import ru.krindra.vkkt.responses.base.BaseOkResponse

class Stats(
    private val method: suspend (String, Map<String, Any?>?) -> String,
    private val json: Json = JsonSingleton.json
    ) {
    /**
     *
     * Returns statistics of a community or an application.
     * 
     * @param groupId Community ID.
     * @param appId Application ID.
     * @param timestampFrom 
     * @param timestampTo 
     * @param interval 
     * @param intervalsCount 
     * @param filters 
     * @param statsGroups 
     * @param extended 
     */
    suspend fun get(groupId: Int? = null, appId: Int? = null, timestampFrom: Int? = null, timestampTo: Int? = null, interval: String? = "day", intervalsCount: Int? = null, filters: List<String>? = null, statsGroups: List<String>? = null, extended: Boolean? = true): StatsGetResponse {
        val response = method("stats.get", mapOf("group_id" to groupId, "app_id" to appId, "timestamp_from" to timestampFrom, "timestamp_to" to timestampTo, "interval" to interval, "intervals_count" to intervalsCount, "filters" to filters, "stats_groups" to statsGroups, "extended" to extended))
        return decodeResponse(response, json)
    }

    /**
     *
     * Returns stats for a wall post.
     * 
     * @param ownerId post owner community id. Specify with "-" sign.
     * @param postIds wall posts id.
     */
    suspend fun getPostReach(ownerId: Int, postIds: List<Int>): StatsGetPostReachResponse {
        val response = method("stats.getPostReach", mapOf("owner_id" to ownerId, "post_ids" to postIds))
        return decodeResponse(response, json)
    }

    /**
     *
     */
    suspend fun trackVisitor(): BaseOkResponse {
        val response = method("stats.trackVisitor", mapOf())
        return decodeResponse(response, json)
    }

}
