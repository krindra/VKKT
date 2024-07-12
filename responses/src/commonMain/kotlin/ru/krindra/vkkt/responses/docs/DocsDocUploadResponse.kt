package ru.krindra.vkkt.responses.docs

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.docs.*

/**
 * @param file Uploaded file data
 */
@Serializable
data class DocsDocUploadResponse (
    @SerialName("file") val file: String? = null,
)

