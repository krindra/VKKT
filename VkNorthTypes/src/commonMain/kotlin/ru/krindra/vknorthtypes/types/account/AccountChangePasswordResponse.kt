package ru.krindra.vknorthtypes.types.account

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param token New token
 * @param secret New secret
 */
@Serializable
data class AccountChangePasswordResponse (
    @SerialName("token") val token: String,
    @SerialName("secret") val secret: String? = null,
)

