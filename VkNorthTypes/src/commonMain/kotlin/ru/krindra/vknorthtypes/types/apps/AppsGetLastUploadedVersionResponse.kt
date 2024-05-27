package ru.krindra.vknorthtypes.types.apps

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param version Last uploaded version
 */
@Serializable
data class AppsGetLastUploadedVersionResponse (
    @SerialName("version") val version: String,
)

