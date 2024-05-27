package ru.krindra.vknorthtypes.types.adsweb

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param count 
 * @param entries 
 */
@Serializable
data class AdswebGetFraudHistoryResponse (
    @SerialName("count") val count: Int,
    @SerialName("entries") val entries: List<AdswebGetFraudHistoryResponseEntriesEntry>? = null,
)

