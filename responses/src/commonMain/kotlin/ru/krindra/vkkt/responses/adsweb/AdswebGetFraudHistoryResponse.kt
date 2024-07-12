package ru.krindra.vkkt.responses.adsweb

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.adsweb.*

/**
 * @param count 
 * @param entries 
 */
@Serializable
data class AdswebGetFraudHistoryResponse (
    @SerialName("count") val count: Int,
    @SerialName("entries") val entries: List<AdswebGetFraudHistoryResponseEntriesEntry>? = null,
)

