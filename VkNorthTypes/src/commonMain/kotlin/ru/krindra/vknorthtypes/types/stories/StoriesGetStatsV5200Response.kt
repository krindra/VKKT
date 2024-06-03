package ru.krindra.vknorthtypes.types.stories

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param preview 
 * @param achievement 
 * @param achievementSubtitle 
 * @param categories 
 * @param needPrivacyBlock 
 */
@Serializable
data class StoriesGetStatsV5200Response (
    @SerialName("preview") val preview: String? = null,
    @SerialName("achievement") val achievement: String? = null,
    @SerialName("need_privacy_block") val needPrivacyBlock: Boolean? = null,
    @SerialName("achievement_subtitle") val achievementSubtitle: String? = null,
    @SerialName("categories") val categories: List<StoriesStatCategory>? = null,
)

