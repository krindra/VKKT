package ru.krindra.vkkt.responses.appWidgets

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.appWidgets.*

/**
 * @param uploadUrl To upload an image, generate POST-request to upload_url with a file in photo field. Then call appWidgets.saveAppImage method
 */
@Serializable
data class AppWidgetsGetGroupImageUploadServerResponse (
    @SerialName("upload_url") val uploadUrl: String? = null,
)

