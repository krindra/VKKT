package ru.krindra.vknorthtypes.longpoll.bot.updates

import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.KSerializer
import kotlinx.serialization.json.JsonContentPolymorphicSerializer
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive

object UpdatesSerializer : JsonContentPolymorphicSerializer<BotLPUpdate>(BotLPUpdate::class) {
    private data class SerializerAndType<T>(
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