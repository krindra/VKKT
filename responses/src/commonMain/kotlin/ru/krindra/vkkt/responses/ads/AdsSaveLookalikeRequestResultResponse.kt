package ru.krindra.vkkt.responses.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.ads.*

/**
 * @param retargetingGroupId Retargeting group ID
 * @param audienceCount Audience count
 */
@Serializable
data class AdsSaveLookalikeRequestResultResponse (
    @SerialName("audience_count") val audienceCount: Int,
    @SerialName("retargeting_group_id") val retargetingGroupId: Int,
)

