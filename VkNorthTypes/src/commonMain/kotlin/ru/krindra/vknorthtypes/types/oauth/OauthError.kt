package ru.krindra.vknorthtypes.types.oauth

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param error Error type
 * @param errorDescription Error description
 * @param redirectUri URI for validation
 */
@Serializable
data class OauthError (
    @SerialName("error") val error: String,
    @SerialName("redirect_uri") val redirectUri: String? = null,
    @SerialName("error_description") val errorDescription: String,
)
