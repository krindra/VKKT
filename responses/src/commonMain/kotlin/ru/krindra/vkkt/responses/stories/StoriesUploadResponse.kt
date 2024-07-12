package ru.krindra.vkkt.responses.stories

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.stories.*

/**
 * @param uploadResult A string hash that is used in the stories.save method
 */
@Serializable
data class StoriesUploadResponse (
    @SerialName("upload_result") val uploadResult: String? = null,
)

