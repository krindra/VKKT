package ru.krindra.vknorthtypes.types.widgets

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param count Total number
 * @param posts 
 */
@Serializable
data class WidgetsGetCommentsResponse (
    @SerialName("count") val count: Int,
    @SerialName("posts") val posts: List<WidgetsWidgetComment>,
)

