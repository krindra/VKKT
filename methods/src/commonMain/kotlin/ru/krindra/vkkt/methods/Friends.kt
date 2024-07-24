package ru.krindra.vkkt.methods

import ru.krindra.vkkt.responses.friends.*
import ru.krindra.vkkt.objects.friends.*
import ru.krindra.vkkt.utils.JsonSingleton
import kotlinx.serialization.json.Json
import kotlinx.serialization.builtins.serializer
import ru.krindra.vkkt.objects.users.UsersFields
import kotlinx.serialization.builtins.ListSerializer
import ru.krindra.vkkt.responses.base.BaseOkResponse

class Friends(
    private val method: suspend (String, Map<String, Any?>?) -> String,
    private val json: Json = JsonSingleton.json
    ) {
    /**
     *
     * Approves or creates a friend request.
     * 
     * @param userId ID of the user whose friend request will be approved or to whom a friend request will be sent.
     * @param text Text of the message (up to 500 characters) for the friend request, if any.
     * @param follow '1' to pass an incoming request to followers list.
     */
    suspend fun add(userId: Int? = null, text: String? = null, follow: Boolean? = false): FriendsAddResponse {
        val response = method("friends.add", mapOf("user_id" to userId, "text" to text, "follow" to follow))
        return decodeResponse(response, json)
    }

    /**
     *
     * Creates a new friend list for the current user.
     * 
     * @param name Name of the friend list.
     * @param userIds IDs of users to be added to the friend list.
     */
    suspend fun addList(name: String, userIds: List<Int>? = null): FriendsAddListResponse {
        val response = method("friends.addList", mapOf("name" to name, "user_ids" to userIds))
        return decodeResponse(response, json)
    }

    /**
     *
     * Checks the current user's friendship status with other specified users.
     * 
     * @param userIds IDs of the users whose friendship status to check.
     * @param needSign '1' - to return 'sign' field. 'sign' is md5("{id}_{user_id}_{friends_status}_{application_secret}"), where id is current user ID. This field allows to check that data has not been modified by the client. By default: '0'.
     * @param extended Return friend request read_state field.
     */
    suspend fun areFriends(userIds: List<Int>, needSign: Boolean? = false, extended: Boolean? = false): AreFriendsResponse {
        val response = method("friends.areFriends", mapOf("user_ids" to userIds, "need_sign" to needSign, "extended" to extended))
        return AreFriendsResponse(response, json)
    }
    class AreFriendsResponse(
        private val rawResponse: String, json: Json
    ): BaseMultivariateResponse(json) {
        fun FriendsAreFriendsExtendedResponse(): FriendsAreFriendsExtendedResponse? {
            return getResponseOrNull(ListSerializer(FriendsFriendExtendedStatus.serializer()), rawResponse)
        }
        fun FriendsAreFriendsResponse(): FriendsAreFriendsResponse? {
            return getResponseOrNull(ListSerializer(FriendsFriendStatus.serializer()), rawResponse)
        }
    }

    /**
     *
     * Declines a friend request or deletes a user from the current user's friend list.
     * 
     * @param userId ID of the user whose friend request is to be declined or who is to be deleted from the current user's friend list.
     */
    suspend fun delete(userId: Int? = null): FriendsDeleteResponse {
        val response = method("friends.delete", mapOf("user_id" to userId))
        return decodeResponse(response, json)
    }

    /**
     *
     * Marks all incoming friend requests as viewed.
     * 
     */
    suspend fun deleteAllRequests(): BaseOkResponse {
        val response = method("friends.deleteAllRequests", mapOf())
        return decodeResponse(response, json)
    }

    /**
     *
     * Deletes a friend list of the current user.
     * 
     * @param listId ID of the friend list to delete.
     */
    suspend fun deleteList(listId: Int): BaseOkResponse {
        val response = method("friends.deleteList", mapOf("list_id" to listId))
        return decodeResponse(response, json)
    }

    /**
     *
     * Edits the friend lists of the selected user.
     * 
     * @param userId ID of the user whose friend list is to be edited.
     * @param listIds IDs of the friend lists to which to add the user.
     */
    suspend fun edit(userId: Int, listIds: List<Int>? = null): BaseOkResponse {
        val response = method("friends.edit", mapOf("user_id" to userId, "list_ids" to listIds))
        return decodeResponse(response, json)
    }

    /**
     *
     * Edits a friend list of the current user.
     * 
     * @param name Name of the friend list.
     * @param listId Friend list ID.
     * @param userIds IDs of users in the friend list.
     * @param addUserIds (Applies if 'user_ids' parameter is not set.), User IDs to add to the friend list.
     * @param deleteUserIds (Applies if 'user_ids' parameter is not set.), User IDs to delete from the friend list.
     */
    suspend fun editList(listId: Int, name: String? = null, userIds: List<Int>? = null, addUserIds: List<Int>? = null, deleteUserIds: List<Int>? = null): BaseOkResponse {
        val response = method("friends.editList", mapOf("name" to name, "list_id" to listId, "user_ids" to userIds, "add_user_ids" to addUserIds, "delete_user_ids" to deleteUserIds))
        return decodeResponse(response, json)
    }

    /**
     *
     * Returns a list of user IDs or detailed information about a user's friends.
     * 
     * @param userId User ID. By default, the current user ID.
     * @param order Sort order: , 'name' - by name (enabled only if the 'fields' parameter is used), 'hints' - by rating, similar to how friends are sorted in My friends section, , This parameter is available only for [vk.com/dev/standalone|desktop applications].
     * @param listId ID of the friend list returned by the [vk.com/dev/friends.getLists|friends.getLists] method to be used as the source. This parameter is taken into account only when the uid parameter is set to the current user ID. This parameter is available only for [vk.com/dev/standalone|desktop applications].
     * @param count Number of friends to return.
     * @param offset Offset needed to return a specific subset of friends.
     * @param fields Profile fields to return. Sample values: 'uid', 'first_name', 'last_name', 'nickname', 'sex', 'bdate' (birthdate), 'city', 'country', 'timezone', 'photo', 'photo_medium', 'photo_big', 'domain', 'has_mobile', 'rate', 'contacts', 'education'.
     * @param ref 
     */
    suspend fun get(userId: Int? = null, order: String? = null, listId: Int? = null, count: Int? = 5000, offset: Int? = null, fields: List<UsersFields>? = null, ref: String? = null): GetResponse {
        val response = method("friends.get", mapOf("user_id" to userId, "order" to order, "list_id" to listId, "count" to count, "offset" to offset, "fields" to fields, "ref" to ref))
        return GetResponse(response, json)
    }
    class GetResponse(
        private val rawResponse: String, json: Json
    ): BaseMultivariateResponse(json) {
        fun FriendsGetFieldsResponse(): FriendsGetFieldsResponse? {
            return getResponseOrNull(FriendsGetFieldsResponse.serializer(), rawResponse)
        }
        fun FriendsGetResponse(): FriendsGetResponse? {
            return getResponseOrNull(FriendsGetResponse.serializer(), rawResponse)
        }
    }

    /**
     *
     * Returns a list of IDs of the current user's friends who installed the application.
     * 
     */
    suspend fun getAppUsers(): FriendsGetAppUsersResponse {
        val response = method("friends.getAppUsers", mapOf())
        return decodeResponse(response, json)
    }

    /**
     *
     * Returns a list of the current user's friends whose phone numbers, validated or specified in a profile, are in a given list.
     * 
     * @param phones List of phone numbers in MSISDN format (maximum 1000). Example: "+79219876543,+79111234567".
     * @param fields Profile fields to return. Sample values: 'nickname', 'screen_name', 'sex', 'bdate' (birthdate), 'city', 'country', 'timezone', 'photo', 'photo_medium', 'photo_big', 'has_mobile', 'rate', 'contacts', 'education', 'online, counters'.
     */
    suspend fun getByPhones(phones: List<String>? = null, fields: List<UsersFields>? = null): FriendsGetByPhonesResponse {
        val response = method("friends.getByPhones", mapOf("phones" to phones, "fields" to fields))
        return decodeResponse(response, json)
    }

    /**
     *
     * Returns a list of the user's friend lists.
     * 
     * @param userId User ID.
     * @param returnSystem '1' - to return system friend lists. By default: '0'.
     */
    suspend fun getLists(userId: Int? = null, returnSystem: Boolean? = false): FriendsGetListsResponse {
        val response = method("friends.getLists", mapOf("user_id" to userId, "return_system" to returnSystem))
        return decodeResponse(response, json)
    }

    /**
     *
     * Returns a list of user IDs of the mutual friends of two users.
     * 
     * @param sourceUid ID of the user whose friends will be checked against the friends of the user specified in 'target_uid'.
     * @param targetUid ID of the user whose friends will be checked against the friends of the user specified in 'source_uid'.
     * @param targetUids IDs of the users whose friends will be checked against the friends of the user specified in 'source_uid'.
     * @param order Sort order: 'random' - random order.
     * @param count Number of mutual friends to return.
     * @param offset Offset needed to return a specific subset of mutual friends.
     */
    suspend fun getMutual(sourceUid: Int? = null, targetUid: Int? = null, targetUids: List<Int>? = null, order: String? = null, count: Int? = null, offset: Int? = null): GetMutualResponse {
        val response = method("friends.getMutual", mapOf("source_uid" to sourceUid, "target_uid" to targetUid, "target_uids" to targetUids, "order" to order, "count" to count, "offset" to offset))
        return GetMutualResponse(response, json)
    }
    class GetMutualResponse(
        private val rawResponse: String, json: Json
    ): BaseMultivariateResponse(json) {
        fun FriendsGetMutualResponse(): FriendsGetMutualResponse? {
            return getResponseOrNull(ListSerializer(Int.serializer()), rawResponse)
        }
        fun FriendsGetMutualTargetUidsResponse(): FriendsGetMutualTargetUidsResponse? {
            return getResponseOrNull(ListSerializer(FriendsMutualFriend.serializer()), rawResponse)
        }
    }

    /**
     *
     * Returns a list of user IDs of a user's friends who are online.
     * 
     * @param userId User ID.
     * @param listId Friend list ID. If this parameter is not set, information about all online friends is returned.
     * @param onlineMobile '1' - to return an additional 'online_mobile' field, '0' - (default),.
     * @param order Sort order: 'random' - random order.
     * @param count Number of friends to return.
     * @param offset Offset needed to return a specific subset of friends.
     */
    suspend fun getOnline(userId: Int? = null, listId: Int? = null, onlineMobile: Boolean? = false, order: String? = null, count: Int? = null, offset: Int? = null): GetOnlineResponse {
        val response = method("friends.getOnline", mapOf("user_id" to userId, "list_id" to listId, "online_mobile" to onlineMobile, "order" to order, "count" to count, "offset" to offset))
        return GetOnlineResponse(response, json)
    }
    class GetOnlineResponse(
        private val rawResponse: String, json: Json
    ): BaseMultivariateResponse(json) {
        fun FriendsGetOnlineOnlineMobileResponse(): FriendsGetOnlineOnlineMobileResponse? {
            return getResponseOrNull(FriendsGetOnlineOnlineMobileResponse.serializer(), rawResponse)
        }
        fun FriendsGetOnlineResponse(): FriendsGetOnlineResponse? {
            return getResponseOrNull(ListSerializer(Int.serializer()), rawResponse)
        }
    }

    /**
     *
     * Returns a list of user IDs of the current user's recently added friends.
     * 
     * @param count Number of recently added friends to return.
     */
    suspend fun getRecent(count: Int? = 100): FriendsGetRecentResponse {
        val response = method("friends.getRecent", mapOf("count" to count))
        return decodeResponse(response, json)
    }

    /**
     *
     * Returns information about the current user's incoming and outgoing friend requests.
     * 
     * @param offset Offset needed to return a specific subset of friend requests.
     * @param count Number of friend requests to return (default 100, maximum 1000).
     * @param extended '1' - to return response messages from users who have sent a friend request or, if 'suggested' is set to '1', to return a list of suggested friends.
     * @param needMutual '1' - to return a list of mutual friends (up to 20), if any.
     * @param out '1' - to return outgoing requests, '0' - to return incoming requests (default).
     * @param sort Sort order: '1' - by number of mutual friends, '0' - by date.
     * @param needViewed 
     * @param suggested '1' - to return a list of suggested friends, '0' - to return friend requests (default).
     * @param ref 
     * @param fields 
     */
    suspend fun getRequests(offset: Int? = null, count: Int? = 100, extended: Boolean? = false, needMutual: Boolean? = false, out: Boolean? = false, sort: Int? = null, needViewed: Boolean? = false, suggested: Boolean? = false, ref: String? = null, fields: List<UsersFields>? = null): GetRequestsResponse {
        val response = method("friends.getRequests", mapOf("offset" to offset, "count" to count, "extended" to extended, "need_mutual" to needMutual, "out" to out, "sort" to sort, "need_viewed" to needViewed, "suggested" to suggested, "ref" to ref, "fields" to fields))
        return GetRequestsResponse(response, json)
    }
    class GetRequestsResponse(
        private val rawResponse: String, json: Json
    ): BaseMultivariateResponse(json) {
        fun FriendsGetRequestsExtendedResponse(): FriendsGetRequestsExtendedResponse? {
            return getResponseOrNull(FriendsGetRequestsExtendedResponse.serializer(), rawResponse)
        }
        fun FriendsGetRequestsNeedMutualResponse(): FriendsGetRequestsNeedMutualResponse? {
            return getResponseOrNull(FriendsGetRequestsNeedMutualResponse.serializer(), rawResponse)
        }
        fun FriendsGetRequestsResponse(): FriendsGetRequestsResponse? {
            return getResponseOrNull(FriendsGetRequestsResponse.serializer(), rawResponse)
        }
    }

    /**
     *
     * Returns a list of profiles of users whom the current user may know.
     * 
     * @param filter Types of potential friends to return: 'mutual' - users with many mutual friends , 'contacts' - users found with the [vk.com/dev/account.importContacts|account.importContacts] method , 'mutual_contacts' - users who imported the same contacts as the current user with the [vk.com/dev/account.importContacts|account.importContacts] method.
     * @param count Number of suggestions to return.
     * @param offset Offset needed to return a specific subset of suggestions.
     * @param fields Profile fields to return. Sample values: 'nickname', 'screen_name', 'sex', 'bdate' (birthdate), 'city', 'country', 'timezone', 'photo', 'photo_medium', 'photo_big', 'has_mobile', 'rate', 'contacts', 'education', 'online', 'counters'.
     * @param nameCase Case for declension of user name and surname: , 'nom' - nominative (default) , 'gen' - genitive , 'dat' - dative , 'acc' - accusative , 'ins' - instrumental , 'abl' - prepositional.
     */
    suspend fun getSuggestions(filter: List<String>? = null, count: Int? = 500, offset: Int? = null, fields: List<UsersFields>? = null, nameCase: String? = null): FriendsGetSuggestionsResponse {
        val response = method("friends.getSuggestions", mapOf("filter" to filter, "count" to count, "offset" to offset, "fields" to fields, "name_case" to nameCase))
        return decodeResponse(response, json)
    }

    /**
     *
     * Returns a list of friends matching the search criteria.
     * 
     * @param userId User ID.
     * @param q Search query string (e.g., 'Vasya Babich').
     * @param fields Profile fields to return. Sample values: 'nickname', 'screen_name', 'sex', 'bdate' (birthdate), 'city', 'country', 'timezone', 'photo', 'photo_medium', 'photo_big', 'has_mobile', 'rate', 'contacts', 'education', 'online',.
     * @param nameCase Case for declension of user name and surname: 'nom' - nominative (default), 'gen' - genitive , 'dat' - dative, 'acc' - accusative , 'ins' - instrumental , 'abl' - prepositional.
     * @param offset Offset needed to return a specific subset of friends.
     * @param count Number of friends to return.
     */
    suspend fun search(userId: Int? = null, q: String? = null, fields: List<UsersFields>? = null, nameCase: String? = null, offset: Int? = null, count: Int? = 20): FriendsSearchResponse {
        val response = method("friends.search", mapOf("user_id" to userId, "q" to q, "fields" to fields, "name_case" to nameCase, "offset" to offset, "count" to count))
        return decodeResponse(response, json)
    }

}
