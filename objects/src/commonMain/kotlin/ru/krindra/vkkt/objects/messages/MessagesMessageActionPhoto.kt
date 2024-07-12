package ru.krindra.vkkt.objects.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param photo50 URL of the preview image with 50px in width
 * @param photo100 URL of the preview image with 100px in width
 * @param photo200 URL of the preview image with 200px in width
 */
@Serializable
data class MessagesMessageActionPhoto (
    @SerialName("photo_50") val photo50: String,
    @SerialName("photo_100") val photo100: String,
    @SerialName("photo_200") val photo200: String,
)
