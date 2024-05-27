package ru.krindra.vknorthtypes.types.wall

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param isDon Means commentator is donator
 * @param placeholder 
 */
@Serializable
data class WallWallCommentDonut (
    @SerialName("placeholder") val placeholder: WallWallCommentDonutPlaceholder? = null,
    @SerialName("is_don") val isDon: Boolean? = null,
)
