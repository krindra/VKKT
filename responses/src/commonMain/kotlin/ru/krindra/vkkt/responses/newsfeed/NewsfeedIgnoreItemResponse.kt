package ru.krindra.vkkt.responses.newsfeed

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.newsfeed.*

/**
 * @param status 
 */
@Serializable
data class NewsfeedIgnoreItemResponse (
    @SerialName("status") val status: Boolean,
)

