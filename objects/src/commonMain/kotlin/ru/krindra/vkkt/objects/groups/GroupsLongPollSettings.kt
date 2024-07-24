package ru.krindra.vkkt.objects.groups

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param apiVersion API version used for the events
 * @param events 
 * @param isEnabled Shows whether Int Poll is enabled
 */
@Serializable
data class GroupsIntPollSettings (
    @SerialName("is_enabled") val isEnabled: Boolean,
    @SerialName("events") val events: GroupsIntPollEvents,
    @SerialName("api_version") val apiVersion: String? = null,
)
