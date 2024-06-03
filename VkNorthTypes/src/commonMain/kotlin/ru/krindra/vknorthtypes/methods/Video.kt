package ru.krindra.vknorthtypes.methods

import ru.krindra.vknorthtypes.types.video.*
import kotlinx.serialization.json.Json
import ru.krindra.vknorthtypes.JsonSingleton
import kotlinx.serialization.builtins.serializer
import kotlinx.serialization.builtins.ListSerializer
import ru.krindra.vknorthtypes.types.base.BaseOkResponse
import ru.krindra.vknorthtypes.types.base.BaseBoolResponse
import ru.krindra.vknorthtypes.BaseMultivariateResponse

class Video(
    private val method: suspend (String, Map<String, Any?>?) -> String,
    private val json: Json = JsonSingleton.json
    ) {
    /**
     *
     * Adds a video to a user or community page.
     * 
     * @param targetId identifier of a user or community to add a video to. Use a negative value to designate a community ID.
     * @param videoId Video ID.
     * @param ownerId ID of the user or community that owns the video. Use a negative value to designate a community ID.
     */
    suspend fun add(videoId: Long, ownerId: Long, targetId: Long? = null): BaseOkResponse {
        val response = method("video.add", mapOf("target_id" to targetId, "video_id" to videoId, "owner_id" to ownerId))
        return decodeResponse(response, json)
    }

    /**
     *
     * Creates an empty album for videos.
     * 
     * @param groupId Community ID (if the album will be created in a community).
     * @param title Album title.
     * @param privacy new access permissions for the album. Possible values: , *'0' - all users,, *'1' - friends only,, *'2' - friends and friends of friends,, *'3' - "only me".
     */
    suspend fun addAlbum(groupId: Long? = null, title: String? = null, privacy: List<String>? = null): VideoAddAlbumResponse {
        val response = method("video.addAlbum", mapOf("group_id" to groupId, "title" to title, "privacy" to privacy))
        return decodeResponse(response, json)
    }

    /**
     *
     * @param targetId 
     * @param albumId 
     * @param albumIds 
     * @param ownerId 
     * @param videoId 
     */
    suspend fun addToAlbum(ownerId: Long, videoId: Long, targetId: Long? = null, albumId: Long? = null, albumIds: List<Int>? = null): AddToAlbumResponse {
        val response = method("video.addToAlbum", mapOf("target_id" to targetId, "album_id" to albumId, "album_ids" to albumIds, "owner_id" to ownerId, "video_id" to videoId))
        return AddToAlbumResponse(response, json)
    }
    class AddToAlbumResponse(
        private val rawResponse: String, json: Json
    ): BaseMultivariateResponse(json) {
        fun BaseOkResponse(): BaseOkResponse? {
            return getResponseOrNull(Int.serializer(), rawResponse)
        }
        fun VideoChangeVideoAlbumsResponse(): VideoChangeVideoAlbumsResponse? {
            return getResponseOrNull(ListSerializer(Int.serializer()), rawResponse)
        }
    }

    /**
     *
     * Adds a new comment on a video.
     * 
     * @param ownerId ID of the user or community that owns the video.
     * @param videoId Video ID.
     * @param message New comment text.
     * @param attachments List of objects attached to the comment, in the following format: "<owner_id>_<media_id>,<owner_id>_<media_id>", '' - Type of media attachment: 'photo' - photo, 'video' - video, 'audio' - audio, 'doc' - document, '<owner_id>' - ID of the media attachment owner. '<media_id>' - Media attachment ID. Example: "photo100172_166443618,photo66748_265827614".
     * @param fromGroup '1' - to post the comment from a community name (only if 'owner_id'<0).
     * @param replyToComment 
     * @param stickerId 
     * @param guid 
     * @param trackCode 
     */
    suspend fun createComment(videoId: Long, ownerId: Long? = null, message: String? = null, attachments: List<String>? = null, fromGroup: Boolean? = false, replyToComment: Int? = null, stickerId: Long? = null, guid: String? = null, trackCode: String? = null): VideoCreateCommentResponse {
        val response = method("video.createComment", mapOf("owner_id" to ownerId, "video_id" to videoId, "message" to message, "attachments" to attachments, "from_group" to fromGroup, "reply_to_comment" to replyToComment, "sticker_id" to stickerId, "guid" to guid, "track_code" to trackCode))
        return decodeResponse(response, json)
    }

    /**
     *
     * Deletes a video from a user or community page.
     * 
     * @param videoId Video ID.
     * @param ownerId ID of the user or community that owns the video.
     * @param targetId 
     */
    suspend fun delete(videoId: Long, ownerId: Long? = null, targetId: Long? = null): BaseOkResponse {
        val response = method("video.delete", mapOf("video_id" to videoId, "owner_id" to ownerId, "target_id" to targetId))
        return decodeResponse(response, json)
    }

    /**
     *
     * Deletes a video album.
     * 
     * @param groupId Community ID (if the album is owned by a community).
     * @param albumId Album ID.
     */
    suspend fun deleteAlbum(albumId: Long, groupId: Long? = null): BaseOkResponse {
        val response = method("video.deleteAlbum", mapOf("group_id" to groupId, "album_id" to albumId))
        return decodeResponse(response, json)
    }

    /**
     *
     * Deletes a comment on a video.
     * 
     * @param ownerId ID of the user or community that owns the video.
     * @param commentId ID of the comment to be deleted.
     */
    suspend fun deleteComment(commentId: Long, ownerId: Long? = null): BaseOkResponse {
        val response = method("video.deleteComment", mapOf("owner_id" to ownerId, "comment_id" to commentId))
        return decodeResponse(response, json)
    }

    /**
     *
     * Edits information about a video on a user or community page.
     * 
     * @param ownerId ID of the user or community that owns the video.
     * @param videoId Video ID.
     * @param name New video title.
     * @param desc New video description.
     * @param privacyView Privacy settings in a [vk.com/dev/privacy_setting|special format]. Privacy setting is available for videos uploaded to own profile by user.
     * @param privacyComment Privacy settings for comments in a [vk.com/dev/privacy_setting|special format].
     * @param noComments Disable comments for the group video.
     * @param repeat '1' - to repeat the playback of the video, '0' - to play the video once,.
     */
    suspend fun edit(videoId: Long, ownerId: Long? = null, name: String? = null, desc: String? = null, privacyView: List<String>? = null, privacyComment: List<String>? = null, noComments: Boolean? = false, repeat: Boolean? = false): VideoEditResponse {
        val response = method("video.edit", mapOf("owner_id" to ownerId, "video_id" to videoId, "name" to name, "desc" to desc, "privacy_view" to privacyView, "privacy_comment" to privacyComment, "no_comments" to noComments, "repeat" to repeat))
        return decodeResponse(response, json)
    }

    /**
     *
     * Edits the title of a video album.
     * 
     * @param groupId Community ID (if the album edited is owned by a community).
     * @param albumId Album ID.
     * @param title New album title.
     * @param privacy new access permissions for the album. Possible values: , *'0' - all users,, *'1' - friends only,, *'2' - friends and friends of friends,, *'3' - "only me".
     */
    suspend fun editAlbum(albumId: Long, groupId: Long? = null, title: String? = null, privacy: List<String>? = null): BaseOkResponse {
        val response = method("video.editAlbum", mapOf("group_id" to groupId, "album_id" to albumId, "title" to title, "privacy" to privacy))
        return decodeResponse(response, json)
    }

    /**
     *
     * Edits the text of a comment on a video.
     * 
     * @param ownerId ID of the user or community that owns the video.
     * @param commentId Comment ID.
     * @param message New comment text.
     * @param attachments List of objects attached to the comment, in the following format: "<owner_id>_<media_id>,<owner_id>_<media_id>", '' - Type of media attachment: 'photo' - photo, 'video' - video, 'audio' - audio, 'doc' - document, '<owner_id>' - ID of the media attachment owner. '<media_id>' - Media attachment ID. Example: "photo100172_166443618,photo66748_265827614".
     */
    suspend fun editComment(commentId: Long, ownerId: Long? = null, message: String? = null, attachments: List<String>? = null): BaseOkResponse {
        val response = method("video.editComment", mapOf("owner_id" to ownerId, "comment_id" to commentId, "message" to message, "attachments" to attachments))
        return decodeResponse(response, json)
    }

    /**
     *
     * Returns detailed information about videos.
     * 
     * @param ownerId ID of the user or community that owns the video(s).
     * @param videos Video IDs, in the following format: "<owner_id>_<media_id>,<owner_id>_<media_id>", Use a negative value to designate a community ID. Example: "-4363_136089719,13245770_137352259".
     * @param albumId ID of the album containing the video(s).
     * @param count Number of videos to return.
     * @param offset Offset needed to return a specific subset of videos.
     * @param extended '1' - to return an extended response with additional fields.
     * @param fields 
     * @param sortAlbum Sort order: '0' - newest video first, '1' - oldest video first.
     */
    suspend fun get(ownerId: Long? = null, videos: List<String>? = null, albumId: Long? = null, count: Int? = 100, offset: Int? = null, extended: Boolean? = false, fields: List<String>? = null, sortAlbum: Int? = 0): VideoGetResponse {
        val response = method("video.get", mapOf("owner_id" to ownerId, "videos" to videos, "album_id" to albumId, "count" to count, "offset" to offset, "extended" to extended, "fields" to fields, "sort_album" to sortAlbum))
        return decodeResponse(response, json)
    }

    /**
     *
     * Returns video album info
     * 
     * @param ownerId identifier of a user or community to add a video to. Use a negative value to designate a community ID.
     * @param albumId Album ID.
     */
    suspend fun getAlbumById(albumId: Long, ownerId: Long? = null): VideoGetAlbumByIdResponse {
        val response = method("video.getAlbumById", mapOf("owner_id" to ownerId, "album_id" to albumId))
        return decodeResponse(response, json)
    }

    /**
     *
     * Returns a list of video albums owned by a user or community.
     * 
     * @param ownerId ID of the user or community that owns the video album(s).
     * @param offset Offset needed to return a specific subset of video albums.
     * @param count Number of video albums to return.
     * @param extended '1' - to return additional information about album privacy settings for the current user.
     * @param needSystem 
     */
    suspend fun getAlbums(ownerId: Long? = null, offset: Int? = null, count: Int? = 50, extended: Boolean? = false, needSystem: Boolean? = false): GetAlbumsResponse {
        val response = method("video.getAlbums", mapOf("owner_id" to ownerId, "offset" to offset, "count" to count, "extended" to extended, "need_system" to needSystem))
        return GetAlbumsResponse(response, json)
    }
    class GetAlbumsResponse(
        private val rawResponse: String, json: Json
    ): BaseMultivariateResponse(json) {
        fun VideoGetAlbumsExtendedResponse(): VideoGetAlbumsExtendedResponse? {
            return getResponseOrNull(VideoGetAlbumsExtendedResponse.serializer(), rawResponse)
        }
        fun VideoGetAlbumsResponse(): VideoGetAlbumsResponse? {
            return getResponseOrNull(VideoGetAlbumsResponse.serializer(), rawResponse)
        }
    }

    /**
     *
     * @param targetId 
     * @param ownerId 
     * @param videoId 
     * @param extended 
     */
    suspend fun getAlbumsByVideo(ownerId: Long, videoId: Long, targetId: Long? = null, extended: Boolean? = false): GetAlbumsByVideoResponse {
        val response = method("video.getAlbumsByVideo", mapOf("target_id" to targetId, "owner_id" to ownerId, "video_id" to videoId, "extended" to extended))
        return GetAlbumsByVideoResponse(response, json)
    }
    class GetAlbumsByVideoResponse(
        private val rawResponse: String, json: Json
    ): BaseMultivariateResponse(json) {
        fun VideoGetAlbumsByVideoExtendedResponse(): VideoGetAlbumsByVideoExtendedResponse? {
            return getResponseOrNull(VideoGetAlbumsByVideoExtendedResponse.serializer(), rawResponse)
        }
        fun VideoGetAlbumsByVideoResponse(): VideoGetAlbumsByVideoResponse? {
            return getResponseOrNull(ListSerializer(Int.serializer()), rawResponse)
        }
    }

    /**
     *
     * Returns a list of comments on a video.
     * 
     * @param ownerId ID of the user or community that owns the video.
     * @param videoId Video ID.
     * @param needLikes '1' - to return an additional 'likes' field.
     * @param startCommentId 
     * @param offset Offset needed to return a specific subset of comments.
     * @param count Number of comments to return.
     * @param sort Sort order: 'asc' - oldest comment first, 'desc' - newest comment first.
     * @param extended 
     * @param fields 
     */
    suspend fun getComments(videoId: Long, ownerId: Long? = null, needLikes: Boolean? = false, startCommentId: Long? = null, offset: Int? = null, count: Int? = 20, sort: String? = "asc", extended: Boolean? = false, fields: List<String>? = null): GetCommentsResponse {
        val response = method("video.getComments", mapOf("owner_id" to ownerId, "video_id" to videoId, "need_likes" to needLikes, "start_comment_id" to startCommentId, "offset" to offset, "count" to count, "sort" to sort, "extended" to extended, "fields" to fields))
        return GetCommentsResponse(response, json)
    }
    class GetCommentsResponse(
        private val rawResponse: String, json: Json
    ): BaseMultivariateResponse(json) {
        fun VideoGetCommentsExtendedResponse(): VideoGetCommentsExtendedResponse? {
            return getResponseOrNull(VideoGetCommentsExtendedResponse.serializer(), rawResponse)
        }
        fun VideoGetCommentsResponse(): VideoGetCommentsResponse? {
            return getResponseOrNull(VideoGetCommentsResponse.serializer(), rawResponse)
        }
    }

    /**
     *
     * @param ownerId 
     * @param videoId 
     */
    suspend fun getLongPollServer(videoId: Long, ownerId: Long? = null): VideoGetLongPollServerResponse {
        val response = method("video.getLongPollServer", mapOf("owner_id" to ownerId, "video_id" to videoId))
        return decodeResponse(response, json)
    }

    /**
     *
     */
    suspend fun liveGetCategories(): VideoLiveGetCategoriesResponse {
        val response = method("video.liveGetCategories", mapOf())
        return decodeResponse(response, json)
    }

    /**
     *
     * @param targetId 
     * @param albumId 
     * @param albumIds 
     * @param ownerId 
     * @param videoId 
     */
    suspend fun removeFromAlbum(ownerId: Long, videoId: Long, targetId: Long? = null, albumId: Long? = null, albumIds: List<Int>? = null): RemoveFromAlbumResponse {
        val response = method("video.removeFromAlbum", mapOf("target_id" to targetId, "album_id" to albumId, "album_ids" to albumIds, "owner_id" to ownerId, "video_id" to videoId))
        return RemoveFromAlbumResponse(response, json)
    }
    class RemoveFromAlbumResponse(
        private val rawResponse: String, json: Json
    ): BaseMultivariateResponse(json) {
        fun BaseOkResponse(): BaseOkResponse? {
            return getResponseOrNull(Int.serializer(), rawResponse)
        }
        fun VideoChangeVideoAlbumsResponse(): VideoChangeVideoAlbumsResponse? {
            return getResponseOrNull(ListSerializer(Int.serializer()), rawResponse)
        }
    }

    /**
     *
     * Reorders the album in the list of user video albums.
     * 
     * @param ownerId ID of the user or community that owns the albums..
     * @param albumId Album ID.
     * @param before ID of the album before which the album in question shall be placed.
     * @param after ID of the album after which the album in question shall be placed.
     */
    suspend fun reorderAlbums(albumId: Long, ownerId: Long? = null, before: Int? = null, after: Int? = null): BaseOkResponse {
        val response = method("video.reorderAlbums", mapOf("owner_id" to ownerId, "album_id" to albumId, "before" to before, "after" to after))
        return decodeResponse(response, json)
    }

    /**
     *
     * Reorders the video in the video album.
     * 
     * @param targetId ID of the user or community that owns the album with videos.
     * @param albumId ID of the video album.
     * @param ownerId ID of the user or community that owns the video.
     * @param videoId ID of the video.
     * @param beforeOwnerId ID of the user or community that owns the video before which the video in question shall be placed.
     * @param beforeVideoId ID of the video before which the video in question shall be placed.
     * @param afterOwnerId ID of the user or community that owns the video after which the photo in question shall be placed.
     * @param afterVideoId ID of the video after which the photo in question shall be placed.
     */
    suspend fun reorderVideos(ownerId: Long, videoId: Long, targetId: Long? = null, albumId: Long? = -2, beforeOwnerId: Long? = null, beforeVideoId: Long? = null, afterOwnerId: Long? = null, afterVideoId: Long? = null): BaseOkResponse {
        val response = method("video.reorderVideos", mapOf("target_id" to targetId, "album_id" to albumId, "owner_id" to ownerId, "video_id" to videoId, "before_owner_id" to beforeOwnerId, "before_video_id" to beforeVideoId, "after_owner_id" to afterOwnerId, "after_video_id" to afterVideoId))
        return decodeResponse(response, json)
    }

    /**
     *
     * Reports (submits a complaint about) a video.
     * 
     * @param ownerId ID of the user or community that owns the video.
     * @param videoId Video ID.
     * @param reason Reason for the complaint: '0' - spam, '1' - child pornography, '2' - extremism, '3' - violence, '4' - drug propaganda, '5' - adult material, '6' - insult, abuse.
     * @param comment Comment describing the complaint.
     * @param searchQuery (If the video was found in search results.) Search query string.
     */
    suspend fun report(ownerId: Long, videoId: Long, reason: Int? = null, comment: String? = null, searchQuery: String? = null): BaseOkResponse {
        val response = method("video.report", mapOf("owner_id" to ownerId, "video_id" to videoId, "reason" to reason, "comment" to comment, "search_query" to searchQuery))
        return decodeResponse(response, json)
    }

    /**
     *
     * Reports (submits a complaint about) a comment on a video.
     * 
     * @param ownerId ID of the user or community that owns the video.
     * @param commentId ID of the comment being reported.
     * @param reason Reason for the complaint: , 0 - spam , 1 - child pornography , 2 - extremism , 3 - violence , 4 - drug propaganda , 5 - adult material , 6 - insult, abuse.
     */
    suspend fun reportComment(ownerId: Long, commentId: Long, reason: Int? = null): BaseOkResponse {
        val response = method("video.reportComment", mapOf("owner_id" to ownerId, "comment_id" to commentId, "reason" to reason))
        return decodeResponse(response, json)
    }

    /**
     *
     * Restores a previously deleted video.
     * 
     * @param videoId Video ID.
     * @param ownerId ID of the user or community that owns the video.
     */
    suspend fun restore(videoId: Long, ownerId: Long? = null): BaseOkResponse {
        val response = method("video.restore", mapOf("video_id" to videoId, "owner_id" to ownerId))
        return decodeResponse(response, json)
    }

    /**
     *
     * Restores a previously deleted comment on a video.
     * 
     * @param ownerId ID of the user or community that owns the video.
     * @param commentId ID of the deleted comment.
     */
    suspend fun restoreComment(commentId: Long, ownerId: Long? = null): BaseBoolResponse {
        val response = method("video.restoreComment", mapOf("owner_id" to ownerId, "comment_id" to commentId))
        return decodeResponse(response, json)
    }

    /**
     *
     * Returns a server address (required for upload) and video data.
     * 
     * @param name Name of the video.
     * @param description Description of the video.
     * @param isPrivate '1' - to designate the video as private (send it via a private message), the video will not appear on the user's video list and will not be available by ID for other users, '0' - not to designate the video as private.
     * @param wallpost '1' - to post the saved video on a user's wall, '0' - not to post the saved video on a user's wall.
     * @param link URL for embedding the video from an external website.
     * @param groupId ID of the community in which the video will be saved. By default, the current user's page.
     * @param albumId ID of the album to which the saved video will be added.
     * @param privacyView 
     * @param privacyComment 
     * @param noComments 
     * @param repeat '1' - to repeat the playback of the video, '0' - to play the video once,.
     * @param compression 
     */
    suspend fun save(name: String? = null, description: String? = null, isPrivate: Boolean? = false, wallpost: Boolean? = false, link: String? = null, groupId: Long? = null, albumId: Long? = null, privacyView: List<String>? = null, privacyComment: List<String>? = null, noComments: Boolean? = false, repeat: Boolean? = false, compression: Boolean? = false): VideoSaveResponse {
        val response = method("video.save", mapOf("name" to name, "description" to description, "is_private" to isPrivate, "wallpost" to wallpost, "link" to link, "group_id" to groupId, "album_id" to albumId, "privacy_view" to privacyView, "privacy_comment" to privacyComment, "no_comments" to noComments, "repeat" to repeat, "compression" to compression))
        return decodeResponse(response, json)
    }

    /**
     *
     * Returns a list of videos under the set search criterion.
     * 
     * @param q Search query string (e.g., 'The Beatles').
     * @param sort Sort order: '1' - by duration, '2' - by relevance, '0' - by date added.
     * @param hd If not null, only searches for high-definition videos.
     * @param adult '1' - to disable the Safe Search filter, '0' - to enable the Safe Search filter.
     * @param live 
     * @param filters Filters to apply: 'youtube' - return YouTube videos only, 'vimeo' - return Vimeo videos only, 'short' - return short videos only, 'long' - return long videos only.
     * @param searchOwn 
     * @param offset Offset needed to return a specific subset of videos.
     * @param longer 
     * @param shorter 
     * @param count Number of videos to return.
     * @param extended 
     * @param ownerId 
     * @param fields 
     */
    suspend fun search(q: String? = null, sort: Int? = null, hd: Int? = null, adult: Boolean? = false, live: Boolean? = false, filters: List<String>? = null, searchOwn: Boolean? = false, offset: Int? = null, longer: Int? = null, shorter: Int? = null, count: Int? = 20, extended: Boolean? = false, ownerId: Long? = null, fields: List<String>? = null): SearchResponse {
        val response = method("video.search", mapOf("q" to q, "sort" to sort, "hd" to hd, "adult" to adult, "live" to live, "filters" to filters, "search_own" to searchOwn, "offset" to offset, "longer" to longer, "shorter" to shorter, "count" to count, "extended" to extended, "owner_id" to ownerId, "fields" to fields))
        return SearchResponse(response, json)
    }
    class SearchResponse(
        private val rawResponse: String, json: Json
    ): BaseMultivariateResponse(json) {
        fun VideoSearchExtendedResponse(): VideoSearchExtendedResponse? {
            return getResponseOrNull(VideoSearchExtendedResponse.serializer(), rawResponse)
        }
        fun VideoSearchResponse(): VideoSearchResponse? {
            return getResponseOrNull(VideoSearchResponse.serializer(), rawResponse)
        }
    }

    /**
     *
     * @param videoId 
     * @param name 
     * @param description 
     * @param wallpost 
     * @param groupId 
     * @param privacyView 
     * @param privacyComment 
     * @param noComments 
     * @param categoryId 
     * @param publish 
     */
    suspend fun startStreaming(videoId: Long? = null, name: String? = null, description: String? = null, wallpost: Boolean? = false, groupId: Long? = null, privacyView: List<String>? = null, privacyComment: List<String>? = null, noComments: Boolean? = false, categoryId: Long? = null, publish: Boolean? = false): VideoStartStreamingResponse {
        val response = method("video.startStreaming", mapOf("video_id" to videoId, "name" to name, "description" to description, "wallpost" to wallpost, "group_id" to groupId, "privacy_view" to privacyView, "privacy_comment" to privacyComment, "no_comments" to noComments, "category_id" to categoryId, "publish" to publish))
        return decodeResponse(response, json)
    }

    /**
     *
     * @param groupId 
     * @param videoId 
     */
    suspend fun stopStreaming(groupId: Long? = null, videoId: Long? = null): VideoStopStreamingResponse {
        val response = method("video.stopStreaming", mapOf("group_id" to groupId, "video_id" to videoId))
        return decodeResponse(response, json)
    }

    /**
     *
     * Unpin comment of a video.
     * 
     * @param ownerId ID of the user or community that owns the video.
     * @param commentId 
     */
    suspend fun unpinComment(ownerId: Long, commentId: Long): BaseOkResponse {
        val response = method("video.unpinComment", mapOf("owner_id" to ownerId, "comment_id" to commentId))
        return decodeResponse(response, json)
    }

}
