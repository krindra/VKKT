package ru.krindra.vkkt.objects.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param id Lookalike request ID
 * @param createTime Lookalike request create time, as Unixtime
 * @param updateTime Lookalike request update time, as Unixtime
 * @param scheduledDeleteTime Time by which lookalike request would be deleted, as Unixtime
 * @param status Lookalike request status
 * @param sourceType Lookalike request source type
 * @param sourceRetargetingGroupId Retargeting group id, which was used as lookalike seed
 * @param sourceName Lookalike request seed name (retargeting group name)
 * @param audienceCount Lookalike request seed audience size
 * @param saveAudienceLevels 
 */
@Serializable
data class AdsLookalikeRequest (
    @SerialName("id") val id: Int,
    @SerialName("status") val status: String,
    @SerialName("create_time") val createTime: Int,
    @SerialName("update_time") val updateTime: Int,
    @SerialName("source_type") val sourceType: String,
    @SerialName("source_name") val sourceName: String? = null,
    @SerialName("audience_count") val audienceCount: Int? = null,
    @SerialName("scheduled_delete_time") val scheduledDeleteTime: Int? = null,
    @SerialName("source_retargeting_group_id") val sourceRetargetingGroupId: Int? = null,
    @SerialName("save_audience_levels") val saveAudienceLevels: List<AdsLookalikeRequestSaveAudienceLevel>? = null,
)
