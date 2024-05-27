package ru.krindra.vknorthtypes.types.stories

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param answer 
 * @param bans 
 * @param openLink 
 * @param replies 
 * @param shares 
 * @param subscribers 
 * @param views 
 * @param likes 
 */
@Serializable
data class StoriesStoryStats (
    @SerialName("subscribers") val subscribers: StoriesStoryStatsStat,
    @SerialName("replies") val replies: StoriesStoryStatsStat,
    @SerialName("bans") val bans: StoriesStoryStatsStat,
    @SerialName("answer") val answer: StoriesStoryStatsStat,
    @SerialName("likes") val likes: StoriesStoryStatsStat,
    @SerialName("open_link") val openLink: StoriesStoryStatsStat,
    @SerialName("shares") val shares: StoriesStoryStatsStat,
    @SerialName("views") val views: StoriesStoryStatsStat,
)
