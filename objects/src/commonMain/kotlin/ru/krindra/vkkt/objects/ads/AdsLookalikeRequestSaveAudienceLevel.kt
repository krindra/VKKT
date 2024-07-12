package ru.krindra.vkkt.objects.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param level Save audience level id, which is used in save audience queries
 * @param audienceCount Saved audience audience size for according level
 */
@Serializable
data class AdsLookalikeRequestSaveAudienceLevel (
    @SerialName("level") val level: Int? = null,
    @SerialName("audience_count") val audienceCount: Int? = null,
)
