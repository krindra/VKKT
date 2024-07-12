package ru.krindra.vkkt.methods

import ru.krindra.vkkt.responses.wall.*
import ru.krindra.vkkt.objects.wall.*
import ru.krindra.vkkt.utils.JsonSingleton
import kotlinx.serialization.json.Json
import ru.krindra.vkkt.responses.base.BaseOkResponse
import ru.krindra.vkkt.responses.base.BaseBoolResponse
import ru.krindra.vkkt.objects.base.BaseUserGroupFields

class Wall(
    private val method: suspend (String, Map<String, Any?>?) -> String,
    private val json: Json = JsonSingleton.json
    ) {
    /**
     *
     * @param link 
     */
    suspend fun checkCopyrightLink(link: String): BaseBoolResponse {
        val response = method("wall.checkCopyrightLink", mapOf("link" to link))
        return decodeResponse(response, json)
    }

    /**
     *
     * @param ownerId 
     * @param postId 
     */
    suspend fun closeComments(ownerId: Long, postId: Long): BaseBoolResponse {
        val response = method("wall.closeComments", mapOf("owner_id" to ownerId, "post_id" to postId))
        return decodeResponse(response, json)
    }

    /**
     *
     * Adds a comment to a post on a user wall or community wall.
     * 
     * @param ownerId User ID or community ID. Use a negative value to designate a community ID.
     * @param postId Post ID.
     * @param fromGroup Group ID.
     * @param message (Required if 'attachments' is not set.) Text of the comment.
     * @param replyToComment ID of comment to reply.
     * @param attachments (Required if 'message' is not set.) List of media objects attached to the comment, in the following format: "<owner_id>_<media_id>,<owner_id>_<media_id>", '' - Type of media ojbect: 'photo' - photo, 'video' - video, 'audio' - audio, 'doc' - document, '<owner_id>' - ID of the media owner. '<media_id>' - Media ID. For example: "photo100172_166443618,photo66748_265827614".
     * @param stickerId Sticker ID.
     * @param guid Unique identifier to avoid repeated comments.
     */
    suspend fun createComment(postId: Long, ownerId: Long? = null, fromGroup: Int? = null, message: String? = null, replyToComment: Int? = null, attachments: List<String>? = null, stickerId: Long? = null, guid: String? = null): WallCreateCommentResponse {
        val response = method("wall.createComment", mapOf("owner_id" to ownerId, "post_id" to postId, "from_group" to fromGroup, "message" to message, "reply_to_comment" to replyToComment, "attachments" to attachments, "sticker_id" to stickerId, "guid" to guid))
        return decodeResponse(response, json)
    }

    /**
     *
     * Deletes a post from a user wall or community wall.
     * 
     * @param ownerId User ID or community ID. Use a negative value to designate a community ID.
     * @param postId ID of the post to be deleted.
     */
    suspend fun delete(ownerId: Long? = null, postId: Long? = null): BaseOkResponse {
        val response = method("wall.delete", mapOf("owner_id" to ownerId, "post_id" to postId))
        return decodeResponse(response, json)
    }

    /**
     *
     * Deletes a comment on a post on a user wall or community wall.
     * 
     * @param ownerId User ID or community ID. Use a negative value to designate a community ID.
     * @param commentId Comment ID.
     */
    suspend fun deleteComment(commentId: Long, ownerId: Long? = null): BaseOkResponse {
        val response = method("wall.deleteComment", mapOf("owner_id" to ownerId, "comment_id" to commentId))
        return decodeResponse(response, json)
    }

    /**
     *
     * Edits a post on a user wall or community wall.
     * 
     * @param ownerId User ID or community ID. Use a negative value to designate a community ID.
     * @param postId 
     * @param friendsOnly 
     * @param message (Required if 'attachments' is not set.) Text of the post.
     * @param attachments (Required if 'message' is not set.) List of objects attached to the post, in the following format: "<owner_id>_<media_id>,<owner_id>_<media_id>", '' - Type of media attachment: 'photo' - photo, 'video' - video, 'audio' - audio, 'doc' - document, '<owner_id>' - ID of the media application owner. '<media_id>' - Media application ID. Example: "photo100172_166443618,photo66748_265827614", May contain a link to an external page to include in the post. Example: "photo66748_265827614,http://habrahabr.ru", "NOTE: If more than one link is being attached, an error is thrown.".
     * @param primaryAttachments 
     * @param services 
     * @param signed 
     * @param publishDate 
     * @param lat 
     * @param long 
     * @param placeId 
     * @param markAsAds 
     * @param closeComments 
     * @param donutPaidDuration 
     * @param posterBkgId 
     * @param posterBkgOwnerId 
     * @param posterBkgAccessHash 
     * @param copyright 
     * @param topicId Topic ID. Allowed values can be obtained from newsfeed.getPostTopics method.
     */
    suspend fun edit(postId: Long, ownerId: Long? = null, friendsOnly: Boolean? = false, message: String? = null, attachments: List<String>? = null, primaryAttachments: List<String>? = null, services: String? = null, signed: Boolean? = false, publishDate: Int? = null, lat: Double? = null, long: Double? = null, placeId: Long? = null, markAsAds: Boolean? = false, closeComments: Boolean? = false, donutPaidDuration: Int? = null, posterBkgId: Long? = null, posterBkgOwnerId: Long? = null, posterBkgAccessHash: String? = null, copyright: String? = null, topicId: Long? = null): WallEditResponse {
        val response = method("wall.edit", mapOf("owner_id" to ownerId, "post_id" to postId, "friends_only" to friendsOnly, "message" to message, "attachments" to attachments, "primary_attachments" to primaryAttachments, "services" to services, "signed" to signed, "publish_date" to publishDate, "lat" to lat, "long" to long, "place_id" to placeId, "mark_as_ads" to markAsAds, "close_comments" to closeComments, "donut_paid_duration" to donutPaidDuration, "poster_bkg_id" to posterBkgId, "poster_bkg_owner_id" to posterBkgOwnerId, "poster_bkg_access_hash" to posterBkgAccessHash, "copyright" to copyright, "topic_id" to topicId))
        return decodeResponse(response, json)
    }

    /**
     *
     * Allows to edit hidden post.
     * 
     * @param ownerId User ID or community ID. Use a negative value to designate a community ID.
     * @param postId Post ID. Used for publishing of scheduled and suggested posts.
     * @param message (Required if 'attachments' is not set.) Text of the post.
     * @param attachments (Required if 'message' is not set.) List of objects attached to the post, in the following format: "<owner_id>_<media_id>,<owner_id>_<media_id>", '' - Type of media attachment: 'photo' - photo, 'video' - video, 'audio' - audio, 'doc' - document, 'page' - wiki-page, 'note' - note, 'poll' - poll, 'album' - photo album, '<owner_id>' - ID of the media application owner. '<media_id>' - Media application ID. Example: "photo100172_166443618,photo66748_265827614", May contain a link to an external page to include in the post. Example: "photo66748_265827614,http://habrahabr.ru", "NOTE: If more than one link is being attached, an error will be thrown.".
     * @param signed Only for posts in communities with 'from_group' set to '1': '1' - post will be signed with the name of the posting user, '0' - post will not be signed (default).
     * @param lat Geographical latitude of a check-in, in degrees (from -90 to 90).
     * @param long Geographical longitude of a check-in, in degrees (from -180 to 180).
     * @param placeId ID of the location where the user was tagged.
     * @param linkButton Link button ID.
     * @param linkTitle Link title.
     * @param linkImage Link image url.
     * @param linkVideo Link video ID in format "<owner_id>_<media_id>".
     */
    suspend fun editAdsStealth(postId: Long, ownerId: Long? = null, message: String? = null, attachments: List<String>? = null, signed: Boolean? = false, lat: Double? = null, long: Double? = null, placeId: Long? = null, linkButton: String? = null, linkTitle: String? = null, linkImage: String? = null, linkVideo: String? = null): BaseOkResponse {
        val response = method("wall.editAdsStealth", mapOf("owner_id" to ownerId, "post_id" to postId, "message" to message, "attachments" to attachments, "signed" to signed, "lat" to lat, "long" to long, "place_id" to placeId, "link_button" to linkButton, "link_title" to linkTitle, "link_image" to linkImage, "link_video" to linkVideo))
        return decodeResponse(response, json)
    }

    /**
     *
     * Edits a comment on a user wall or community wall.
     * 
     * @param ownerId User ID or community ID. Use a negative value to designate a community ID.
     * @param commentId Comment ID.
     * @param message New comment text.
     * @param attachments List of objects attached to the comment, in the following format: , "<owner_id>_<media_id>,<owner_id>_<media_id>", '' - Type of media attachment: 'photo' - photo, 'video' - video, 'audio' - audio, 'doc' - document, '<owner_id>' - ID of the media attachment owner. '<media_id>' - Media attachment ID. For example: "photo100172_166443618,photo66748_265827614".
     */
    suspend fun editComment(commentId: Long, ownerId: Long? = null, message: String? = null, attachments: List<String>? = null): BaseOkResponse {
        val response = method("wall.editComment", mapOf("owner_id" to ownerId, "comment_id" to commentId, "message" to message, "attachments" to attachments))
        return decodeResponse(response, json)
    }

    /**
     *
     * Returns a list of posts on a user wall or community wall.
     * 
     * @param ownerId ID of the user or community that owns the wall. By default, current user ID. Use a negative value to designate a community ID.
     * @param domain User or community short address.
     * @param offset Offset needed to return a specific subset of posts.
     * @param count Number of posts to return (maximum 100).
     * @param filter 
     * @param extended '1' - to return 'wall', 'profiles', and 'groups' fields, '0' - to return no additional fields (default).
     * @param fields 
     */
    suspend fun get(ownerId: Long? = null, domain: String? = null, offset: Int? = null, count: Int? = null, filter: String? = null, extended: Boolean? = false, fields: List<BaseUserGroupFields>? = null): GetResponse {
        val response = method("wall.get", mapOf("owner_id" to ownerId, "domain" to domain, "offset" to offset, "count" to count, "filter" to filter, "extended" to extended, "fields" to fields))
        return GetResponse(response, json)
    }
    class GetResponse(
        private val rawResponse: String, json: Json
    ): BaseMultivariateResponse(json) {
        fun WallGetExtendedResponse(): WallGetExtendedResponse? {
            return getResponseOrNull(WallGetExtendedResponse.serializer(), rawResponse)
        }
        fun WallGetResponse(): WallGetResponse? {
            return getResponseOrNull(WallGetResponse.serializer(), rawResponse)
        }
    }

    /**
     *
     * Returns a list of posts from user or community walls by their IDs.
     * 
     * @param posts User or community IDs and post IDs, separated by underscores. Use a negative value to designate a community ID. Example: "93388_21539,93388_20904,2943_4276,-1_1".
     * @param extended '1' - to return user and community objects needed to display posts, '0' - no additional fields are returned (default).
     * @param copyHistoryDepth Sets the number of parent elements to include in the array 'copy_history' that is returned if the post is a repost from another wall.
     * @param fields 
     */
    suspend fun getById(posts: List<String>, extended: Boolean? = false, copyHistoryDepth: Int? = 2, fields: List<BaseUserGroupFields>? = null): GetByIdResponse {
        val response = method("wall.getById", mapOf("posts" to posts, "extended" to extended, "copy_history_depth" to copyHistoryDepth, "fields" to fields))
        return GetByIdResponse(response, json)
    }
    class GetByIdResponse(
        private val rawResponse: String, json: Json
    ): BaseMultivariateResponse(json) {
        fun WallGetByIdExtendedResponse(): WallGetByIdExtendedResponse? {
            return getResponseOrNull(WallGetByIdExtendedResponse.serializer(), rawResponse)
        }
        fun WallGetByIdResponse(): WallGetByIdResponse? {
            return getResponseOrNull(WallGetByIdResponse.serializer(), rawResponse)
        }
    }

    /**
     *
     * Returns a comment on a post on a user wall or community wall.
     * 
     * @param ownerId User ID or community ID. Use a negative value to designate a community ID.
     * @param commentId Comment ID.
     * @param extended 
     * @param fields 
     */
    suspend fun getComment(commentId: Long, ownerId: Long? = null, extended: Boolean? = false, fields: List<BaseUserGroupFields>? = null): GetCommentResponse {
        val response = method("wall.getComment", mapOf("owner_id" to ownerId, "comment_id" to commentId, "extended" to extended, "fields" to fields))
        return GetCommentResponse(response, json)
    }
    class GetCommentResponse(
        private val rawResponse: String, json: Json
    ): BaseMultivariateResponse(json) {
        fun WallGetCommentExtendedResponse(): WallGetCommentExtendedResponse? {
            return getResponseOrNull(WallGetCommentExtendedResponse.serializer(), rawResponse)
        }
        fun WallGetCommentResponse(): WallGetCommentResponse? {
            return getResponseOrNull(WallGetCommentResponse.serializer(), rawResponse)
        }
    }

    /**
     *
     * Returns a list of comments on a post on a user wall or community wall.
     * 
     * @param ownerId User ID or community ID. Use a negative value to designate a community ID.
     * @param postId Post ID.
     * @param needLikes '1' - to return the 'likes' field, '0' - not to return the 'likes' field (default).
     * @param startCommentId 
     * @param offset Offset needed to return a specific subset of comments.
     * @param count Number of comments to return (maximum 100).
     * @param sort Sort order: 'asc' - chronological, 'desc' - reverse chronological.
     * @param previewLength Number of characters at which to truncate comments when previewed. By default, '90'. Specify '0' if you do not want to truncate comments.
     * @param extended 
     * @param fields 
     * @param commentId Comment ID.
     * @param threadItemsCount Count items in threads.
     */
    suspend fun getComments(ownerId: Long? = null, postId: Long? = null, needLikes: Boolean? = false, startCommentId: Long? = null, offset: Int? = null, count: Int? = null, sort: String? = null, previewLength: Int? = null, extended: Boolean? = false, fields: List<BaseUserGroupFields>? = null, commentId: Long? = null, threadItemsCount: Int? = 0): GetCommentsResponse {
        val response = method("wall.getComments", mapOf("owner_id" to ownerId, "post_id" to postId, "need_likes" to needLikes, "start_comment_id" to startCommentId, "offset" to offset, "count" to count, "sort" to sort, "preview_length" to previewLength, "extended" to extended, "fields" to fields, "comment_id" to commentId, "thread_items_count" to threadItemsCount))
        return GetCommentsResponse(response, json)
    }
    class GetCommentsResponse(
        private val rawResponse: String, json: Json
    ): BaseMultivariateResponse(json) {
        fun WallGetCommentsExtendedResponse(): WallGetCommentsExtendedResponse? {
            return getResponseOrNull(WallGetCommentsExtendedResponse.serializer(), rawResponse)
        }
        fun WallGetCommentsResponse(): WallGetCommentsResponse? {
            return getResponseOrNull(WallGetCommentsResponse.serializer(), rawResponse)
        }
    }

    /**
     *
     * Returns information about reposts of a post on user wall or community wall.
     * 
     * @param ownerId User ID or community ID. By default, current user ID. Use a negative value to designate a community ID.
     * @param postId Post ID.
     * @param offset Offset needed to return a specific subset of reposts.
     * @param count Number of reposts to return.
     */
    suspend fun getReposts(ownerId: Long? = null, postId: Long? = null, offset: Int? = null, count: Int? = 20): WallGetRepostsResponse {
        val response = method("wall.getReposts", mapOf("owner_id" to ownerId, "post_id" to postId, "offset" to offset, "count" to count))
        return decodeResponse(response, json)
    }

    /**
     *
     * @param ownerId 
     * @param postId 
     */
    suspend fun openComments(ownerId: Long, postId: Long): BaseBoolResponse {
        val response = method("wall.openComments", mapOf("owner_id" to ownerId, "post_id" to postId))
        return decodeResponse(response, json)
    }

    /**
     *
     * Pins the post on wall.
     * 
     * @param ownerId ID of the user or community that owns the wall. By default, current user ID. Use a negative value to designate a community ID.
     * @param postId Post ID.
     */
    suspend fun pin(postId: Long, ownerId: Long? = null): BaseOkResponse {
        val response = method("wall.pin", mapOf("owner_id" to ownerId, "post_id" to postId))
        return decodeResponse(response, json)
    }

    /**
     *
     * Adds a new post on a user wall or community wall. Can also be used to publish suggested or scheduled posts.
     * 
     * @param ownerId User ID or community ID. Use a negative value to designate a community ID.
     * @param friendsOnly '1' - post will be available to friends only, '0' - post will be available to all users (default).
     * @param fromGroup For a community: '1' - post will be published by the community, '0' - post will be published by the user (default).
     * @param message (Required if 'attachments' is not set.) Text of the post.
     * @param attachments (Required if 'message' is not set.) List of objects attached to the post, in the following format: "<owner_id>_<media_id>,<owner_id>_<media_id>", '' - Type of media attachment: 'photo' - photo, 'video' - video, 'audio' - audio, 'doc' - document, 'page' - wiki-page, 'note' - note, 'poll' - poll, 'album' - photo album, '<owner_id>' - ID of the media application owner. '<media_id>' - Media application ID. Example: "photo100172_166443618,photo66748_265827614", May contain a link to an external page to include in the post. Example: "photo66748_265827614,http://habrahabr.ru", "NOTE: If more than one link is being attached, an error will be thrown.".
     * @param primaryAttachments 
     * @param services List of services or websites the update will be exported to, if the user has so requested. Sample values: 'twitter', 'facebook'.
     * @param signed Only for posts in communities with 'from_group' set to '1': '1' - post will be signed with the name of the posting user, '0' - post will not be signed (default).
     * @param publishDate Publication date (in Unix time). If used, posting will be delayed until the set time.
     * @param lat Geographical latitude of a check-in, in degrees (from -90 to 90).
     * @param long Geographical longitude of a check-in, in degrees (from -180 to 180).
     * @param placeId ID of the location where the user was tagged.
     * @param postId Post ID. Used for publishing of scheduled and suggested posts.
     * @param guid 
     * @param markAsAds 
     * @param closeComments 
     * @param donutPaidDuration 
     * @param muteNotifications 
     * @param copyright 
     * @param topicId Topic ID. Allowed values can be obtained from newsfeed.getPostTopics method.
     */
    suspend fun post(ownerId: Long? = null, friendsOnly: Boolean? = false, fromGroup: Boolean? = false, message: String? = null, attachments: List<String>? = null, primaryAttachments: List<String>? = null, services: String? = null, signed: Boolean? = false, publishDate: Int? = null, lat: Double? = null, long: Double? = null, placeId: Long? = null, postId: Long? = null, guid: String? = null, markAsAds: Boolean? = false, closeComments: Boolean? = false, donutPaidDuration: Int? = null, muteNotifications: Boolean? = false, copyright: String? = null, topicId: Long? = null): WallPostResponse {
        val response = method("wall.post", mapOf("owner_id" to ownerId, "friends_only" to friendsOnly, "from_group" to fromGroup, "message" to message, "attachments" to attachments, "primary_attachments" to primaryAttachments, "services" to services, "signed" to signed, "publish_date" to publishDate, "lat" to lat, "long" to long, "place_id" to placeId, "post_id" to postId, "guid" to guid, "mark_as_ads" to markAsAds, "close_comments" to closeComments, "donut_paid_duration" to donutPaidDuration, "mute_notifications" to muteNotifications, "copyright" to copyright, "topic_id" to topicId))
        return decodeResponse(response, json)
    }

    /**
     *
     * Allows to create hidden post which will not be shown on the community's wall and can be used for creating an ad with type "Community post".
     * 
     * @param ownerId User ID or community ID. Use a negative value to designate a community ID.
     * @param message (Required if 'attachments' is not set.) Text of the post.
     * @param attachments (Required if 'message' is not set.) List of objects attached to the post, in the following format: "<owner_id>_<media_id>,<owner_id>_<media_id>", '' - Type of media attachment: 'photo' - photo, 'video' - video, 'audio' - audio, 'doc' - document, 'page' - wiki-page, 'note' - note, 'poll' - poll, 'album' - photo album, '<owner_id>' - ID of the media application owner. '<media_id>' - Media application ID. Example: "photo100172_166443618,photo66748_265827614", May contain a link to an external page to include in the post. Example: "photo66748_265827614,http://habrahabr.ru", "NOTE: If more than one link is being attached, an error will be thrown.".
     * @param signed Only for posts in communities with 'from_group' set to '1': '1' - post will be signed with the name of the posting user, '0' - post will not be signed (default).
     * @param lat Geographical latitude of a check-in, in degrees (from -90 to 90).
     * @param long Geographical longitude of a check-in, in degrees (from -180 to 180).
     * @param placeId ID of the location where the user was tagged.
     * @param guid Unique identifier to avoid duplication the same post.
     * @param linkButton Link button ID.
     * @param linkTitle Link title.
     * @param linkImage Link image url.
     * @param linkVideo Link video ID in format "<owner_id>_<media_id>".
     */
    suspend fun postAdsStealth(ownerId: Long, message: String? = null, attachments: List<String>? = null, signed: Boolean? = false, lat: Double? = null, long: Double? = null, placeId: Long? = null, guid: String? = null, linkButton: String? = null, linkTitle: String? = null, linkImage: String? = null, linkVideo: String? = null): WallPostAdsStealthResponse {
        val response = method("wall.postAdsStealth", mapOf("owner_id" to ownerId, "message" to message, "attachments" to attachments, "signed" to signed, "lat" to lat, "long" to long, "place_id" to placeId, "guid" to guid, "link_button" to linkButton, "link_title" to linkTitle, "link_image" to linkImage, "link_video" to linkVideo))
        return decodeResponse(response, json)
    }

    /**
     *
     * Reports (submits a complaint about) a comment on a post on a user wall or community wall.
     * 
     * @param ownerId ID of the user or community that owns the wall.
     * @param commentId Comment ID.
     * @param reason Reason for the complaint: '0' - spam, '1' - child pornography, '2' - extremism, '3' - violence, '4' - drug propaganda, '5' - adult material, '6' - insult, abuse.
     */
    suspend fun reportComment(ownerId: Long, commentId: Long, reason: Int? = null): BaseOkResponse {
        val response = method("wall.reportComment", mapOf("owner_id" to ownerId, "comment_id" to commentId, "reason" to reason))
        return decodeResponse(response, json)
    }

    /**
     *
     * Reports (submits a complaint about) a post on a user wall or community wall.
     * 
     * @param ownerId ID of the user or community that owns the wall.
     * @param postId Post ID.
     * @param reason Reason for the complaint: '0' - spam, '1' - child pornography, '2' - extremism, '3' - violence, '4' - drug propaganda, '5' - adult material, '6' - insult, abuse.
     */
    suspend fun reportPost(ownerId: Long, postId: Long, reason: Int? = null): BaseOkResponse {
        val response = method("wall.reportPost", mapOf("owner_id" to ownerId, "post_id" to postId, "reason" to reason))
        return decodeResponse(response, json)
    }

    /**
     *
     * Reposts (copies) an object to a user wall or community wall.
     * 
     * @param object_ ID of the object to be reposted on the wall. Example: "wall66748_3675".
     * @param message Comment to be added along with the reposted object.
     * @param groupId Target community ID when reposting to a community.
     * @param markAsAds 
     * @param muteNotifications 
     */
    suspend fun repost(object_: String, message: String? = null, groupId: Long? = null, markAsAds: Boolean? = false, muteNotifications: Boolean? = false): WallRepostResponse {
        val response = method("wall.repost", mapOf("object_" to object_, "message" to message, "group_id" to groupId, "mark_as_ads" to markAsAds, "mute_notifications" to muteNotifications))
        return decodeResponse(response, json)
    }

    /**
     *
     * Restores a post deleted from a user wall or community wall.
     * 
     * @param ownerId User ID or community ID from whose wall the post was deleted. Use a negative value to designate a community ID.
     * @param postId ID of the post to be restored.
     */
    suspend fun restore(ownerId: Long? = null, postId: Long? = null): BaseOkResponse {
        val response = method("wall.restore", mapOf("owner_id" to ownerId, "post_id" to postId))
        return decodeResponse(response, json)
    }

    /**
     *
     * Restores a comment deleted from a user wall or community wall.
     * 
     * @param ownerId User ID or community ID. Use a negative value to designate a community ID.
     * @param commentId Comment ID.
     */
    suspend fun restoreComment(commentId: Long, ownerId: Long? = null): BaseOkResponse {
        val response = method("wall.restoreComment", mapOf("owner_id" to ownerId, "comment_id" to commentId))
        return decodeResponse(response, json)
    }

    /**
     *
     * Allows to search posts on user or community walls.
     * 
     * @param ownerId user or community id. "Remember that for a community 'owner_id' must be negative.".
     * @param domain user or community screen name.
     * @param query search query string.
     * @param ownersOnly '1' - returns only page owner's posts.
     * @param count count of posts to return.
     * @param offset Offset needed to return a specific subset of posts.
     * @param extended show extended post info.
     * @param fields 
     */
    suspend fun search(ownerId: Long? = null, domain: String? = null, query: String? = null, ownersOnly: Boolean? = false, count: Int? = 20, offset: Int? = 0, extended: Boolean? = false, fields: List<BaseUserGroupFields>? = null): SearchResponse {
        val response = method("wall.search", mapOf("owner_id" to ownerId, "domain" to domain, "query" to query, "owners_only" to ownersOnly, "count" to count, "offset" to offset, "extended" to extended, "fields" to fields))
        return SearchResponse(response, json)
    }
    class SearchResponse(
        private val rawResponse: String, json: Json
    ): BaseMultivariateResponse(json) {
        fun WallSearchExtendedResponse(): WallSearchExtendedResponse? {
            return getResponseOrNull(WallSearchExtendedResponse.serializer(), rawResponse)
        }
        fun WallSearchResponse(): WallSearchResponse? {
            return getResponseOrNull(WallSearchResponse.serializer(), rawResponse)
        }
    }

    /**
     *
     * Unpins the post on wall.
     * 
     * @param ownerId ID of the user or community that owns the wall. By default, current user ID. Use a negative value to designate a community ID.
     * @param postId Post ID.
     */
    suspend fun unpin(postId: Long, ownerId: Long? = null): BaseOkResponse {
        val response = method("wall.unpin", mapOf("owner_id" to ownerId, "post_id" to postId))
        return decodeResponse(response, json)
    }

}
