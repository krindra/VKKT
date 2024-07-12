package ru.krindra.vkkt.objects.stories

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * Additional data for promo stories
 * 
 * @param name Promo story title
 * @param photo50 RL of square photo of the story with 50 pixels in width
 * @param photo100 RL of square photo of the story with 100 pixels in width
 * @param notAnimated Hide animation for promo story
 * @param isAdvice Promo story from advice
 */
@Serializable
data class StoriesPromoBlock (
    @SerialName("name") val name: String,
    @SerialName("photo_50") val photo50: String,
    @SerialName("photo_100") val photo100: String,
    @SerialName("is_advice") val isAdvice: Boolean,
    @SerialName("not_animated") val notAnimated: Boolean,
)
