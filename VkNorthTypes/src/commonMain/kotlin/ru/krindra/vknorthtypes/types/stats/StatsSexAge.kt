package ru.krindra.vknorthtypes.types.stats

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
    @SerialName("count") val count: Int? = null,
    @SerialName("count_subscribers") val countSubscribers: Int? = null,
    @SerialName("value") val value: String,
    @SerialName("reach") val reach: Int? = null,
    @SerialName("reach_subscribers") val reachSubscribers: Int? = null,
)
