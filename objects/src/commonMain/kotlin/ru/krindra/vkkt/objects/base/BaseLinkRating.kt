package ru.krindra.vkkt.objects.base

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param reviewsCount Count of reviews
 * @param stars Count of stars
 * @param type 
 */
@Serializable
data class BaseLinkRating (
    @SerialName("type") val type: String? = null,
    @SerialName("stars") val stars: Double? = null,
    @SerialName("reviews_count") val reviewsCount: Int? = null,
)
