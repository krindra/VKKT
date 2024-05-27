package ru.krindra.vknorthtypes.types.base

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param userId User ID
 */
@Serializable
data class BaseUserId (
    @SerialName("user_id") val userId: Long? = null,
)
