package ru.krindra.vknorthtypes.types.wall

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param count Count
 */
@Serializable
data class WallViews (
    @SerialName("count") val count: Int? = null,
)
