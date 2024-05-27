package ru.krindra.vknorthtypes.types.stories

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param uploadUrl Upload URL
 * @param userIds Users ID who can to see story.
 */
@Serializable
data class StoriesGetVideoUploadServerResponse (
    @SerialName("upload_url") val uploadUrl: String,
    @SerialName("user_ids") val userIds: List<Int>,
)

