package ru.krindra.vknorthtypes.types.owner

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param state 
 * @param description wiki text to describe user state
 */
@Serializable
data class OwnerState (
    @SerialName("description") val description: String? = null,
    @SerialName("state") val state: Int? = null,
)
