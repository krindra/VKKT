package ru.krindra.vknorthtypes.types.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * Views
 * 
 * @param count Count
 */
@Serializable
data class AdsPostViews (
    @SerialName("count") val count: Int? = null,
)
