package ru.krindra.vkkt.responses.widgets

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.widgets.*

/**
 * @param count Total number
 * @param posts 
 */
@Serializable
data class WidgetsGetCommentsResponse (
    @SerialName("count") val count: Int,
    @SerialName("posts") val posts: List<WidgetsWidgetComment>,
)

