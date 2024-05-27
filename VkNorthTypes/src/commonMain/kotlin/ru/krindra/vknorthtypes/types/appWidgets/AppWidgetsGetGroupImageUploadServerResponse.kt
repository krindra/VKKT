package ru.krindra.vknorthtypes.types.appWidgets

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param uploadUrl To upload an image, generate POST-request to upload_url with a file in photo field. Then call appWidgets.saveAppImage method
 */
@Serializable
data class AppWidgetsGetGroupImageUploadServerResponse (
    @SerialName("upload_url") val uploadUrl: String? = null,
)

