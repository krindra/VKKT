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

    data class MarketCommentNewUpdate(
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

    data class GroupChangeSettingsUpdate(
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

    data class PhotoCommentRestoreUpdate(
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

    data class MarketCommentEditUpdate(
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

    data class VideoCommentEditUpdate(
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

    data class DonutSubscriptionPriceChangedUpdate(
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

    data class MarketCommentRestoreUpdate(
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

    data class VkPayTransactionUpdate(
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

    data class BoardPostEditUpdate(
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

    data class MessageDenyUpdate(
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

    data class UserBlockUpdate(
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

    data class MarketCommentDeleteUpdate(
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

    data class VideoNewUpdate(
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

    data class DonutMoneyWithdrawErrorUpdate(
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

    data class WallReplyDeleteUpdate(
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

    data class MessageEditUpdate(
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

    data class VideoCommentNewUpdate(
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

    data class MessageTypingStateUpdate(
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

    data class LikeRemoveUpdate(
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

    data class DonutSubscriptionExpiredUpdate(
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

    data class BoardPostDeleteUpdate(
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

    data class MessageReplyUpdate(
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

    data class BoardPostNewUpdate(
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

    data class UserUnblockUpdate(
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

    data class PhotoNewUpdate(
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

    data class MessageAllowUpdate(
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

    data class GroupJoinUpdate(
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

    data class VideoCommentDeleteUpdate(
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

    data class GroupOfficersEditUpdate(
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

    data class LikeAddUpdate(
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

    data class WallReplyRestoreUpdate(
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

    data class WallReplyNewUpdate(
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

    data class DonutSubscriptionCreateUpdate(
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

    data class MarketOrderEditUpdate(
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

    data class PhotoCommentNewUpdate(
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

    data class WallReplyEditUpdate(
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

    data class VideoCommentRestoreUpdate(
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

    data class WallPostNewUpdate(
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

    data class WallRepostUpdate(
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

    data class PhotoCommentEditUpdate(
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

    data class AppPayloadUpdate(
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

    data class AudioNewUpdate(
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

    data class DonutSubscriptionCancelledUpdate(
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

    data class BoardPostRestoreUpdate(
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

    data class MarketOrderNewUpdate(
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

    data class DonutSubscriptionProlongedUpdate(
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

    data class GroupChangePhotoUpdate(
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

    data class GroupLeaveUpdate(
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

    data class PollVoteNewUpdate(
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

    data class DonutMoneyWithdrawUpdate(
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

    data class MessageEventUpdate(
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
        private data class SerializerAndType<T: BotLPUpdate>(
            val serializer: KSerializer<T>,
            val type: String
        )

        private val eventsList = listOf(
            SerializerAndType(MessageReplyUpdate.serializer(), MessageReplyUpdate.type),
            SerializerAndType(MessageEditUpdate.serializer(), MessageEditUpdate.type),
            SerializerAndType(MessageAllowUpdate.serializer(), MessageAllowUpdate.type),
            SerializerAndType(MessageDenyUpdate.serializer(), MessageDenyUpdate.type),
            SerializerAndType(MessageTypingStateUpdate.serializer(), MessageTypingStateUpdate.type),
            SerializerAndType(MessageEventUpdate.serializer(), MessageEventUpdate.type),
            SerializerAndType(PhotoNewUpdate.serializer(), PhotoNewUpdate.type),
            SerializerAndType(PhotoCommentNewUpdate.serializer(), PhotoCommentNewUpdate.type),
            SerializerAndType(PhotoCommentEditUpdate.serializer(), PhotoCommentEditUpdate.type),
            SerializerAndType(PhotoCommentRestoreUpdate.serializer(), PhotoCommentRestoreUpdate.type),
            SerializerAndType(AudioNewUpdate.serializer(), AudioNewUpdate.type),
            SerializerAndType(VideoNewUpdate.serializer(), VideoNewUpdate.type),
            SerializerAndType(VideoCommentNewUpdate.serializer(), VideoCommentNewUpdate.type),
            SerializerAndType(VideoCommentEditUpdate.serializer(), VideoCommentEditUpdate.type),
            SerializerAndType(VideoCommentRestoreUpdate.serializer(), VideoCommentRestoreUpdate.type),
            SerializerAndType(VideoCommentDeleteUpdate.serializer(), VideoCommentDeleteUpdate.type),
            SerializerAndType(WallPostNewUpdate.serializer(), WallPostNewUpdate.type),
            SerializerAndType(WallRepostUpdate.serializer(), WallRepostUpdate.type),
            SerializerAndType(WallReplyNewUpdate.serializer(), WallReplyNewUpdate.type),
            SerializerAndType(WallReplyEditUpdate.serializer(), WallReplyEditUpdate.type),
            SerializerAndType(WallReplyRestoreUpdate.serializer(), WallReplyRestoreUpdate.type),
            SerializerAndType(WallReplyDeleteUpdate.serializer(), WallReplyDeleteUpdate.type),
            SerializerAndType(LikeAddUpdate.serializer(), LikeAddUpdate.type),
            SerializerAndType(LikeRemoveUpdate.serializer(), LikeRemoveUpdate.type),
            SerializerAndType(BoardPostNewUpdate.serializer(), BoardPostNewUpdate.type),
            SerializerAndType(BoardPostEditUpdate.serializer(), BoardPostEditUpdate.type),
            SerializerAndType(BoardPostRestoreUpdate.serializer(), BoardPostRestoreUpdate.type),
            SerializerAndType(BoardPostDeleteUpdate.serializer(), BoardPostDeleteUpdate.type),
            SerializerAndType(MarketCommentNewUpdate.serializer(), MarketCommentNewUpdate.type),
            SerializerAndType(MarketCommentEditUpdate.serializer(), MarketCommentEditUpdate.type),
            SerializerAndType(MarketCommentRestoreUpdate.serializer(), MarketCommentRestoreUpdate.type),
            SerializerAndType(MarketCommentDeleteUpdate.serializer(), MarketCommentDeleteUpdate.type),
            SerializerAndType(MarketOrderNewUpdate.serializer(), MarketOrderNewUpdate.type),
            SerializerAndType(MarketOrderEditUpdate.serializer(), MarketOrderEditUpdate.type),
            SerializerAndType(GroupJoinUpdate.serializer(), GroupJoinUpdate.type),
            SerializerAndType(GroupLeaveUpdate.serializer(), GroupLeaveUpdate.type),
            SerializerAndType(UserBlockUpdate.serializer(), UserBlockUpdate.type),
            SerializerAndType(UserUnblockUpdate.serializer(), UserUnblockUpdate.type),
            SerializerAndType(PollVoteNewUpdate.serializer(), PollVoteNewUpdate.type),
            SerializerAndType(GroupOfficersEditUpdate.serializer(), GroupOfficersEditUpdate.type),
            SerializerAndType(GroupChangeSettingsUpdate.serializer(), GroupChangeSettingsUpdate.type),
            SerializerAndType(GroupChangePhotoUpdate.serializer(), GroupChangePhotoUpdate.type),
            SerializerAndType(VkPayTransactionUpdate.serializer(), VkPayTransactionUpdate.type),
            SerializerAndType(AppPayloadUpdate.serializer(), AppPayloadUpdate.type),
            SerializerAndType(DonutSubscriptionCreateUpdate.serializer(), DonutSubscriptionCreateUpdate.type),
            SerializerAndType(DonutSubscriptionProlongedUpdate.serializer(), DonutSubscriptionProlongedUpdate.type),
            SerializerAndType(DonutSubscriptionExpiredUpdate.serializer(), DonutSubscriptionExpiredUpdate.type),
            SerializerAndType(DonutSubscriptionCancelledUpdate.serializer(), DonutSubscriptionCancelledUpdate.type),
            SerializerAndType(DonutSubscriptionPriceChangedUpdate.serializer(), DonutSubscriptionPriceChangedUpdate.type),
            SerializerAndType(DonutMoneyWithdrawUpdate.serializer(), DonutMoneyWithdrawUpdate.type),
            SerializerAndType(DonutMoneyWithdrawErrorUpdate.serializer(), DonutMoneyWithdrawErrorUpdate.type),
        )

        override fun selectDeserializer(element: JsonElement): DeserializationStrategy<BotLPUpdate> {
            val type = element.jsonObject["type"]!!.jsonPrimitive.content

            for (e in eventsList) {
                if (type == e.type) return e.serializer
            }
            throw IllegalArgumentException("Unsupported type.\nelement = $element\ntype = $type\n")
        }
    }
}

