package ru.krindra.vknorthtypes.methods

import ru.krindra.vknorthtypes.types.stories.*
import kotlinx.serialization.json.Json
import ru.krindra.vknorthtypes.JsonSingleton
import ru.krindra.vknorthtypes.types.base.BaseOkResponse
import ru.krindra.vknorthtypes.types.base.BaseUserGroupFields
import ru.krindra.vknorthtypes.BaseMultivariateResponse

class Stories(
    private val method: suspend (String, Map<String, Any?>?) -> String,
    private val json: Json = JsonSingleton.json
    ) {
    /**
     *
     * Allows to hide stories from chosen sources from current user's feed.
     * 
     * @param ownersIds List of sources IDs.
     */
    suspend fun banOwner(ownersIds: List<Int>): BaseOkResponse {
        val response = method("stories.banOwner", mapOf("owners_ids" to ownersIds))
        return decodeResponse(response, json)
    }

    /**
     *
     * Allows to delete story.
     * 
     * @param ownerId Story owner's ID. Current user id is used by default.
     * @param storyId Story ID.
     * @param stories 
     */
    suspend fun delete(ownerId: Long? = null, storyId: Long? = null, stories: List<String>? = null): BaseOkResponse {
        val response = method("stories.delete", mapOf("owner_id" to ownerId, "story_id" to storyId, "stories" to stories))
        return decodeResponse(response, json)
    }

    /**
     *
     * Returns stories available for current user.
     * 
     * @param ownerId Owner ID.
     * @param extended '1' - to return additional fields for users and communities. Default value is 0.
     * @param fields 
     */
    suspend fun get(ownerId: Long? = null, extended: Boolean? = false, fields: List<BaseUserGroupFields>? = null): StoriesGetV5113Response {
        val response = method("stories.get", mapOf("owner_id" to ownerId, "extended" to extended, "fields" to fields))
        return decodeResponse(response, json)
    }

    /**
     *
     * Returns list of sources hidden from current user's feed.
     * 
     * @param extended '1' - to return additional fields for users and communities. Default value is 0.
     * @param fields Additional fields to return.
     */
    suspend fun getBanned(extended: Boolean? = false, fields: List<BaseUserGroupFields>? = null): GetBannedResponse {
        val response = method("stories.getBanned", mapOf("extended" to extended, "fields" to fields))
        return GetBannedResponse(response, json)
    }
    class GetBannedResponse(
        private val rawResponse: String, json: Json
    ): BaseMultivariateResponse(json) {
        fun StoriesGetBannedExtendedResponse(): StoriesGetBannedExtendedResponse? {
            return getResponseOrNull(StoriesGetBannedExtendedResponse.serializer(), rawResponse)
        }
        fun StoriesGetBannedResponse(): StoriesGetBannedResponse? {
            return getResponseOrNull(StoriesGetBannedResponse.serializer(), rawResponse)
        }
    }

    /**
     *
     * Returns story by its ID.
     * 
     * @param stories Stories IDs separated by commas. Use format {owner_id}+'_'+{story_id}, for example, 12345_54331.
     * @param extended '1' - to return additional fields for users and communities. Default value is 0.
     * @param fields Additional fields to return.
     */
    suspend fun getById(stories: List<String>, extended: Boolean? = false, fields: List<BaseUserGroupFields>? = null): StoriesGetByIdExtendedResponse {
        val response = method("stories.getById", mapOf("stories" to stories, "extended" to extended, "fields" to fields))
        return decodeResponse(response, json)
    }

    /**
     *
     * @param ownerId 
     * @param storyId 
     */
    suspend fun getDetailedStats(ownerId: Long, storyId: Long): StoriesGetStatsV5200Response {
        val response = method("stories.getDetailedStats", mapOf("owner_id" to ownerId, "story_id" to storyId))
        return decodeResponse(response, json)
    }

    /**
     *
     * Returns URL for uploading a story with photo.
     * 
     * @param addToNews 1 - to add the story to friend's feed.
     * @param userIds List of users IDs who can see the story.
     * @param replyToStory ID of the story to reply with the current.
     * @param linkText Link text (for community's stories only).
     * @param linkUrl Link URL. Internal links on https://vk.com only.
     * @param groupId ID of the community to upload the story (should be verified or with the "fire" icon).
     * @param clickableStickers 
     */
    suspend fun getPhotoUploadServer(addToNews: Boolean? = false, userIds: List<Int>? = null, replyToStory: String? = null, linkText: String? = null, linkUrl: String? = null, groupId: Long? = null, clickableStickers: String? = null): StoriesGetPhotoUploadServerResponse {
        val response = method("stories.getPhotoUploadServer", mapOf("add_to_news" to addToNews, "user_ids" to userIds, "reply_to_story" to replyToStory, "link_text" to linkText, "link_url" to linkUrl, "group_id" to groupId, "clickable_stickers" to clickableStickers))
        return decodeResponse(response, json)
    }

    /**
     *
     * Returns replies to the story.
     * 
     * @param ownerId Story owner ID.
     * @param storyId Story ID.
     * @param accessKey Access key for the private object.
     * @param extended '1' - to return additional fields for users and communities. Default value is 0.
     * @param fields Additional fields to return.
     */
    suspend fun getReplies(ownerId: Long, storyId: Long, accessKey: String? = null, extended: Boolean? = false, fields: List<BaseUserGroupFields>? = null): StoriesGetV5113Response {
        val response = method("stories.getReplies", mapOf("owner_id" to ownerId, "story_id" to storyId, "access_key" to accessKey, "extended" to extended, "fields" to fields))
        return decodeResponse(response, json)
    }

    /**
     *
     * Returns stories available for current user.
     * 
     * @param ownerId Story owner ID. .
     * @param storyId Story ID.
     */
    suspend fun getStats(ownerId: Long, storyId: Long): StoriesGetStatsResponse {
        val response = method("stories.getStats", mapOf("owner_id" to ownerId, "story_id" to storyId))
        return decodeResponse(response, json)
    }

    /**
     *
     * Allows to receive URL for uploading story with video.
     * 
     * @param addToNews 1 - to add the story to friend's feed.
     * @param userIds List of users IDs who can see the story.
     * @param replyToStory ID of the story to reply with the current.
     * @param linkText Link text (for community's stories only).
     * @param linkUrl Link URL. Internal links on https://vk.com only.
     * @param groupId ID of the community to upload the story (should be verified or with the "fire" icon).
     * @param clickableStickers 
     */
    suspend fun getVideoUploadServer(addToNews: Boolean? = false, userIds: List<Int>? = null, replyToStory: String? = null, linkText: String? = null, linkUrl: String? = null, groupId: Long? = null, clickableStickers: String? = null): StoriesGetVideoUploadServerResponse {
        val response = method("stories.getVideoUploadServer", mapOf("add_to_news" to addToNews, "user_ids" to userIds, "reply_to_story" to replyToStory, "link_text" to linkText, "link_url" to linkUrl, "group_id" to groupId, "clickable_stickers" to clickableStickers))
        return decodeResponse(response, json)
    }

    /**
     *
     * Returns a list of story viewers.
     * 
     * @param ownerId Story owner ID.
     * @param storyId Story ID.
     * @param count Maximum number of results.
     * @param offset Offset needed to return a specific subset of results.
     * @param extended '1' - to return detailed information about photos.
     * @param fields 
     */
    suspend fun getViewers(storyId: Long, ownerId: Long? = null, count: Int? = 100, offset: Int? = 0, extended: Boolean? = false, fields: List<BaseUserGroupFields>? = null): StoriesGetViewersExtendedV5115Response {
        val response = method("stories.getViewers", mapOf("owner_id" to ownerId, "story_id" to storyId, "count" to count, "offset" to offset, "extended" to extended, "fields" to fields))
        return decodeResponse(response, json)
    }

    /**
     *
     * Hides all replies in the last 24 hours from the user to current user's stories.
     * 
     * @param ownerId ID of the user whose replies should be hidden.
     * @param groupId 
     */
    suspend fun hideAllReplies(ownerId: Long, groupId: Long? = null): BaseOkResponse {
        val response = method("stories.hideAllReplies", mapOf("owner_id" to ownerId, "group_id" to groupId))
        return decodeResponse(response, json)
    }

    /**
     *
     * Hides the reply to the current user's story.
     * 
     * @param ownerId ID of the user whose replies should be hidden.
     * @param storyId Story ID.
     */
    suspend fun hideReply(ownerId: Long, storyId: Long): BaseOkResponse {
        val response = method("stories.hideReply", mapOf("owner_id" to ownerId, "story_id" to storyId))
        return decodeResponse(response, json)
    }

    /**
     *
     * @param uploadResults 
     * @param uploadResultsJson 
     * @param extended 
     * @param fields 
     */
    suspend fun save(uploadResults: List<String>? = null, uploadResultsJson: String? = null, extended: Boolean? = false, fields: List<BaseUserGroupFields>? = null): StoriesSaveResponse {
        val response = method("stories.save", mapOf("upload_results" to uploadResults, "upload_results_json" to uploadResultsJson, "extended" to extended, "fields" to fields))
        return decodeResponse(response, json)
    }

    /**
     *
     * @param q 
     * @param placeId 
     * @param latitude 
     * @param longitude 
     * @param radius 
     * @param mentionedId 
     * @param count 
     * @param extended 
     * @param fields 
     */
    suspend fun search(q: String? = null, placeId: Long? = null, latitude: Double? = null, longitude: Double? = null, radius: Int? = null, mentionedId: Long? = null, count: Int? = 20, extended: Boolean? = false, fields: List<BaseUserGroupFields>? = null): StoriesGetV5113Response {
        val response = method("stories.search", mapOf("q" to q, "place_id" to placeId, "latitude" to latitude, "longitude" to longitude, "radius" to radius, "mentioned_id" to mentionedId, "count" to count, "extended" to extended, "fields" to fields))
        return decodeResponse(response, json)
    }

    /**
     *
     * @param accessKey 
     * @param message 
     * @param isBroadcast 
     * @param isAnonymous 
     * @param unseenMarker 
     */
    suspend fun sendInteraction(accessKey: String, message: String? = null, isBroadcast: Boolean? = false, isAnonymous: Boolean? = false, unseenMarker: Boolean? = false): BaseOkResponse {
        val response = method("stories.sendInteraction", mapOf("access_key" to accessKey, "message" to message, "is_broadcast" to isBroadcast, "is_anonymous" to isAnonymous, "unseen_marker" to unseenMarker))
        return decodeResponse(response, json)
    }

    /**
     *
     * Allows to show stories from hidden sources in current user's feed.
     * 
     * @param ownersIds List of hidden sources to show stories from.
     */
    suspend fun unbanOwner(ownersIds: List<Int>): BaseOkResponse {
        val response = method("stories.unbanOwner", mapOf("owners_ids" to ownersIds))
        return decodeResponse(response, json)
    }

}
