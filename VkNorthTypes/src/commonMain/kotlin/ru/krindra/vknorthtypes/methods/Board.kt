package ru.krindra.vknorthtypes.methods

// **********
// THIS FILE IS AUTOGENERATED!!! DO NOT EDIT IT!!!
// **********


import ru.krindra.vknorthtypes.types.board.*
import kotlinx.serialization.json.Json
import ru.krindra.vknorthtypes.JsonSingleton
import ru.krindra.vknorthtypes.types.base.BaseOkResponse
import ru.krindra.vknorthtypes.BaseMultivariateResponse

class Board(
    private val method: suspend (String, Map<String, Any?>?) -> String,
    private val json: Json = JsonSingleton.json
    ) {
    /**
     *
     * Creates a new topic on a community's discussion board.
     * 
     * @param groupId ID of the community that owns the discussion board.
     * @param title Topic title.
     * @param text Text of the topic.
     * @param fromGroup For a community: '1' - to post the topic as by the community, '0' - to post the topic as by the user (default).
     * @param attachments List of media objects attached to the topic, in the following format: "<owner_id>_<media_id>,<owner_id>_<media_id>", '' - Type of media object: 'photo' - photo, 'video' - video, 'audio' - audio, 'doc' - document, '<owner_id>' - ID of the media owner. '<media_id>' - Media ID. Example: "photo100172_166443618,photo66748_265827614", , "NOTE: If you try to attach more than one reference, an error will be thrown.",.
     */
    suspend fun addTopic(groupId: Long, title: String, text: String? = null, fromGroup: Boolean? = false, attachments: List<String>? = null): BoardAddTopicResponse {
        val response = method("addTopic", mapOf("group_id" to groupId, "title" to title, "text" to text, "from_group" to fromGroup, "attachments" to attachments))
        return json.decodeFromString<BoardAddTopicResponse>(response)
    }

    /**
     *
     * Closes a topic on a community's discussion board so that comments cannot be posted.
     * 
     * @param groupId ID of the community that owns the discussion board.
     * @param topicId Topic ID.
     */
    suspend fun closeTopic(groupId: Long, topicId: Long): BaseOkResponse {
        val response = method("closeTopic", mapOf("group_id" to groupId, "topic_id" to topicId))
        return json.decodeFromString<BaseOkResponse>(response)
    }

    /**
     *
     * Adds a comment on a topic on a community's discussion board.
     * 
     * @param groupId ID of the community that owns the discussion board.
     * @param topicId ID of the topic to be commented on.
     * @param message (Required if 'attachments' is not set.) Text of the comment.
     * @param attachments (Required if 'text' is not set.) List of media objects attached to the comment, in the following format: "<owner_id>_<media_id>,<owner_id>_<media_id>", '' - Type of media object: 'photo' - photo, 'video' - video, 'audio' - audio, 'doc' - document, '<owner_id>' - ID of the media owner. '<media_id>' - Media ID.
     * @param fromGroup '1' - to post the comment as by the community, '0' - to post the comment as by the user (default).
     * @param stickerId Sticker ID.
     * @param guid Unique identifier to avoid repeated comments.
     */
    suspend fun createComment(groupId: Long, topicId: Long, message: String? = null, attachments: List<String>? = null, fromGroup: Boolean? = false, stickerId: Long? = null, guid: String? = null): BoardCreateCommentResponse {
        val response = method("createComment", mapOf("group_id" to groupId, "topic_id" to topicId, "message" to message, "attachments" to attachments, "from_group" to fromGroup, "sticker_id" to stickerId, "guid" to guid))
        return json.decodeFromString<BoardCreateCommentResponse>(response)
    }

    /**
     *
     * Deletes a comment on a topic on a community's discussion board.
     * 
     * @param groupId ID of the community that owns the discussion board.
     * @param topicId Topic ID.
     * @param commentId Comment ID.
     */
    suspend fun deleteComment(groupId: Long, topicId: Long, commentId: Long): BaseOkResponse {
        val response = method("deleteComment", mapOf("group_id" to groupId, "topic_id" to topicId, "comment_id" to commentId))
        return json.decodeFromString<BaseOkResponse>(response)
    }

    /**
     *
     * Deletes a topic from a community's discussion board.
     * 
     * @param groupId ID of the community that owns the discussion board.
     * @param topicId Topic ID.
     */
    suspend fun deleteTopic(groupId: Long, topicId: Long): BaseOkResponse {
        val response = method("deleteTopic", mapOf("group_id" to groupId, "topic_id" to topicId))
        return json.decodeFromString<BaseOkResponse>(response)
    }

    /**
     *
     * Edits a comment on a topic on a community's discussion board.
     * 
     * @param groupId ID of the community that owns the discussion board.
     * @param topicId Topic ID.
     * @param commentId ID of the comment on the topic.
     * @param message (Required if 'attachments' is not set). New comment text.
     * @param attachments (Required if 'message' is not set.) List of media objects attached to the comment, in the following format: "<owner_id>_<media_id>,<owner_id>_<media_id>", '' - Type of media object: 'photo' - photo, 'video' - video, 'audio' - audio, 'doc' - document, '<owner_id>' - ID of the media owner. '<media_id>' - Media ID. Example: "photo100172_166443618,photo66748_265827614".
     */
    suspend fun editComment(groupId: Long, topicId: Long, commentId: Long, message: String? = null, attachments: List<String>? = null): BaseOkResponse {
        val response = method("editComment", mapOf("group_id" to groupId, "topic_id" to topicId, "comment_id" to commentId, "message" to message, "attachments" to attachments))
        return json.decodeFromString<BaseOkResponse>(response)
    }

    /**
     *
     * Edits the title of a topic on a community's discussion board.
     * 
     * @param groupId ID of the community that owns the discussion board.
     * @param topicId Topic ID.
     * @param title New title of the topic.
     */
    suspend fun editTopic(groupId: Long, topicId: Long, title: String): BaseOkResponse {
        val response = method("editTopic", mapOf("group_id" to groupId, "topic_id" to topicId, "title" to title))
        return json.decodeFromString<BaseOkResponse>(response)
    }

    /**
     *
     * Pins a topic (fixes its place) to the top of a community's discussion board.
     * 
     * @param groupId ID of the community that owns the discussion board.
     * @param topicId Topic ID.
     */
    suspend fun fixTopic(groupId: Long, topicId: Long): BaseOkResponse {
        val response = method("fixTopic", mapOf("group_id" to groupId, "topic_id" to topicId))
        return json.decodeFromString<BaseOkResponse>(response)
    }

    /**
     *
     * Returns a list of comments on a topic on a community's discussion board.
     * 
     * @param groupId ID of the community that owns the discussion board.
     * @param topicId Topic ID.
     * @param needLikes '1' - to return the 'likes' field, '0' - not to return the 'likes' field (default).
     * @param startCommentId 
     * @param offset Offset needed to return a specific subset of comments.
     * @param count Number of comments to return.
     * @param extended '1' - to return information about users who posted comments, '0' - to return no additional fields (default).
     * @param sort Sort order: 'asc' - by creation date in chronological order, 'desc' - by creation date in reverse chronological order,.
     */
    suspend fun getComments(groupId: Long, topicId: Long, needLikes: Boolean? = false, startCommentId: Long? = null, offset: Int? = null, count: Int? = 20, extended: Boolean? = false, sort: String? = null): GetcommentsResponse {
        val response = method("getComments", mapOf("group_id" to groupId, "topic_id" to topicId, "need_likes" to needLikes, "start_comment_id" to startCommentId, "offset" to offset, "count" to count, "extended" to extended, "sort" to sort))
        return GetcommentsResponse(response, json)
    }
    class GetcommentsResponse(
        private val rawResponse: String, json: Json
    ): BaseMultivariateResponse(json) {
        fun BoardGetCommentsExtendedResponse(): BoardGetCommentsExtendedResponse? {
            return try {
                getResponse(BoardGetCommentsExtendedResponse.serializer(), rawResponse)
            } catch(e: Exception) { null }
        }
        fun BoardGetCommentsResponse(): BoardGetCommentsResponse? {
            return try {
                getResponse(BoardGetCommentsResponse.serializer(), rawResponse)
            } catch(e: Exception) { null }
        }
    }

    /**
     *
     * Returns a list of topics on a community's discussion board.
     * 
     * @param groupId ID of the community that owns the discussion board.
     * @param topicIds IDs of topics to be returned (100 maximum). By default, all topics are returned. If this parameter is set, the 'order', 'offset', and 'count' parameters are ignored.
     * @param order Sort order: '1' - by date updated in reverse chronological order. '2' - by date created in reverse chronological order. '-1' - by date updated in chronological order. '-2' - by date created in chronological order. If no sort order is specified, topics are returned in the order specified by the group administrator. Pinned topics are returned first, regardless of the sorting.
     * @param offset Offset needed to return a specific subset of topics.
     * @param count Number of topics to return.
     * @param extended '1' - to return information about users who created topics or who posted there last, '0' - to return no additional fields (default).
     * @param preview '1' - to return the first comment in each topic,, '2' - to return the last comment in each topic,, '0' - to return no comments. By default: '0'.
     * @param previewLength Number of characters after which to truncate the previewed comment. To preview the full comment, specify '0'.
     */
    suspend fun getTopics(groupId: Long, topicIds: List<Int>? = null, order: Int? = null, offset: Int? = null, count: Int? = 40, extended: Boolean? = false, preview: Int? = null, previewLength: Int? = 90): GettopicsResponse {
        val response = method("getTopics", mapOf("group_id" to groupId, "topic_ids" to topicIds, "order" to order, "offset" to offset, "count" to count, "extended" to extended, "preview" to preview, "preview_length" to previewLength))
        return GettopicsResponse(response, json)
    }
    class GettopicsResponse(
        private val rawResponse: String, json: Json
    ): BaseMultivariateResponse(json) {
        fun BoardGetTopicsExtendedResponse(): BoardGetTopicsExtendedResponse? {
            return try {
                getResponse(BoardGetTopicsExtendedResponse.serializer(), rawResponse)
            } catch(e: Exception) { null }
        }
        fun BoardGetTopicsResponse(): BoardGetTopicsResponse? {
            return try {
                getResponse(BoardGetTopicsResponse.serializer(), rawResponse)
            } catch(e: Exception) { null }
        }
    }

    /**
     *
     * Re-opens a previously closed topic on a community's discussion board.
     * 
     * @param groupId ID of the community that owns the discussion board.
     * @param topicId Topic ID.
     */
    suspend fun openTopic(groupId: Long, topicId: Long): BaseOkResponse {
        val response = method("openTopic", mapOf("group_id" to groupId, "topic_id" to topicId))
        return json.decodeFromString<BaseOkResponse>(response)
    }

    /**
     *
     * Restores a comment deleted from a topic on a community's discussion board.
     * 
     * @param groupId ID of the community that owns the discussion board.
     * @param topicId Topic ID.
     * @param commentId Comment ID.
     */
    suspend fun restoreComment(groupId: Long, topicId: Long, commentId: Long): BaseOkResponse {
        val response = method("restoreComment", mapOf("group_id" to groupId, "topic_id" to topicId, "comment_id" to commentId))
        return json.decodeFromString<BaseOkResponse>(response)
    }

    /**
     *
     * Unpins a pinned topic from the top of a community's discussion board.
     * 
     * @param groupId ID of the community that owns the discussion board.
     * @param topicId Topic ID.
     */
    suspend fun unfixTopic(groupId: Long, topicId: Long): BaseOkResponse {
        val response = method("unfixTopic", mapOf("group_id" to groupId, "topic_id" to topicId))
        return json.decodeFromString<BaseOkResponse>(response)
    }

}