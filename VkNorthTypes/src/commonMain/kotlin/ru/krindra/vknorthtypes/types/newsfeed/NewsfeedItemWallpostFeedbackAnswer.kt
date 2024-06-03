package ru.krindra.vknorthtypes.types.newsfeed

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param title 
 * @param id 
 */
@Serializable
data class NewsfeedItemWallpostFeedbackAnswer (
    @SerialName("id") val id: String,
    @SerialName("title") val title: String,
)
