package ru.krindra.vkkt.objects.adsweb

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param siteId 
 * @param day 
 */
@Serializable
data class AdswebGetFraudHistoryResponseEntriesEntry (
    @SerialName("day") val day: String,
    @SerialName("site_id") val siteId: Long,
)
