package ru.krindra.vknorthtypes.types.newsfeed

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param status 
 */
@Serializable
data class NewsfeedIgnoreItemResponse (
    @SerialName("status") val status: Boolean,
)

