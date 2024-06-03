package ru.krindra.vknorthtypes.types.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param stories 
 * @param owner 
 * @param storiesDisclaimersText Stories disclaimers text
 */
@Serializable
data class AdsStories (
    @SerialName("owner") val owner: AdsStoriesOwner? = null,
    @SerialName("stories") val stories: List<AdsStoryItem>? = null,
    @SerialName("stories_disclaimers_text") val storiesDisclaimersText: String? = null,
)
