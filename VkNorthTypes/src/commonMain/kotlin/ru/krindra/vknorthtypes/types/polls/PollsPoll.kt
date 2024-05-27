package ru.krindra.vknorthtypes.types.polls

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param anonymous 
 * @param friends 
 * @param multiple Information whether the poll with multiple choices
 * @param answerId Current user's answer ID
 * @param endDate 
 * @param answerIds Current user's answer IDs
 * @param closed 
 * @param isBoard 
 * @param canEdit 
 * @param canVote 
 * @param canReport 
 * @param canShare 
 * @param embedHash 
 * @param photo 
 * @param answers 
 * @param created Date when poll has been created in Unixtime
 * @param id Poll ID
 * @param ownerId Poll owner's ID
 * @param authorId Poll author's ID
 * @param question Poll question
 * @param background 
 * @param votes Votes number
 * @param disableUnvote 
 */
@Serializable
data class PollsPoll (
    @SerialName("background") val background: PollsBackground? = null,
    @SerialName("answer_id") val answerId: Long? = null,
    @SerialName("end_date") val endDate: Int,
    @SerialName("is_board") val isBoard: Boolean,
    @SerialName("author_id") val authorId: Long? = null,
    @SerialName("can_report") val canReport: Boolean,
    @SerialName("answers") val answers: List<PollsAnswer>,
    @SerialName("answer_ids") val answerIds: List<Int>? = null,
    @SerialName("photo") val photo: PollsBackground? = null,
    @SerialName("owner_id") val ownerId: Long,
    @SerialName("votes") val votes: Int,
    @SerialName("question") val question: String,
    @SerialName("anonymous") val anonymous: PollsPollAnonymous? = null,
    @SerialName("id") val id: Long,
    @SerialName("disable_unvote") val disableUnvote: Boolean,
    @SerialName("multiple") val multiple: Boolean,
    @SerialName("closed") val closed: Boolean,
    @SerialName("friends") val friends: List<PollsFriend>? = null,
    @SerialName("can_vote") val canVote: Boolean,
    @SerialName("created") val created: Int,
    @SerialName("can_edit") val canEdit: Boolean,
    @SerialName("embed_hash") val embedHash: String? = null,
    @SerialName("can_share") val canShare: Boolean,
)
