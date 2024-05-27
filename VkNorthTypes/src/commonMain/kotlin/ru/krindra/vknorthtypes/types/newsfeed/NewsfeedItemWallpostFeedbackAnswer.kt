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
    @SerialName("title") val title: String,
    @SerialName("id") val id: String,
)
