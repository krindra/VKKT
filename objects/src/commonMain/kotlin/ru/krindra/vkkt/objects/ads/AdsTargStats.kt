package ru.krindra.vkkt.objects.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param audienceCount Audience
 * @param recommendedCpc Recommended CPC value for 50% reach (old format)
 * @param recommendedCpm Recommended CPM value for 50% reach (old format)
 * @param recommendedCpc50 Recommended CPC value for 50% reach
 * @param recommendedCpm50 Recommended CPM value for 50% reach
 * @param recommendedCpc70 Recommended CPC value for 70% reach
 * @param recommendedCpm70 Recommended CPM value for 70% reach
 * @param recommendedCpc90 Recommended CPC value for 90% reach
 * @param recommendedCpm90 Recommended CPM value for 90% reach
 * @param totalAliveAudience Total alive audience
 */
@Serializable
data class AdsTargStats (
    @SerialName("audience_count") val audienceCount: Int,
    @SerialName("recommended_cpc") val recommendedCpc: String? = null,
    @SerialName("recommended_cpm") val recommendedCpm: String? = null,
    @SerialName("recommended_cpc_50") val recommendedCpc50: String? = null,
    @SerialName("recommended_cpc_70") val recommendedCpc70: String? = null,
    @SerialName("recommended_cpc_90") val recommendedCpc90: String? = null,
    @SerialName("recommended_cpm_50") val recommendedCpm50: String? = null,
    @SerialName("recommended_cpm_70") val recommendedCpm70: String? = null,
    @SerialName("recommended_cpm_90") val recommendedCpm90: String? = null,
    @SerialName("total_alive_audience") val totalAliveAudience: Int? = null,
)
