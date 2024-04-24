package ru.krindra.vknorthtypes.longpoll.bot

import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonContentPolymorphicSerializer
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive

@Serializable(EventsSerializer::class)
abstract class BaseEvent {
    abstract val type: String
    abstract val eventId: String
    abstract val v: String
    abstract val groupId: Int
}

private object EventsSerializer: JsonContentPolymorphicSerializer<BaseEvent>(BaseEvent::class) {
    private data class SerializerAndType<T>(
        val serializer: KSerializer<T>,
        val type: String
    )

    private val eventsList = listOf(
        SerializerAndType(MessageReplyEvent.serializer(), MessageReplyEvent.type), SerializerAndType(MessageEditEvent.serializer(), MessageEditEvent.type),
        SerializerAndType(MessageAllowEvent.serializer(), MessageAllowEvent.type), SerializerAndType(MessageDenyEvent.serializer(), MessageDenyEvent.type),
        SerializerAndType(MessageTypingStateEvent.serializer(), MessageTypingStateEvent.type), SerializerAndType(MessageEventEvent.serializer(), MessageEventEvent.type),
        SerializerAndType(PhotoNewEvent.serializer(), PhotoNewEvent.type), SerializerAndType(PhotoCommentNewEvent.serializer(), PhotoCommentNewEvent.type),
        SerializerAndType(PhotoCommentEditEvent.serializer(), PhotoCommentEditEvent.type), SerializerAndType(PhotoCommentRestoreEvent.serializer(), PhotoCommentRestoreEvent.type),
        SerializerAndType(AudioNewEvent.serializer(), AudioNewEvent.type), SerializerAndType(VideoNewEvent.serializer(), VideoNewEvent.type),
        SerializerAndType(VideoCommentNewEvent.serializer(), VideoCommentNewEvent.type), SerializerAndType(VideoCommentEditEvent.serializer(), VideoCommentEditEvent.type),
        SerializerAndType(VideoCommentRestoreEvent.serializer(), VideoCommentRestoreEvent.type), SerializerAndType(VideoCommentDeleteEvent.serializer(), VideoCommentDeleteEvent.type),
        SerializerAndType(WallPostNewEvent.serializer(), WallPostNewEvent.type), SerializerAndType(WallRepostEvent.serializer(), WallRepostEvent.type),
        SerializerAndType(WallReplyNewEvent.serializer(), WallReplyNewEvent.type), SerializerAndType(WallReplyEditEvent.serializer(), WallReplyEditEvent.type),
        SerializerAndType(WallReplyRestoreEvent.serializer(), WallReplyRestoreEvent.type), SerializerAndType(WallReplyDeleteEvent.serializer(), WallReplyDeleteEvent.type),
        SerializerAndType(LikeAddEvent.serializer(), LikeAddEvent.type), SerializerAndType(LikeRemoveEvent.serializer(), LikeRemoveEvent.type),
        SerializerAndType(BoardPostNewEvent.serializer(), BoardPostNewEvent.type), SerializerAndType(BoardPostEditEvent.serializer(), BoardPostEditEvent.type),
        SerializerAndType(BoardPostRestoreEvent.serializer(), BoardPostRestoreEvent.type), SerializerAndType(BoardPostDeleteEvent.serializer(), BoardPostDeleteEvent.type),
        SerializerAndType(MarketCommentNewEvent.serializer(), MarketCommentNewEvent.type), SerializerAndType(MarketCommentEditEvent.serializer(), MarketCommentEditEvent.type),
        SerializerAndType(MarketCommentRestoreEvent.serializer(), MarketCommentRestoreEvent.type), SerializerAndType(MarketCommentDeleteEvent.serializer(), MarketCommentDeleteEvent.type),
        SerializerAndType(MarketOrderNewEvent.serializer(), MarketOrderNewEvent.type), SerializerAndType(MarketOrderEditEvent.serializer(), MarketOrderEditEvent.type),
        SerializerAndType(GroupJoinEvent.serializer(), GroupJoinEvent.type), SerializerAndType(GroupLeaveEvent.serializer(), GroupLeaveEvent.type),
        SerializerAndType(UserBlockEvent.serializer(), UserBlockEvent.type), SerializerAndType(UserUnblockEvent.serializer(), UserUnblockEvent.type),
        SerializerAndType(PollVoteNewEvent.serializer(), PollVoteNewEvent.type), SerializerAndType(GroupOfficersEditEvent.serializer(), GroupOfficersEditEvent.type),
        SerializerAndType(GroupChangeSettingsEvent.serializer(), GroupChangeSettingsEvent.type), SerializerAndType(GroupChangePhotoEvent.serializer(), GroupChangePhotoEvent.type),
        SerializerAndType(VkPayTransactionEvent.serializer(), VkPayTransactionEvent.type), SerializerAndType(AppPayloadEvent.serializer(), AppPayloadEvent.type),
        SerializerAndType(DonutSubscriptionCreateEvent.serializer(), DonutSubscriptionCreateEvent.type), SerializerAndType(DonutSubscriptionProlongedEvent.serializer(), DonutSubscriptionProlongedEvent.type),
        SerializerAndType(DonutSubscriptionExpiredEvent.serializer(), DonutSubscriptionExpiredEvent.type), SerializerAndType(DonutSubscriptionCancelledEvent.serializer(), DonutSubscriptionCancelledEvent.type),
        SerializerAndType(DonutSubscriptionPriceChangedEvent.serializer(), DonutSubscriptionPriceChangedEvent.type), SerializerAndType(DonutMoneyWithdrawEvent.serializer(), DonutMoneyWithdrawEvent.type),
        SerializerAndType(DonutMoneyWithdrawErrorEvent.serializer(), DonutMoneyWithdrawErrorEvent.type)
    )
    override fun selectDeserializer(element: JsonElement): DeserializationStrategy<BaseEvent> {
        val type = element.jsonObject["type"]!!.jsonPrimitive.content

        for (e in eventsList) {
            if (type == e.type) return e.serializer
        }
        throw IllegalArgumentException("Unsupported type.\nelement = $element\ntype = $type\n")
    }
}
