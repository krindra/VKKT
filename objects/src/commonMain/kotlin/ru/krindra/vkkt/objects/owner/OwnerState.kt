package ru.krindra.vkkt.objects.owner

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param state 
 * @param description wiki text to describe user state
 */
@Serializable
data class OwnerState (
    @SerialName("state") val state: Int? = null,
    @SerialName("description") val description: String? = null,
)
