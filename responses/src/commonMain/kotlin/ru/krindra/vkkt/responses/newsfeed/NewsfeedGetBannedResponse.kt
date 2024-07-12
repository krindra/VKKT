package ru.krindra.vkkt.responses.newsfeed

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.newsfeed.*

/**
 * @param groups 
 * @param members 
 */
@Serializable
data class NewsfeedGetBannedResponse (
    @SerialName("groups") val groups: List<Int>? = null,
    @SerialName("members") val members: List<Int>? = null,
)

