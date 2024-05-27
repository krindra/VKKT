package ru.krindra.vknorthtypes.types.stories

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param uploadResult 
 */
@Serializable
data class StoriesUploadResult (
    @SerialName("upload_result") val uploadResult: String? = null,
)
