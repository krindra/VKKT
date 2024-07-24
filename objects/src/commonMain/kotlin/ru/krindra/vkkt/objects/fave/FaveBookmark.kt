package ru.krindra.vkkt.objects.fave

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.wall.WallWallpostFull
import ru.krindra.vkkt.objects.base.BaseLink
import ru.krindra.vkkt.objects.video.VideoVideoFull
import ru.krindra.vkkt.objects.market.MarketMarketItem

/**
 *
 * @param addedDate Timestamp, when this item was bookmarked
 * @param link 
 * @param post 
 * @param product 
 * @param seen Has user seen this item
 * @param tags 
 * @param type Item type
 * @param video 
 */
@Serializable
data class FaveBookmark (
    @SerialName("seen") val seen: Boolean,
    @SerialName("tags") val tags: List<FaveTag>,
    @SerialName("added_date") val addedDate: Int,
    @SerialName("link") val link: BaseLink? = null,
    @SerialName("type") val type: FaveBookmarkType,
    @SerialName("post") val post: WallWallpostFull? = null,
    @SerialName("video") val video: VideoVideoFull? = null,
    @SerialName("product") val product: MarketMarketItem? = null,
)
