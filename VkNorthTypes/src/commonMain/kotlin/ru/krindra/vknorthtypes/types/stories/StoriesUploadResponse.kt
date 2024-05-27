package ru.krindra.vknorthtypes.types.stories

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param uploadResult A string hash that is used in the stories.save method
 */
@Serializable
data class StoriesUploadResponse (
    @SerialName("upload_result") val uploadResult: String? = null,
)

