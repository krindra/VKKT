package ru.krindra.vknorthtypes.types.auth

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param success 1 if success
 * @param sid Parameter needed to grant access by code
 */
@Serializable
data class AuthRestoreResponse (
    @SerialName("success") val success: Int? = null,
    @SerialName("sid") val sid: String? = null,
)

