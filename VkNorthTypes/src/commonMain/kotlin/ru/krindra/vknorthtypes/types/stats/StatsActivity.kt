package ru.krindra.vknorthtypes.types.stats

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * Activity stats
 * 
 * @param comments Comments number
 * @param copies Reposts number
 * @param hidden Hidden from news count
 * @param likes Likes number
 * @param subscribed New subscribers count
 * @param unsubscribed Unsubscribed count
 */
@Serializable
data class StatsActivity (
    @SerialName("subscribed") val subscribed: Int? = null,
    @SerialName("likes") val likes: Int? = null,
    @SerialName("hidden") val hidden: Int? = null,
    @SerialName("unsubscribed") val unsubscribed: Int? = null,
    @SerialName("copies") val copies: Int? = null,
    @SerialName("comments") val comments: Int? = null,
)
