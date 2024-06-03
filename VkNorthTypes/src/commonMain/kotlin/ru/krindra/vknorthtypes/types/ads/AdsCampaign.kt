package ru.krindra.vknorthtypes.types.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param adsCount Amount of active ads in campaign
 * @param allLimit Campaign's total limit, rubles
 * @param createTime Campaign create time, as Unixtime
 * @param goalType Campaign goal type
 * @param userGoalType Campaign user goal type
 * @param isCboEnabled Shows if Campaign Budget Optimization is on
 * @param dayLimit Campaign's day limit, rubles
 * @param id Campaign ID
 * @param name Campaign title
 * @param startTime Campaign start time, as Unixtime
 * @param status 
 * @param stopTime Campaign stop time, as Unixtime
 * @param type 
 * @param updateTime Campaign update time, as Unixtime
 * @param viewsLimit Limit of views per user per campaign
 */
@Serializable
data class AdsCampaign (
    @SerialName("id") val id: Long,
    @SerialName("name") val name: String,
    @SerialName("stop_time") val stopTime: Int,
    @SerialName("start_time") val startTime: Int,
    @SerialName("all_limit") val allLimit: String,
    @SerialName("day_limit") val dayLimit: String,
    @SerialName("type") val type: AdsCampaignType,
    @SerialName("ads_count") val adsCount: Int? = null,
    @SerialName("goal_type") val goalType: Int? = null,
    @SerialName("status") val status: AdsCampaignStatus,
    @SerialName("create_time") val createTime: Int? = null,
    @SerialName("update_time") val updateTime: Int? = null,
    @SerialName("views_limit") val viewsLimit: Int? = null,
    @SerialName("user_goal_type") val userGoalType: Int? = null,
    @SerialName("is_cbo_enabled") val isCboEnabled: Boolean? = null,
)
