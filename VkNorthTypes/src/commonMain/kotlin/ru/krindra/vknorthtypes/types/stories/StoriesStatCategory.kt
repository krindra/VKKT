package ru.krindra.vknorthtypes.types.stories

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param header 
 * @param lines 
 */
@Serializable
data class StoriesStatCategory (
    @SerialName("lines") val lines: List<StoriesStatLine>,
    @SerialName("header") val header: String,
)
