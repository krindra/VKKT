package ru.krindra.vkkt.longpoll.bot.objects

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.base.BaseLink
import ru.krindra.vkkt.objects.market.MarketOrderItem
import ru.krindra.vkkt.objects.market.MarketPrice

@Serializable
data class MarketOrderObject(
    @SerialName("cancel_info") val cancelInfo: BaseLink? = null,
    @SerialName("display_order_id") val displayOrderId: String? = null,
    @SerialName("track_link") val trackLink: String? = null,
    @SerialName("is_viewed_by_admin") val isViewedByAdmin: Boolean? = null,
    @SerialName("group_id") val groupId: Int,
    @SerialName("can_add_review") val canAddReview: Boolean? = null,
    @SerialName("address") val address: String? = null,
    @SerialName("preview_order_items") val previewOrderItems: List<MarketOrderItem>? = null,
    @SerialName("items_count") val itemsCount: Int,
    @SerialName("date") val date: Int,
    @SerialName("track_number") val trackNumber: String? = null,
    @SerialName("user_id") val userId: Int,
    @SerialName("discount") val discount: MarketPrice? = null,
    @SerialName("total_price") val totalPrice: MarketPrice,
    @SerialName("merchant_comment") val merchantComment: String? = null,
    @SerialName("status") val status: Int,
    @SerialName("comment") val comment: String? = null,
    @SerialName("id") val id: Int,
    @SerialName("comment_for_user") val commentForUser: String? = null,
    @SerialName("date_viewed") val dateViewed: Int? = null,
    @SerialName("weight") val weight: Int? = null,
)