package ru.krindra.vknorthtypes.types.newsfeed

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param type 
 * @param question 
 * @param answers 
 * @param starsCount 
 * @param descriptions 
 * @param gratitude 
 * @param trackCode 
 */
@Serializable
data class NewsfeedItemWallpostFeedback (
    @SerialName("type") val type: NewsfeedItemWallpostFeedbackType,
    @SerialName("gratitude") val gratitude: String? = null,
    @SerialName("track_code") val trackCode: String? = null,
    @SerialName("question") val question: String,
    @SerialName("stars_count") val starsCount: Int? = null,
    @SerialName("answers") val answers: List<NewsfeedItemWallpostFeedbackAnswer>? = null,
    @SerialName("descriptions") val descriptions: List<String>? = null,
)
