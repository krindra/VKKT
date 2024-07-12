package ru.krindra.vkkt.objects.groups

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.base.BaseBoolInt

/**
 *
 * @param audioNew 
 * @param boardPostDelete 
 * @param boardPostEdit 
 * @param boardPostNew 
 * @param boardPostRestore 
 * @param groupChangePhoto 
 * @param groupChangeSettings 
 * @param groupJoin 
 * @param groupLeave 
 * @param groupOfficersEdit 
 * @param leadFormsNew 
 * @param marketCommentDelete 
 * @param marketCommentEdit 
 * @param marketCommentNew 
 * @param marketCommentRestore 
 * @param marketOrderNew 
 * @param marketOrderEdit 
 * @param messageAllow 
 * @param messageDeny 
 * @param messageNew 
 * @param messageRead 
 * @param messageReply 
 * @param messageTypingState 
 * @param messageEdit 
 * @param photoCommentDelete 
 * @param photoCommentEdit 
 * @param photoCommentNew 
 * @param photoCommentRestore 
 * @param photoNew 
 * @param pollVoteNew 
 * @param userBlock 
 * @param userUnblock 
 * @param videoCommentDelete 
 * @param videoCommentEdit 
 * @param videoCommentNew 
 * @param videoCommentRestore 
 * @param videoNew 
 * @param messageReactionEvent 
 * @param wallPostNew 
 * @param wallReplyDelete 
 * @param wallReplyEdit 
 * @param wallReplyNew 
 * @param wallReplyRestore 
 * @param wallRepost 
 * @param donutSubscriptionCreate 
 * @param donutSubscriptionProlonged 
 * @param donutSubscriptionCancelled 
 * @param donutSubscriptionExpired 
 * @param donutSubscriptionPriceChanged 
 * @param donutMoneyWithdraw 
 * @param donutMoneyWithdrawError 
 */
@Serializable
data class GroupsLongPollEvents (
    @SerialName("audio_new") val audioNew: BaseBoolInt,
    @SerialName("photo_new") val photoNew: BaseBoolInt,
    @SerialName("video_new") val videoNew: BaseBoolInt,
    @SerialName("group_join") val groupJoin: BaseBoolInt,
    @SerialName("user_block") val userBlock: BaseBoolInt,
    @SerialName("group_leave") val groupLeave: BaseBoolInt,
    @SerialName("message_new") val messageNew: BaseBoolInt,
    @SerialName("wall_repost") val wallRepost: BaseBoolInt,
    @SerialName("message_deny") val messageDeny: BaseBoolInt,
    @SerialName("message_edit") val messageEdit: BaseBoolInt,
    @SerialName("message_read") val messageRead: BaseBoolInt,
    @SerialName("user_unblock") val userUnblock: BaseBoolInt,
    @SerialName("poll_vote_new") val pollVoteNew: BaseBoolInt,
    @SerialName("wall_post_new") val wallPostNew: BaseBoolInt,
    @SerialName("message_allow") val messageAllow: BaseBoolInt,
    @SerialName("message_reply") val messageReply: BaseBoolInt,
    @SerialName("board_post_new") val boardPostNew: BaseBoolInt,
    @SerialName("wall_reply_new") val wallReplyNew: BaseBoolInt,
    @SerialName("board_post_edit") val boardPostEdit: BaseBoolInt,
    @SerialName("wall_reply_edit") val wallReplyEdit: BaseBoolInt,
    @SerialName("board_post_delete") val boardPostDelete: BaseBoolInt,
    @SerialName("photo_comment_new") val photoCommentNew: BaseBoolInt,
    @SerialName("video_comment_new") val videoCommentNew: BaseBoolInt,
    @SerialName("wall_reply_delete") val wallReplyDelete: BaseBoolInt,
    @SerialName("board_post_restore") val boardPostRestore: BaseBoolInt,
    @SerialName("group_change_photo") val groupChangePhoto: BaseBoolInt,
    @SerialName("lead_forms_new") val leadFormsNew: BaseBoolInt? = null,
    @SerialName("market_comment_new") val marketCommentNew: BaseBoolInt,
    @SerialName("photo_comment_edit") val photoCommentEdit: BaseBoolInt,
    @SerialName("video_comment_edit") val videoCommentEdit: BaseBoolInt,
    @SerialName("wall_reply_restore") val wallReplyRestore: BaseBoolInt,
    @SerialName("group_officers_edit") val groupOfficersEdit: BaseBoolInt,
    @SerialName("market_comment_edit") val marketCommentEdit: BaseBoolInt,
    @SerialName("donut_money_withdraw") val donutMoneyWithdraw: BaseBoolInt,
    @SerialName("market_order_new") val marketOrderNew: BaseBoolInt? = null,
    @SerialName("message_typing_state") val messageTypingState: BaseBoolInt,
    @SerialName("photo_comment_delete") val photoCommentDelete: BaseBoolInt,
    @SerialName("video_comment_delete") val videoCommentDelete: BaseBoolInt,
    @SerialName("group_change_settings") val groupChangeSettings: BaseBoolInt,
    @SerialName("market_comment_delete") val marketCommentDelete: BaseBoolInt,
    @SerialName("market_order_edit") val marketOrderEdit: BaseBoolInt? = null,
    @SerialName("photo_comment_restore") val photoCommentRestore: BaseBoolInt,
    @SerialName("video_comment_restore") val videoCommentRestore: BaseBoolInt,
    @SerialName("market_comment_restore") val marketCommentRestore: BaseBoolInt,
    @SerialName("message_reaction_event") val messageReactionEvent: BaseBoolInt,
    @SerialName("donut_subscription_create") val donutSubscriptionCreate: BaseBoolInt,
    @SerialName("donut_money_withdraw_error") val donutMoneyWithdrawError: BaseBoolInt,
    @SerialName("donut_subscription_expired") val donutSubscriptionExpired: BaseBoolInt,
    @SerialName("donut_subscription_cancelled") val donutSubscriptionCancelled: BaseBoolInt,
    @SerialName("donut_subscription_prolonged") val donutSubscriptionProlonged: BaseBoolInt,
    @SerialName("donut_subscription_price_changed") val donutSubscriptionPriceChanged: BaseBoolInt,
)
