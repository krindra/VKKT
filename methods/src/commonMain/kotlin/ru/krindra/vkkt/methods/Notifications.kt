package ru.krindra.vkkt.methods

import ru.krindra.vkkt.responses.notifications.*
import ru.krindra.vkkt.objects.notifications.*
import ru.krindra.vkkt.utils.JsonSingleton
import kotlinx.serialization.json.Json
import ru.krindra.vkkt.responses.base.BaseBoolResponse

class Notifications(
    private val method: suspend (String, Map<String, Any?>?) -> String,
    private val json: Json = JsonSingleton.json
    ) {
    /**
     *
     * Returns a list of notifications about other users' feedback to the current user's wall posts.
     * 
     * @param count Number of notifications to return.
     * @param startFrom 
     * @param filters Type of notifications to return: 'wall' - wall posts, 'mentions' - mentions in wall posts, comments, or topics, 'comments' - comments to wall posts, photos, and videos, 'likes' - likes, 'reposted' - wall posts that are copied from the current user's wall, 'followers' - new followers, 'friends' - accepted friend requests.
     * @param startTime Earliest timestamp (in Unix time) of a notification to return. By default, 24 hours ago.
     * @param endTime Latest timestamp (in Unix time) of a notification to return. By default, the current time.
     */
    suspend fun get(count: Int? = 30, startFrom: String? = null, filters: List<String>? = null, startTime: Int? = null, endTime: Int? = null): NotificationsGetResponse {
        val response = method("notifications.get", mapOf("count" to count, "start_from" to startFrom, "filters" to filters, "start_time" to startTime, "end_time" to endTime))
        return decodeResponse(response, json)
    }

    /**
     *
     * Resets the counter of new notifications about other users' feedback to the current user's wall posts.
     * 
     */
    suspend fun markAsViewed(): BaseBoolResponse {
        val response = method("notifications.markAsViewed", mapOf())
        return decodeResponse(response, json)
    }

    /**
     *
     * @param userIds 
     * @param message 
     * @param fragment 
     * @param groupId 
     * @param randomId 
     * @param sendingMode Type of sending (delivering) notifications: 'immediately' - push and bell notifications will be delivered as soon as possible, 'delayed' - push and bell notifications will be delivered in the most comfortable time for the user, 'delayed_push' - only push notifications will be delivered in the most comfortable time, while the bell notifications will be delivered as soon as possible.
     */
    suspend fun sendMessage(userIds: List<Int>, message: String, fragment: String? = null, groupId: Long? = null, randomId: Long? = null, sendingMode: String? = "immediately"): NotificationsSendMessageResponse {
        val response = method("notifications.sendMessage", mapOf("user_ids" to userIds, "message" to message, "fragment" to fragment, "group_id" to groupId, "random_id" to randomId, "sending_mode" to sendingMode))
        return decodeResponse(response, json)
    }

}
