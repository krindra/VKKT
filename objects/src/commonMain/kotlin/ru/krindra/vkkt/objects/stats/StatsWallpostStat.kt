package ru.krindra.vkkt.objects.stats

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param postId 
 * @param hide Hidings number
 * @param joinGroup People have joined the group
 * @param links Link clickthrough
 * @param reachSubscribers Subscribers reach
 * @param reachSubscribersCount 
 * @param reachTotal Total reach
 * @param reachTotalCount 
 * @param reachViral 
 * @param reachAds 
 * @param report Reports number
 * @param toGroup Clickthrough to community
 * @param unsubscribe Unsubscribed members
 * @param sexAge 
 */
@Serializable
data class StatsWallpostStat (
    @SerialName("hide") val hide: Int? = null,
    @SerialName("links") val links: Int? = null,
    @SerialName("report") val report: Int? = null,
    @SerialName("post_id") val postId: Long? = null,
    @SerialName("to_group") val toGroup: Int? = null,
    @SerialName("reach_ads") val reachAds: Int? = null,
    @SerialName("join_group") val joinGroup: Int? = null,
    @SerialName("reach_total") val reachTotal: Int? = null,
    @SerialName("reach_viral") val reachViral: Int? = null,
    @SerialName("unsubscribe") val unsubscribe: Int? = null,
    @SerialName("sex_age") val sexAge: List<StatsSexAge>? = null,
    @SerialName("reach_total_count") val reachTotalCount: Int? = null,
    @SerialName("reach_subscribers") val reachSubscribers: Int? = null,
    @SerialName("reach_subscribers_count") val reachSubscribersCount: Int? = null,
)
