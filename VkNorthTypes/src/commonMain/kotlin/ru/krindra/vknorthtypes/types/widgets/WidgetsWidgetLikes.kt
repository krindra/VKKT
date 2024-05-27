package ru.krindra.vknorthtypes.types.widgets

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param count Likes number
 */
@Serializable
data class WidgetsWidgetLikes (
    @SerialName("count") val count: Int? = null,
)
