package ru.krindra.vkkt.objects.polls

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
    @SerialName("id") val id: Int,
    @SerialName("votes") val votes: Int,
    @SerialName("created") val created: Int,
    @SerialName("end_date") val endDate: Int,
    @SerialName("owner_id") val ownerId: Int,
    @SerialName("closed") val closed: Boolean,
    @SerialName("can_edit") val canEdit: Boolean,
    @SerialName("can_vote") val canVote: Boolean,
    @SerialName("is_board") val isBoard: Boolean,
    @SerialName("question") val question: String,
    @SerialName("multiple") val multiple: Boolean,
    @SerialName("can_share") val canShare: Boolean,
    @SerialName("can_report") val canReport: Boolean,
    @SerialName("answer_id") val answerId: Int? = null,
    @SerialName("author_id") val authorId: Int? = null,
    @SerialName("answers") val answers: List<PollsAnswer>,
    @SerialName("embed_hash") val embedHash: String? = null,
    @SerialName("photo") val photo: PollsBackground? = null,
    @SerialName("disable_unvote") val disableUnvote: Boolean,
    @SerialName("answer_ids") val answerIds: List<Int>? = null,
    @SerialName("friends") val friends: List<PollsFriend>? = null,
    @SerialName("background") val background: PollsBackground? = null,
    @SerialName("anonymous") val anonymous: PollsPollAnonymous? = null,
)
