package ru.krindra.vkkt.responses.asr

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.asr.*

/**
 * @param taskId ID of created task in UUID format.
 */
@Serializable
data class AsrProcessResponse (
    @SerialName("task_id") val taskId: String,
)

