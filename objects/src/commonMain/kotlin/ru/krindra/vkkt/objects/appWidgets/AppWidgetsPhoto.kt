package ru.krindra.vkkt.objects.appWidgets

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.base.BaseImage

/**
 *
 * @param id Image ID
 * @param images 
 */
@Serializable
data class AppWidgetsPhoto (
    @SerialName("id") val id: String,
    @SerialName("images") val images: List<BaseImage>,
)
