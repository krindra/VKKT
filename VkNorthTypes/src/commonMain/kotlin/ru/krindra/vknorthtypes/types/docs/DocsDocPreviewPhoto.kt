package ru.krindra.vknorthtypes.types.docs

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param sizes 
 */
@Serializable
data class DocsDocPreviewPhoto (
    @SerialName("sizes") val sizes: List<DocsDocPreviewPhotoSizes>? = null,
)
