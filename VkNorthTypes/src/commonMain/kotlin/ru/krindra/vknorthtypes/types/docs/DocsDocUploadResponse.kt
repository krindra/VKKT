package ru.krindra.vknorthtypes.types.docs

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param file Uploaded file data
 */
@Serializable
data class DocsDocUploadResponse (
    @SerialName("file") val file: String? = null,
)

