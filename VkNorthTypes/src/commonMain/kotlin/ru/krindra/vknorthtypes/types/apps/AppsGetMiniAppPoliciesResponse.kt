package ru.krindra.vknorthtypes.types.apps

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param privacyPolicy URL of the app's privacy policy
 * @param terms URL of the app's terms
 */
@Serializable
data class AppsGetMiniAppPoliciesResponse (
    @SerialName("privacy_policy") val privacyPolicy: String? = null,
    @SerialName("terms") val terms: String? = null,
)

