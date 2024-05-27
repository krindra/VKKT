package ru.krindra.vknorthtypes.types.asr

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param taskId ID of created task in UUID format.
 */
@Serializable
data class AsrProcessResponse (
    @SerialName("task_id") val taskId: String,
)

