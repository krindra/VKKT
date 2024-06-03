package ru.krindra.vknorthtypes.types.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param hide Hides amount
 * @param id Object ID from 'ids' parameter
 * @param joinGroup Community joins
 * @param links Link clicks
 * @param reachSubscribers Subscribers reach
 * @param reachTotal Total reach
 * @param report Reports amount
 * @param toGroup Community clicks
 * @param unsubscribe 'Unsubscribe' events amount
 * @param videoViews100p Video views for 100 percent
 * @param videoViews25p Video views for 25 percent
 * @param videoViews3s Video views for 3 seconds
 * @param videoViews10s Video views for 10 seconds
 * @param videoViews50p Video views for 50 percent
 * @param videoViews75p Video views for 75 percent
 * @param videoViewsStart Video starts
 * @param prettyCardsClicks Pretty cards clicks
 */
@Serializable
data class AdsPromotedPostReach (
    @SerialName("id") val id: Long,
    @SerialName("hide") val hide: Int,
    @SerialName("links") val links: Int,
    @SerialName("report") val report: Int,
    @SerialName("to_group") val toGroup: Int,
    @SerialName("join_group") val joinGroup: Int,
    @SerialName("reach_total") val reachTotal: Int,
    @SerialName("unsubscribe") val unsubscribe: Int,
    @SerialName("reach_subscribers") val reachSubscribers: Int,
    @SerialName("video_views_3s") val videoViews3s: Int? = null,
    @SerialName("video_views_10s") val videoViews10s: Int? = null,
    @SerialName("video_views_25p") val videoViews25p: Int? = null,
    @SerialName("video_views_50p") val videoViews50p: Int? = null,
    @SerialName("video_views_75p") val videoViews75p: Int? = null,
    @SerialName("video_views_100p") val videoViews100p: Int? = null,
    @SerialName("video_views_start") val videoViewsStart: Int? = null,
    @SerialName("pretty_cards_clicks") val prettyCardsClicks: Int? = null,
)
