package ru.krindra.vknorthtypes.types.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param clicks Clicks number
 * @param linkExternalClicks External clicks number
 * @param day Day as YYYY-MM-DD
 * @param impressions Impressions number
 * @param joinRate Events number
 * @param month Month as YYYY-MM
 * @param year Year as YYYY
 * @param overall 1 if period=overall
 * @param reach Reach 
 * @param spent Spent funds
 * @param videoPlaysUniqueStarted Video plays unique started count
 * @param videoPlaysUnique3Seconds Video plays unique 3 seconds count
 * @param videoPlaysUnique10Seconds Video plays unique 10 seconds count
 * @param videoPlaysUnique25Percents Video plays unique 25 percents count
 * @param videoPlaysUnique50Percents Video plays unique 50 percents count
 * @param videoPlaysUnique75Percents Video plays unique 75 percents count
 * @param videoPlaysUnique100Percents Video plays unique 100 percents count
 * @param effectiveCostPerClick Effective cost per click
 * @param effectiveCostPerMille Effective cost per mille
 * @param effectiveCpf Effective cpf
 * @param effectiveCostPerMessage Effective cost per message
 * @param messageSends Message sends count
 * @param messageSendsByAnyUser Message sends by anu user
 * @param conversionsExternal Conversions external
 * @param conversionCount Conversions count
 * @param conversionCr Conversions CR
 * @param dayFrom Day from
 * @param dayTo Day to
 * @param ctr Ctr
 * @param uniqViewsCount Unique views count
 * @param mobileAppStat Mobile app stat
 */
@Serializable
data class AdsStatsFormat (
    @SerialName("year") val year: Int? = null,
    @SerialName("ctr") val ctr: String? = null,
    @SerialName("day") val day: String? = null,
    @SerialName("reach") val reach: Int? = null,
    @SerialName("clicks") val clicks: Int? = null,
    @SerialName("month") val month: String? = null,
    @SerialName("spent") val spent: String? = null,
    @SerialName("day_to") val dayTo: String? = null,
    @SerialName("overall") val overall: Int? = null,
    @SerialName("join_rate") val joinRate: Int? = null,
    @SerialName("day_from") val dayFrom: String? = null,
    @SerialName("impressions") val impressions: Int? = null,
    @SerialName("message_sends") val messageSends: Int? = null,
    @SerialName("conversion_cr") val conversionCr: String? = null,
    @SerialName("effective_cpf") val effectiveCpf: String? = null,
    @SerialName("uniq_views_count") val uniqViewsCount: Int? = null,
    @SerialName("conversion_count") val conversionCount: Int? = null,
    @SerialName("link_external_clicks") val linkExternalClicks: Int? = null,
    @SerialName("conversions_external") val conversionsExternal: Int? = null,
    @SerialName("message_sends_by_any_user") val messageSendsByAnyUser: Int? = null,
    @SerialName("effective_cost_per_click") val effectiveCostPerClick: String? = null,
    @SerialName("effective_cost_per_mille") val effectiveCostPerMille: String? = null,
    @SerialName("mobile_app_stat") val mobileAppStat: List<AdsMobileStatItem>? = null,
    @SerialName("video_plays_unique_started") val videoPlaysUniqueStarted: Int? = null,
    @SerialName("effective_cost_per_message") val effectiveCostPerMessage: String? = null,
    @SerialName("video_plays_unique_3_seconds") val videoPlaysUnique3Seconds: Int? = null,
    @SerialName("video_plays_unique_10_seconds") val videoPlaysUnique10Seconds: Int? = null,
    @SerialName("video_plays_unique_25_percents") val videoPlaysUnique25Percents: Int? = null,
    @SerialName("video_plays_unique_50_percents") val videoPlaysUnique50Percents: Int? = null,
    @SerialName("video_plays_unique_75_percents") val videoPlaysUnique75Percents: Int? = null,
    @SerialName("video_plays_unique_100_percents") val videoPlaysUnique100Percents: Int? = null,
)
