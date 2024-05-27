package ru.krindra.vknorthtypes.types.stories

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param count Stat value
 * @param state 
 */
@Serializable
data class StoriesStoryStatsStat (
    @SerialName("count") val count: Int? = null,
    @SerialName("state") val state: StoriesStoryStatsState,
)
