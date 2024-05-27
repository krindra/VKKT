package ru.krindra.vknorthtypes.types.utils

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param timestamp Start time
 * @param views Total views number
 */
@Serializable
data class UtilsStats (
    @SerialName("views") val views: Int? = null,
    @SerialName("timestamp") val timestamp: Int? = null,
)
