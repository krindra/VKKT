package ru.krindra.vkkt.longpoll.bot

import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonContentPolymorphicSerializer
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive
import ru.krindra.vkkt.longpoll.bot.objects.*

@Serializable(BotLPUpdate.UpdatesSerializer::class)
sealed class BotLPUpdate {
    abstract val type: String
    abstract val eventId: String
    abstract val v: String
    abstract val groupId: Int

    @Serializable data class MessageNewUpdate(
        @SerialName("type") override val type: String,
        @SerialName("event_id") override val eventId: String,
        @SerialName("v") override val v: String,
        @SerialName("group_id") override val groupId: Int,
        @SerialName("object") val `object`: MessageNewObject,
    ) : BotLPUpdate() {
        companion object {
            const val type = "message_new"
        }
    }

    @Serializable data class MarketCommentNewUpdate(
        @SerialName("type") override val type: String,
        @SerialName("event_id") override val eventId: String,
        @SerialName("v") override val v: String,
        @SerialName("group_id") override val groupId: Int,
        @SerialName("object") val `object`: MarketCommentObject,
    ) : BotLPUpdate() {
        companion object {
            const val type = "market_comment_new"
        }
    }

    @Serializable data class GroupChangeSettingsUpdate(
        @SerialName("type") override val type: String,
        @SerialName("event_id") override val eventId: String,
        @SerialName("v") override val v: String,
        @SerialName("group_id") override val groupId: Int,
        @SerialName("object") val `object`: GroupChangeSettingsObject,
    ) : BotLPUpdate() {
        companion object {
            const val type = "group_change_settings"
        }
    }

    @Serializable data class PhotoCommentRestoreUpdate(
        @SerialName("type") override val type: String,
        @SerialName("event_id") override val eventId: String,
        @SerialName("v") override val v: String,
        @SerialName("group_id") override val groupId: Int,
        @SerialName("object") val `object`: PhotoObject,
    ) : BotLPUpdate() {
        companion object {
            const val type = "photo_comment_restore"
        }
    }

    @Serializable data class MarketCommentEditUpdate(
        @SerialName("type") override val type: String,
        @SerialName("event_id") override val eventId: String,
        @SerialName("v") override val v: String,
        @SerialName("group_id") override val groupId: Int,
        @SerialName("object") val `object`: MarketCommentObject,
    ) : BotLPUpdate() {
        companion object {
            const val type = "market_comment_edit"
        }
    }

    @Serializable data class VideoCommentEditUpdate(
        @SerialName("type") override val type: String,
        @SerialName("event_id") override val eventId: String,
        @SerialName("v") override val v: String,
        @SerialName("group_id") override val groupId: Int,
        @SerialName("object") val `object`: VideoCommentObject,
    ) : BotLPUpdate() {
        companion object {
            const val type = "video_comment_edit"
        }
    }

    @Serializable data class DonutSubscriptionPriceChangedUpdate(
        @SerialName("type") override val type: String,
        @SerialName("event_id") override val eventId: String,
        @SerialName("v") override val v: String,
        @SerialName("group_id") override val groupId: Int,
        @SerialName("object") val `object`: DonutSubscriptionPriceChangedObject,
    ) : BotLPUpdate() {
        companion object {
            const val type = "donut_subscription_price_changed"
        }
    }

    @Serializable data class MarketCommentRestoreUpdate(
        @SerialName("type") override val type: String,
        @SerialName("event_id") override val eventId: String,
        @SerialName("v") override val v: String,
        @SerialName("group_id") override val groupId: Int,
        @SerialName("object") val `object`: MarketCommentObject,
    ) : BotLPUpdate() {
        companion object {
            const val type = "market_comment_restore"
        }
    }

    @Serializable data class VkPayTransactionUpdate(
        @SerialName("type") override val type: String,
        @SerialName("event_id") override val eventId: String,
        @SerialName("v") override val v: String,
        @SerialName("group_id") override val groupId: Int,
        @SerialName("object") val `object`: VkPayTransactionObject,
    ) : BotLPUpdate() {
        companion object {
            const val type = "vk_pay_transaction"
        }
    }

    @Serializable data class BoardPostEditUpdate(
        @SerialName("type") override val type: String,
        @SerialName("event_id") override val eventId: String,
        @SerialName("v") override val v: String,
        @SerialName("group_id") override val groupId: Int,
        @SerialName("object") val `object`: BoardPostObject,
    ) : BotLPUpdate() {
        companion object {
            const val type = "board_post_edit"
        }
    }

    @Serializable data class MessageDenyUpdate(
        @SerialName("type") override val type: String,
        @SerialName("event_id") override val eventId: String,
        @SerialName("v") override val v: String,
        @SerialName("group_id") override val groupId: Int,
        @SerialName("object") val `object`: MessageDenyObject,
    ) : BotLPUpdate() {
        companion object {
            const val type = "message_deny"
        }
    }

    @Serializable data class UserBlockUpdate(
        @SerialName("type") override val type: String,
        @SerialName("event_id") override val eventId: String,
        @SerialName("v") override val v: String,
        @SerialName("group_id") override val groupId: Int,
        @SerialName("object") val `object`: UserBlockObject,
    ) : BotLPUpdate() {
        companion object {
            const val type = "user_block"
        }
    }

    @Serializable data class MarketCommentDeleteUpdate(
        @SerialName("type") override val type: String,
        @SerialName("event_id") override val eventId: String,
        @SerialName("v") override val v: String,
        @SerialName("group_id") override val groupId: Int,
        @SerialName("object") val `object`: MarketCommentDeleteObject,
    ) : BotLPUpdate() {
        companion object {
            const val type = "market_comment_delete"
        }
    }

    @Serializable data class VideoNewUpdate(
        @SerialName("type") override val type: String,
        @SerialName("event_id") override val eventId: String,
        @SerialName("v") override val v: String,
        @SerialName("group_id") override val groupId: Int,
        @SerialName("object") val `object`: VideoNewObject,
    ) : BotLPUpdate() {
        companion object {
            const val type = "video_new"
        }
    }

    @Serializable data class DonutMoneyWithdrawErrorUpdate(
        @SerialName("type") override val type: String,
        @SerialName("event_id") override val eventId: String,
        @SerialName("v") override val v: String,
        @SerialName("group_id") override val groupId: Int,
        @SerialName("object") val `object`: DonutMoneyWithdrawErrorObject,
    ) : BotLPUpdate() {
        companion object {
            const val type = "donut_money_withdraw_error"
        }
    }

    @Serializable data class WallReplyDeleteUpdate(
        @SerialName("type") override val type: String,
        @SerialName("event_id") override val eventId: String,
        @SerialName("v") override val v: String,
        @SerialName("group_id") override val groupId: Int,
        @SerialName("object") val `object`: WallReplyDeleteObject,
    ) : BotLPUpdate() {
        companion object {
            const val type = "wall_reply_delete"
        }
    }

    @Serializable data class MessageEditUpdate(
        @SerialName("type") override val type: String,
        @SerialName("event_id") override val eventId: String,
        @SerialName("v") override val v: String,
        @SerialName("group_id") override val groupId: Int,
        @SerialName("object") val `object`: MessageEditObject,
    ) : BotLPUpdate() {
        companion object {
            const val type = "message_edit"
        }
    }

    @Serializable data class VideoCommentNewUpdate(
        @SerialName("type") override val type: String,
        @SerialName("event_id") override val eventId: String,
        @SerialName("v") override val v: String,
        @SerialName("group_id") override val groupId: Int,
        @SerialName("object") val `object`: VideoCommentObject,
    ) : BotLPUpdate() {
        companion object {
            const val type = "video_comment_new"
        }
    }

    @Serializable data class MessageTypingStateUpdate(
        @SerialName("type") override val type: String,
        @SerialName("event_id") override val eventId: String,
        @SerialName("v") override val v: String,
        @SerialName("group_id") override val groupId: Int,
        @SerialName("object") val `object`: MessageTypingStateObject,
    ) : BotLPUpdate() {
        companion object {
            const val type = "message_typing_state"
        }
    }

    @Serializable data class LikeRemoveUpdate(
        @SerialName("type") override val type: String,
        @SerialName("event_id") override val eventId: String,
        @SerialName("v") override val v: String,
        @SerialName("group_id") override val groupId: Int,
        @SerialName("object") val `object`: LikeObject,
    ) : BotLPUpdate() {
        companion object {
            const val type = "like_remove"
        }
    }

    @Serializable data class DonutSubscriptionExpiredUpdate(
        @SerialName("type") override val type: String,
        @SerialName("event_id") override val eventId: String,
        @SerialName("v") override val v: String,
        @SerialName("group_id") override val groupId: Int,
        @SerialName("object") val `object`: DonutSubscriptionExpiredObject,
    ) : BotLPUpdate() {
        companion object {
            const val type = "donut_subscription_expired"
        }
    }

    @Serializable data class BoardPostDeleteUpdate(
        @SerialName("type") override val type: String,
        @SerialName("event_id") override val eventId: String,
        @SerialName("v") override val v: String,
        @SerialName("group_id") override val groupId: Int,
        @SerialName("object") val `object`: BoardPostDeleteObject,
    ) : BotLPUpdate() {
        companion object {
            const val type = "board_post_delete"
        }
    }

    @Serializable data class MessageReplyUpdate(
        @SerialName("type") override val type: String,
        @SerialName("event_id") override val eventId: String,
        @SerialName("v") override val v: String,
        @SerialName("group_id") override val groupId: Int,
        @SerialName("object") val `object`: MessageReplyObject,
    ) : BotLPUpdate() {
        companion object {
            const val type = "message_reply"
        }
    }

    @Serializable data class BoardPostNewUpdate(
        @SerialName("type") override val type: String,
        @SerialName("event_id") override val eventId: String,
        @SerialName("v") override val v: String,
        @SerialName("group_id") override val groupId: Int,
        @SerialName("object") val `object`: BoardPostObject,
    ) : BotLPUpdate() {
        companion object {
            const val type = "board_post_new"
        }
    }

    @Serializable data class UserUnblockUpdate(
        @SerialName("type") override val type: String,
        @SerialName("event_id") override val eventId: String,
        @SerialName("v") override val v: String,
        @SerialName("group_id") override val groupId: Int,
        @SerialName("object") val `object`: UserUnblockObject,
    ) : BotLPUpdate() {
        companion object {
            const val type = "user_unblock"
        }
    }

    @Serializable data class PhotoNewUpdate(
        @SerialName("type") override val type: String,
        @SerialName("event_id") override val eventId: String,
        @SerialName("v") override val v: String,
        @SerialName("group_id") override val groupId: Int,
        @SerialName("object") val `object`: PhotoNewObject,
    ) : BotLPUpdate() {
        companion object {
            const val type = "photo_new"
        }
    }

    @Serializable data class MessageAllowUpdate(
        @SerialName("type") override val type: String,
        @SerialName("event_id") override val eventId: String,
        @SerialName("v") override val v: String,
        @SerialName("group_id") override val groupId: Int,
        @SerialName("object") val `object`: MessageAllowObject,
    ) : BotLPUpdate() {
        companion object {
            const val type = "message_allow"
        }
    }

    @Serializable data class GroupJoinUpdate(
        @SerialName("type") override val type: String,
        @SerialName("event_id") override val eventId: String,
        @SerialName("v") override val v: String,
        @SerialName("group_id") override val groupId: Int,
        @SerialName("object") val `object`: GroupJoinObject,
    ) : BotLPUpdate() {
        companion object {
            const val type = "group_join"
        }
    }

    @Serializable data class VideoCommentDeleteUpdate(
        @SerialName("type") override val type: String,
        @SerialName("event_id") override val eventId: String,
        @SerialName("v") override val v: String,
        @SerialName("group_id") override val groupId: Int,
        @SerialName("object") val `object`: VideoCommentDeleteObject,
    ) : BotLPUpdate() {
        companion object {
            const val type = "video_comment_delete"
        }
    }

    @Serializable data class GroupOfficersEditUpdate(
        @SerialName("type") override val type: String,
        @SerialName("event_id") override val eventId: String,
        @SerialName("v") override val v: String,
        @SerialName("group_id") override val groupId: Int,
        @SerialName("object") val `object`: GroupOfficersEditObject,
    ) : BotLPUpdate() {
        companion object {
            const val type = "group_officers_edit"
        }
    }

    @Serializable data class LikeAddUpdate(
        @SerialName("type") override val type: String,
        @SerialName("event_id") override val eventId: String,
        @SerialName("v") override val v: String,
        @SerialName("group_id") override val groupId: Int,
        @SerialName("object") val `object`: LikeObject,
    ) : BotLPUpdate() {
        companion object {
            const val type = "like_add"
        }
    }

    @Serializable data class WallReplyRestoreUpdate(
        @SerialName("type") override val type: String,
        @SerialName("event_id") override val eventId: String,
        @SerialName("v") override val v: String,
        @SerialName("group_id") override val groupId: Int,
        @SerialName("object") val `object`: WallReplyObject,
    ) : BotLPUpdate() {
        companion object {
            const val type = "wall_reply_restore"
        }
    }

    @Serializable data class WallReplyNewUpdate(
        @SerialName("type") override val type: String,
        @SerialName("event_id") override val eventId: String,
        @SerialName("v") override val v: String,
        @SerialName("group_id") override val groupId: Int,
        @SerialName("object") val `object`: WallReplyObject,
    ) : BotLPUpdate() {
        companion object {
            const val type = "wall_reply_new"
        }
    }

    @Serializable data class DonutSubscriptionCreateUpdate(
        @SerialName("type") override val type: String,
        @SerialName("event_id") override val eventId: String,
        @SerialName("v") override val v: String,
        @SerialName("group_id") override val groupId: Int,
        @SerialName("object") val `object`: DonutSubscriptionCreateObject,
    ) : BotLPUpdate() {
        companion object {
            const val type = "donut_subscription_create"
        }
    }

    @Serializable data class MarketOrderEditUpdate(
        @SerialName("type") override val type: String,
        @SerialName("event_id") override val eventId: String,
        @SerialName("v") override val v: String,
        @SerialName("group_id") override val groupId: Int,
        @SerialName("object") val `object`: MarketOrderObject,
    ) : BotLPUpdate() {
        companion object {
            const val type = "market_order_edit"
        }
    }

    @Serializable data class PhotoCommentNewUpdate(
        @SerialName("type") override val type: String,
        @SerialName("event_id") override val eventId: String,
        @SerialName("v") override val v: String,
        @SerialName("group_id") override val groupId: Int,
        @SerialName("object") val `object`: PhotoObject,
    ) : BotLPUpdate() {
        companion object {
            const val type = "photo_comment_new"
        }
    }

    @Serializable data class WallReplyEditUpdate(
        @SerialName("type") override val type: String,
        @SerialName("event_id") override val eventId: String,
        @SerialName("v") override val v: String,
        @SerialName("group_id") override val groupId: Int,
        @SerialName("object") val `object`: WallReplyObject,
    ) : BotLPUpdate() {
        companion object {
            const val type = "wall_reply_edit"
        }
    }

    @Serializable data class VideoCommentRestoreUpdate(
        @SerialName("type") override val type: String,
        @SerialName("event_id") override val eventId: String,
        @SerialName("v") override val v: String,
        @SerialName("group_id") override val groupId: Int,
        @SerialName("object") val `object`: VideoCommentObject,
    ) : BotLPUpdate() {
        companion object {
            const val type = "video_comment_restore"
        }
    }

    @Serializable data class WallPostNewUpdate(
        @SerialName("type") override val type: String,
        @SerialName("event_id") override val eventId: String,
        @SerialName("v") override val v: String,
        @SerialName("group_id") override val groupId: Int,
        @SerialName("object") val `object`: WallObject,
    ) : BotLPUpdate() {
        companion object {
            const val type = "wall_post_new"
        }
    }

    @Serializable data class WallRepostUpdate(
        @SerialName("type") override val type: String,
        @SerialName("event_id") override val eventId: String,
        @SerialName("v") override val v: String,
        @SerialName("group_id") override val groupId: Int,
        @SerialName("object") val `object`: WallObject,
    ) : BotLPUpdate() {
        companion object {
            const val type = "wall_repost"
        }
    }

    @Serializable data class PhotoCommentEditUpdate(
        @SerialName("type") override val type: String,
        @SerialName("event_id") override val eventId: String,
        @SerialName("v") override val v: String,
        @SerialName("group_id") override val groupId: Int,
        @SerialName("object") val `object`: PhotoObject,
    ) : BotLPUpdate() {
        companion object {
            const val type = "photo_comment_edit"
        }
    }

    @Serializable data class AppPayloadUpdate(
        @SerialName("type") override val type: String,
        @SerialName("event_id") override val eventId: String,
        @SerialName("v") override val v: String,
        @SerialName("group_id") override val groupId: Int,
        @SerialName("object") val `object`: AppPayloadObject,
    ) : BotLPUpdate() {
        companion object {
            const val type = "app_payload"
        }
    }

    @Serializable data class AudioNewUpdate(
        @SerialName("type") override val type: String,
        @SerialName("event_id") override val eventId: String,
        @SerialName("v") override val v: String,
        @SerialName("group_id") override val groupId: Int,
        @SerialName("object") val `object`: AudioNewObject,
    ) : BotLPUpdate() {
        companion object {
            const val type = "audio_new"
        }
    }

    @Serializable data class DonutSubscriptionCancelledUpdate(
        @SerialName("type") override val type: String,
        @SerialName("event_id") override val eventId: String,
        @SerialName("v") override val v: String,
        @SerialName("group_id") override val groupId: Int,
        @SerialName("object") val `object`: DonutSubscriptionCancelledObject,
    ) : BotLPUpdate() {
        companion object {
            const val type = "donut_subscription_cancelled"
        }
    }

    @Serializable data class BoardPostRestoreUpdate(
        @SerialName("type") override val type: String,
        @SerialName("event_id") override val eventId: String,
        @SerialName("v") override val v: String,
        @SerialName("group_id") override val groupId: Int,
        @SerialName("object") val `object`: BoardPostObject,
    ) : BotLPUpdate() {
        companion object {
            const val type = "board_post_restore"
        }
    }

    @Serializable data class MarketOrderNewUpdate(
        @SerialName("type") override val type: String,
        @SerialName("event_id") override val eventId: String,
        @SerialName("v") override val v: String,
        @SerialName("group_id") override val groupId: Int,
        @SerialName("object") val `object`: MarketOrderObject,
    ) : BotLPUpdate() {
        companion object {
            const val type = "market_order_new"
        }
    }

    @Serializable data class DonutSubscriptionProlongedUpdate(
        @SerialName("type") override val type: String,
        @SerialName("event_id") override val eventId: String,
        @SerialName("v") override val v: String,
        @SerialName("group_id") override val groupId: Int,
        @SerialName("object") val `object`: DonutSubscriptionProlongedObject,
    ) : BotLPUpdate() {
        companion object {
            const val type = "donut_subscription_prolonged"
        }
    }

    @Serializable data class GroupChangePhotoUpdate(
        @SerialName("type") override val type: String,
        @SerialName("event_id") override val eventId: String,
        @SerialName("v") override val v: String,
        @SerialName("group_id") override val groupId: Int,
        @SerialName("object") val `object`: GroupChangePhotoObject,
    ) : BotLPUpdate() {
        companion object {
            const val type = "group_change_photo"
        }
    }

    @Serializable data class GroupLeaveUpdate(
        @SerialName("type") override val type: String,
        @SerialName("event_id") override val eventId: String,
        @SerialName("v") override val v: String,
        @SerialName("group_id") override val groupId: Int,
        @SerialName("object") val `object`: GroupLeaveObject,
    ) : BotLPUpdate() {
        companion object {
            const val type = "group_leave"
        }
    }

    @Serializable data class PollVoteNewUpdate(
        @SerialName("type") override val type: String,
        @SerialName("event_id") override val eventId: String,
        @SerialName("v") override val v: String,
        @SerialName("group_id") override val groupId: Int,
        @SerialName("object") val `object`: PollVoteNewObject,
    ) : BotLPUpdate() {
        companion object {
            const val type = "poll_vote_new"
        }
    }

    @Serializable data class DonutMoneyWithdrawUpdate(
        @SerialName("type") override val type: String,
        @SerialName("event_id") override val eventId: String,
        @SerialName("v") override val v: String,
        @SerialName("group_id") override val groupId: Int,
        @SerialName("object") val `object`: DonutMoneyWithdrawObject,
    ) : BotLPUpdate() {
        companion object {
            const val type = "donut_money_withdraw"
        }
    }

    @Serializable data class MessageEventUpdate(
        @SerialName("type") override val type: String,
        @SerialName("event_id") override val eventId: String,
        @SerialName("v") override val v: String,
        @SerialName("group_id") override val groupId: Int,
        @SerialName("object") val `object`: MessageEventObject,
    ) : BotLPUpdate() {
        companion object {
            const val type = "message_event"
        }
    }

    internal object UpdatesSerializer : JsonContentPolymorphicSerializer<BotLPUpdate>(BotLPUpdate::class) {
        private val events: Map<KSerializer<out BotLPUpdate>, String> = mapOf(
            MessageNewUpdate.serializer() to MessageNewUpdate.type,
            MessageReplyUpdate.serializer() to MessageReplyUpdate.type,
            MessageEditUpdate.serializer() to MessageEditUpdate.type,
            MessageAllowUpdate.serializer() to MessageAllowUpdate.type,
            MessageDenyUpdate.serializer() to MessageDenyUpdate.type,
            MessageTypingStateUpdate.serializer() to MessageTypingStateUpdate.type,
            MessageEventUpdate.serializer() to MessageEventUpdate.type,
            PhotoNewUpdate.serializer() to PhotoNewUpdate.type,
            PhotoCommentNewUpdate.serializer() to PhotoCommentNewUpdate.type,
            PhotoCommentEditUpdate.serializer() to PhotoCommentEditUpdate.type,
            PhotoCommentRestoreUpdate.serializer() to PhotoCommentRestoreUpdate.type,
            AudioNewUpdate.serializer() to AudioNewUpdate.type,
            VideoNewUpdate.serializer() to VideoNewUpdate.type,
            VideoCommentNewUpdate.serializer() to VideoCommentNewUpdate.type,
            VideoCommentEditUpdate.serializer() to VideoCommentEditUpdate.type,
            VideoCommentRestoreUpdate.serializer() to VideoCommentRestoreUpdate.type,
            VideoCommentDeleteUpdate.serializer() to VideoCommentDeleteUpdate.type,
            WallPostNewUpdate.serializer() to WallPostNewUpdate.type,
            WallRepostUpdate.serializer() to WallRepostUpdate.type,
            WallReplyNewUpdate.serializer() to WallReplyNewUpdate.type,
            WallReplyEditUpdate.serializer() to WallReplyEditUpdate.type,
            WallReplyRestoreUpdate.serializer() to WallReplyRestoreUpdate.type,
            WallReplyDeleteUpdate.serializer() to WallReplyDeleteUpdate.type,
            LikeAddUpdate.serializer() to LikeAddUpdate.type,
            LikeRemoveUpdate.serializer() to LikeRemoveUpdate.type,
            BoardPostNewUpdate.serializer() to BoardPostNewUpdate.type,
            BoardPostEditUpdate.serializer() to BoardPostEditUpdate.type,
            BoardPostRestoreUpdate.serializer() to BoardPostRestoreUpdate.type,
            BoardPostDeleteUpdate.serializer() to BoardPostDeleteUpdate.type,
            MarketCommentNewUpdate.serializer() to MarketCommentNewUpdate.type,
            MarketCommentEditUpdate.serializer() to MarketCommentEditUpdate.type,
            MarketCommentRestoreUpdate.serializer() to MarketCommentRestoreUpdate.type,
            MarketCommentDeleteUpdate.serializer() to MarketCommentDeleteUpdate.type,
            MarketOrderNewUpdate.serializer() to MarketOrderNewUpdate.type,
            MarketOrderEditUpdate.serializer() to MarketOrderEditUpdate.type,
            GroupJoinUpdate.serializer() to GroupJoinUpdate.type,
            GroupLeaveUpdate.serializer() to GroupLeaveUpdate.type,
            UserBlockUpdate.serializer() to UserBlockUpdate.type,
            UserUnblockUpdate.serializer() to UserUnblockUpdate.type,
            PollVoteNewUpdate.serializer() to PollVoteNewUpdate.type,
            GroupOfficersEditUpdate.serializer() to GroupOfficersEditUpdate.type,
            GroupChangeSettingsUpdate.serializer() to GroupChangeSettingsUpdate.type,
            GroupChangePhotoUpdate.serializer() to GroupChangePhotoUpdate.type,
            VkPayTransactionUpdate.serializer() to VkPayTransactionUpdate.type,
            AppPayloadUpdate.serializer() to AppPayloadUpdate.type,
            DonutSubscriptionCreateUpdate.serializer() to DonutSubscriptionCreateUpdate.type,
            DonutSubscriptionProlongedUpdate.serializer() to DonutSubscriptionProlongedUpdate.type,
            DonutSubscriptionExpiredUpdate.serializer() to DonutSubscriptionExpiredUpdate.type,
            DonutSubscriptionCancelledUpdate.serializer() to DonutSubscriptionCancelledUpdate.type,
            DonutSubscriptionPriceChangedUpdate.serializer() to DonutSubscriptionPriceChangedUpdate.type,
            DonutMoneyWithdrawUpdate.serializer() to DonutMoneyWithdrawUpdate.type,
            DonutMoneyWithdrawErrorUpdate.serializer() to DonutMoneyWithdrawErrorUpdate.type,
        )

        override fun selectDeserializer(element: JsonElement): DeserializationStrategy<BotLPUpdate> {
            val type = element.jsonObject["type"]!!.jsonPrimitive.content

            for (e in events) {
                if (type == e.value) return e.key
            }
            throw IllegalArgumentException("Unsupported type.\nelement = $element\ntype = $type\n")
        }
    }
}

