package ru.krindra.vknorthtypes.types.oauth

// **********
// THIS FILE IS AUTOGENERATED!!! DO NOT EDIT IT!!!
// **********
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
    @SerialName("error_description") val errorDescription: String,
    @SerialName("redirect_uri") val redirectUri: String? = null,
    @SerialName("error") val error: String,
)