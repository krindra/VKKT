package ru.krindra.vknorthtypes.types.asr

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param id Task ID in UUID format.
 * @param status Status of the task.
 * @param text Recognised text, if task is `finished`.
 */
@Serializable
data class AsrTask (
    @SerialName("text") val text: String,
    @SerialName("status") val status: String,
    @SerialName("id") val id: String,
)
