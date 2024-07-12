package ru.krindra.vkkt.objects.base

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param uploadUrl Upload URL
 */
@Serializable
data class BaseUploadServer (
    @SerialName("upload_url") val uploadUrl: String,
)
