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
    @SerialName("bans") val bans: StoriesStoryStatsStat,
    @SerialName("likes") val likes: StoriesStoryStatsStat,
    @SerialName("views") val views: StoriesStoryStatsStat,
    @SerialName("answer") val answer: StoriesStoryStatsStat,
    @SerialName("shares") val shares: StoriesStoryStatsStat,
    @SerialName("replies") val replies: StoriesStoryStatsStat,
    @SerialName("open_link") val openLink: StoriesStoryStatsStat,
    @SerialName("subscribers") val subscribers: StoriesStoryStatsStat,
)
