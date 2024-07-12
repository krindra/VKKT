package ru.krindra.vkkt.responses.account

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.account.*

/**
 * @param token New token
 * @param secret New secret
 */
@Serializable
data class AccountChangePasswordResponse (
    @SerialName("token") val token: String,
    @SerialName("secret") val secret: String? = null,
)

