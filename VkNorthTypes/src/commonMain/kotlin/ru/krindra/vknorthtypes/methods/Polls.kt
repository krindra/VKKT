package ru.krindra.vknorthtypes.methods

// **********
// THIS FILE IS AUTOGENERATED!!! DO NOT EDIT IT!!!
// **********


import ru.krindra.vknorthtypes.types.polls.*
import kotlinx.serialization.json.Json
import ru.krindra.vknorthtypes.JsonSingleton
import ru.krindra.vknorthtypes.types.base.BaseOkResponse
import ru.krindra.vknorthtypes.types.base.BaseGetUploadServerResponse
import ru.krindra.vknorthtypes.types.users.UsersFields
import ru.krindra.vknorthtypes.types.base.BaseBoolResponse
import ru.krindra.vknorthtypes.BaseMultivariateResponse

class Polls(
    private val method: suspend (String, Map<String, Any?>?) -> String,
    private val json: Json = JsonSingleton.json
    ) {
    /**
     *
     * Adds the current user's vote to the selected answer in the poll.
     * 
     * @param ownerId ID of the user or community that owns the poll. Use a negative value to designate a community ID.
     * @param pollId Poll ID.
     * @param answerIds 
     * @param isBoard 
     */
    suspend fun addVote(pollId: Long, answerIds: List<Int>, ownerId: Long? = null, isBoard: Boolean? = false): BaseBoolResponse {
        val response = method("addVote", mapOf("owner_id" to ownerId, "poll_id" to pollId, "answer_ids" to answerIds, "is_board" to isBoard))
        return json.decodeFromString<BaseBoolResponse>(response)
    }

    /**
     *
     * Creates polls that can be attached to the users' or communities' posts.
     * 
     * @param question question text.
     * @param isAnonymous '1' - anonymous poll, participants list is hidden,, '0' - public poll, participants list is available,, Default value is '0'.
     * @param isMultiple 
     * @param endDate 
     * @param ownerId If a poll will be added to a communty it is required to send a negative group identifier. Current user by default.
     * @param appId 
     * @param addAnswers available answers list, for example: " ["yes","no","maybe"]", There can be from 1 to 10 answers.
     * @param photoId 
     * @param backgroundId 
     * @param disableUnvote 
     */
    suspend fun create(question: String? = null, isAnonymous: Boolean? = false, isMultiple: Boolean? = false, endDate: Int? = null, ownerId: Long? = null, appId: Long? = null, addAnswers: String? = null, photoId: Long? = null, backgroundId: String? = null, disableUnvote: Boolean? = false): PollsCreateResponse {
        val response = method("create", mapOf("question" to question, "is_anonymous" to isAnonymous, "is_multiple" to isMultiple, "end_date" to endDate, "owner_id" to ownerId, "app_id" to appId, "add_answers" to addAnswers, "photo_id" to photoId, "background_id" to backgroundId, "disable_unvote" to disableUnvote))
        return json.decodeFromString<PollsCreateResponse>(response)
    }

    /**
     *
     * Deletes the current user's vote from the selected answer in the poll.
     * 
     * @param ownerId ID of the user or community that owns the poll. Use a negative value to designate a community ID.
     * @param pollId Poll ID.
     * @param isBoard 
     */
    suspend fun deleteVote(pollId: Long, ownerId: Long? = null, isBoard: Boolean? = false): BaseBoolResponse {
        val response = method("deleteVote", mapOf("owner_id" to ownerId, "poll_id" to pollId, "is_board" to isBoard))
        return json.decodeFromString<BaseBoolResponse>(response)
    }

    /**
     *
     * Edits created polls
     * 
     * @param ownerId poll owner id.
     * @param pollId edited poll's id.
     * @param question new question text.
     * @param addAnswers answers list, for example: , "["yes","no","maybe"]".
     * @param editAnswers object containing answers that need to be edited,, key - answer id, value - new answer text. Example: {"382967099":"option1", "382967103":"option2"}".
     * @param deleteAnswers list of answer ids to be deleted. For example: "[382967099, 382967103]".
     * @param endDate 
     * @param photoId 
     * @param backgroundId 
     */
    suspend fun edit(pollId: Long, ownerId: Long? = null, question: String? = null, addAnswers: String? = null, editAnswers: String? = null, deleteAnswers: String? = null, endDate: Int? = null, photoId: Long? = null, backgroundId: String? = null): BaseOkResponse {
        val response = method("edit", mapOf("owner_id" to ownerId, "poll_id" to pollId, "question" to question, "add_answers" to addAnswers, "edit_answers" to editAnswers, "delete_answers" to deleteAnswers, "end_date" to endDate, "photo_id" to photoId, "background_id" to backgroundId))
        return json.decodeFromString<BaseOkResponse>(response)
    }

    /**
     *
     */
    suspend fun getBackgrounds(): PollsGetBackgroundsResponse {
        val response = method("getBackgrounds", mapOf())
        return json.decodeFromString<PollsGetBackgroundsResponse>(response)
    }

    /**
     *
     * Returns detailed information about a poll by its ID.
     * 
     * @param ownerId ID of the user or community that owns the poll. Use a negative value to designate a community ID.
     * @param isBoard '1' - poll is in a board, '0' - poll is on a wall. '0' by default.
     * @param pollId Poll ID.
     * @param extended 
     * @param friendsCount 
     * @param fields 
     * @param nameCase 
     */
    suspend fun getById(pollId: Long, ownerId: Long? = null, isBoard: Boolean? = false, extended: Boolean? = false, friendsCount: Int? = 3, fields: List<String>? = null, nameCase: String? = "nom"): PollsGetByIdResponse {
        val response = method("getById", mapOf("owner_id" to ownerId, "is_board" to isBoard, "poll_id" to pollId, "extended" to extended, "friends_count" to friendsCount, "fields" to fields, "name_case" to nameCase))
        return json.decodeFromString<PollsGetByIdResponse>(response)
    }

    /**
     *
     * @param ownerId 
     */
    suspend fun getPhotoUploadServer(ownerId: Long? = null): BaseGetUploadServerResponse {
        val response = method("getPhotoUploadServer", mapOf("owner_id" to ownerId))
        return json.decodeFromString<BaseGetUploadServerResponse>(response)
    }

    /**
     *
     * Returns a list of IDs of users who selected specific answers in the poll.
     * 
     * @param ownerId ID of the user or community that owns the poll. Use a negative value to designate a community ID.
     * @param pollId Poll ID.
     * @param answerIds Answer IDs.
     * @param isBoard 
     * @param friendsOnly '1' - to return only current user's friends, '0' - to return all users (default),.
     * @param offset Offset needed to return a specific subset of voters. '0' - (default).
     * @param count Number of user IDs to return (if the 'friends_only' parameter is not set, maximum '1000', otherwise '10'). '100' - (default).
     * @param fields Profile fields to return. Sample values: 'nickname', 'screen_name', 'sex', 'bdate (birthdate)', 'city', 'country', 'timezone', 'photo', 'photo_medium', 'photo_big', 'has_mobile', 'rate', 'contacts', 'education', 'online', 'counters'.
     * @param nameCase Case for declension of user name and surname: , 'nom' - nominative (default) , 'gen' - genitive , 'dat' - dative , 'acc' - accusative , 'ins' - instrumental , 'abl' - prepositional.
     */
    suspend fun getVoters(pollId: Long, answerIds: List<Int>, ownerId: Long? = null, isBoard: Boolean? = false, friendsOnly: Boolean? = false, offset: Int? = null, count: Int? = null, fields: List<UsersFields>? = null, nameCase: String? = null): GetvotersResponse {
        val response = method("getVoters", mapOf("owner_id" to ownerId, "poll_id" to pollId, "answer_ids" to answerIds, "is_board" to isBoard, "friends_only" to friendsOnly, "offset" to offset, "count" to count, "fields" to fields, "name_case" to nameCase))
        return GetvotersResponse(response, json)
    }
    class GetvotersResponse(
        private val rawResponse: String, json: Json
    ): BaseMultivariateResponse(json) {
        fun PollsGetVotersFieldsResponse(): PollsGetVotersFieldsResponse? {
            return try {
                getResponse(PollsGetVotersFieldsResponse.serializer(), rawResponse)
            } catch(e: Exception) { null }
        }
        fun PollsGetVotersResponse(): PollsGetVotersResponse? {
            return try {
                getResponse(PollsGetVotersResponse.serializer(), rawResponse)
            } catch(e: Exception) { null }
        }
    }

    /**
     *
     * @param photo 
     * @param hash 
     */
    suspend fun savePhoto(photo: String, hash: String): PollsSavePhotoResponse {
        val response = method("savePhoto", mapOf("photo" to photo, "hash" to hash))
        return json.decodeFromString<PollsSavePhotoResponse>(response)
    }

}