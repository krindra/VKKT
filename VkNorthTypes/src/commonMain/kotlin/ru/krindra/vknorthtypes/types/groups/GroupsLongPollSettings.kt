package ru.krindra.vknorthtypes.types.groups

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param apiVersion API version used for the events
 * @param events 
 * @param isEnabled Shows whether Long Poll is enabled
 */
@Serializable
data class GroupsLongPollSettings (
    @SerialName("api_version") val apiVersion: String? = null,
    @SerialName("events") val events: GroupsLongPollEvents,
    @SerialName("is_enabled") val isEnabled: Boolean,
)
