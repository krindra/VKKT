package ru.krindra.vknorthtypes.types.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * Comments
 * 
 * @param count Count
 */
@Serializable
data class AdsPostComments (
    @SerialName("count") val count: Int? = null,
)
