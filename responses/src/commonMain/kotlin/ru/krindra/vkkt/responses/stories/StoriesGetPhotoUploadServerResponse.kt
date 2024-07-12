package ru.krindra.vkkt.responses.stories

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.stories.*

/**
 * @param uploadUrl Upload URL
 * @param userIds Users ID who can to see story.
 */
@Serializable
data class StoriesGetPhotoUploadServerResponse (
    @SerialName("user_ids") val userIds: List<Int>,
    @SerialName("upload_url") val uploadUrl: String,
)

