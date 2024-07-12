package ru.krindra.vkkt.responses.widgets

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.widgets.*

/**
 * @param count Total number
 * @param pages 
 */
@Serializable
data class WidgetsGetPagesResponse (
    @SerialName("count") val count: Int,
    @SerialName("pages") val pages: List<WidgetsWidgetPage>,
)

