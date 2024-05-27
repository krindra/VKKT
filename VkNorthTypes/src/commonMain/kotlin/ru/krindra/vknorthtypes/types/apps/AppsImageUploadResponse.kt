package ru.krindra.vknorthtypes.types.apps

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param hash Uploading hash
 * @param image Uploaded photo data
 */
@Serializable
data class AppsImageUploadResponse (
    @SerialName("hash") val hash: String? = null,
    @SerialName("image") val image: String? = null,
)

