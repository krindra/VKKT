package ru.krindra.vkkt.objects.groups

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param apiVersion API version used for the events
 * @param events 
 */
@Serializable
data class GroupsCallbackSettings (
    @SerialName("api_version") val apiVersion: String? = null,
    @SerialName("events") val events: GroupsIntPollEvents? = null,
)
