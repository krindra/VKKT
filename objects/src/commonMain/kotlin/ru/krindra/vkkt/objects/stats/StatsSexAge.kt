package ru.krindra.vkkt.objects.stats

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param count Visitors number
 * @param value Sex/age value
 * @param reach 
 * @param reachSubscribers 
 * @param countSubscribers 
 */
@Serializable
data class StatsSexAge (
    @SerialName("value") val value: String,
    @SerialName("count") val count: Int? = null,
    @SerialName("reach") val reach: Int? = null,
    @SerialName("count_subscribers") val countSubscribers: Int? = null,
    @SerialName("reach_subscribers") val reachSubscribers: Int? = null,
)
