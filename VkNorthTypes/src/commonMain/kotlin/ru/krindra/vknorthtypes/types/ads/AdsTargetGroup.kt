package ru.krindra.vknorthtypes.types.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param id Group ID
 * @param name Group name
 * @param isAudience Is audience
 * @param isShared Is shared
 * @param fileSource File source
 * @param apiSource API source
 * @param lookalikeSource File source
 * @param audienceCount Audience
 * @param domain Site domain
 * @param lifetime Number of days for user to be in group
 * @param pixel Pixel code
 * @param targetPixelId Target Pixel id
 * @param targetPixelRules Target Pixel rules
 * @param lastUpdated Last updated
 */
@Serializable
data class AdsTargetGroup (
    @SerialName("id") val id: Long? = null,
    @SerialName("name") val name: String? = null,
    @SerialName("pixel") val pixel: String? = null,
    @SerialName("domain") val domain: String? = null,
    @SerialName("lifetime") val lifetime: Int? = null,
    @SerialName("is_shared") val isShared: Boolean? = null,
    @SerialName("api_source") val apiSource: Boolean? = null,
    @SerialName("last_updated") val lastUpdated: Int? = null,
    @SerialName("file_source") val fileSource: Boolean? = null,
    @SerialName("is_audience") val isAudience: Boolean? = null,
    @SerialName("audience_count") val audienceCount: Int? = null,
    @SerialName("target_pixel_id") val targetPixelId: Long? = null,
    @SerialName("lookalike_source") val lookalikeSource: Boolean? = null,
    @SerialName("target_pixel_rules") val targetPixelRules: List<AdsTargetGroupTargetPixelRule>? = null,
)
