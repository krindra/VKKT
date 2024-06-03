package ru.krindra.vknorthtypes.types.stories

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param name 
 * @param counter 
 * @param isUnavailable 
 */
@Serializable
data class StoriesStatLine (
    @SerialName("name") val name: String,
    @SerialName("counter") val counter: Int? = null,
    @SerialName("is_unavailable") val isUnavailable: Boolean? = null,
)
