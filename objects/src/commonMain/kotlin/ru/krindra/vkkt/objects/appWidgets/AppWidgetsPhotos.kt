package ru.krindra.vkkt.objects.appWidgets

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param count 
 * @param items 
 */
@Serializable
data class AppWidgetsPhotos (
    @SerialName("count") val count: Int? = null,
    @SerialName("items") val items: List<AppWidgetsPhoto>? = null,
)
