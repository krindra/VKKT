package ru.krindra.vknorthtypes.types.appWidgets

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.base.BaseImage

/**
 *
 * @param id Image ID
 * @param images 
 */
@Serializable
data class AppWidgetsPhoto (
    @SerialName("images") val images: List<BaseImage>,
    @SerialName("id") val id: String,
)
