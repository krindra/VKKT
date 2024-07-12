package ru.krindra.vkkt.objects.groups

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param isEnabled Information whether live covers is enabled
 * @param isScalable Information whether live covers photo scaling is enabled
 * @param storyIds 
 */
@Serializable
data class GroupsLiveCovers (
    @SerialName("is_enabled") val isEnabled: Boolean,
    @SerialName("is_scalable") val isScalable: Boolean? = null,
    @SerialName("story_ids") val storyIds: List<String>? = null,
)
