package ru.krindra.vknorthtypes.types.widgets

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param count Total number
 * @param pages 
 */
@Serializable
data class WidgetsGetPagesResponse (
    @SerialName("count") val count: Int,
    @SerialName("pages") val pages: List<WidgetsWidgetPage>,
)

