package ru.krindra.vkkt.responses.apps

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.apps.*

/**
 * @param version Last uploaded version
 */
@Serializable
data class AppsGetLastUploadedVersionResponse (
    @SerialName("version") val version: String,
)

