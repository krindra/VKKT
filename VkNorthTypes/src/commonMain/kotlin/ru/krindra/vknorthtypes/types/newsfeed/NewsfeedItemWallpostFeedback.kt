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
    @SerialName("question") val question: String,
    @SerialName("gratitude") val gratitude: String? = null,
    @SerialName("stars_count") val starsCount: Int? = null,
    @SerialName("track_code") val trackCode: String? = null,
    @SerialName("type") val type: NewsfeedItemWallpostFeedbackType,
    @SerialName("descriptions") val descriptions: List<String>? = null,
    @SerialName("answers") val answers: List<NewsfeedItemWallpostFeedbackAnswer>? = null,
)
