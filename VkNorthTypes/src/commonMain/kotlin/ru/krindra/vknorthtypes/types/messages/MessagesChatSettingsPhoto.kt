package ru.krindra.vknorthtypes.types.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param photo50 URL of the preview image with 50px in width
 * @param photo100 URL of the preview image with 100px in width
 * @param photo200 URL of the preview image with 200px in width
 * @param isDefaultPhoto If provided photo is default
 * @param isDefaultCallPhoto If provided photo is default call photo
 */
@Serializable
data class MessagesChatSettingsPhoto (
    @SerialName("photo_50") val photo50: String? = null,
    @SerialName("photo_100") val photo100: String? = null,
    @SerialName("photo_200") val photo200: String? = null,
    @SerialName("is_default_photo") val isDefaultPhoto: Boolean? = null,
    @SerialName("is_default_call_photo") val isDefaultCallPhoto: Boolean? = null,
)
