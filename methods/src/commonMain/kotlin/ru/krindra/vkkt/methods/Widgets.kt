package ru.krindra.vkkt.methods

import ru.krindra.vkkt.responses.widgets.*
import ru.krindra.vkkt.objects.widgets.*
import ru.krindra.vkkt.utils.JsonSingleton
import kotlinx.serialization.json.Json
import ru.krindra.vkkt.objects.users.UsersFields

class Widgets(
    private val method: suspend (String, Map<String, Any?>?) -> String,
    private val json: Json = JsonSingleton.json
    ) {
    /**
     *
     * Gets a list of comments for the page added through the [vk.com/dev/Comments|Comments widget].
     * 
     * @param widgetApiId 
     * @param url 
     * @param pageId 
     * @param order 
     * @param fields 
     * @param offset 
     * @param count 
     */
    suspend fun getComments(widgetApiId: Long? = null, url: String? = null, pageId: String? = null, order: String? = "date", fields: List<UsersFields>? = null, offset: Int? = 0, count: Int? = 10): WidgetsGetCommentsResponse {
        val response = method("widgets.getComments", mapOf("widget_api_id" to widgetApiId, "url" to url, "page_id" to pageId, "order" to order, "fields" to fields, "offset" to offset, "count" to count))
        return decodeResponse(response, json)
    }

    /**
     *
     * Gets a list of application/site pages where the [vk.com/dev/Comments|Comments widget] or [vk.com/dev/Like|Like widget] is installed.
     * 
     * @param widgetApiId 
     * @param order 
     * @param period 
     * @param offset 
     * @param count 
     */
    suspend fun getPages(widgetApiId: Long? = null, order: String? = "friend_likes", period: String? = "week", offset: Int? = 0, count: Int? = 10): WidgetsGetPagesResponse {
        val response = method("widgets.getPages", mapOf("widget_api_id" to widgetApiId, "order" to order, "period" to period, "offset" to offset, "count" to count))
        return decodeResponse(response, json)
    }

}
