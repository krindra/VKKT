package ru.krindra.vkkt.responses.apps

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.apps.*

/**
 * @param privacyPolicy URL of the app's privacy policy
 * @param terms URL of the app's terms
 */
@Serializable
data class AppsGetMiniAppPoliciesResponse (
    @SerialName("terms") val terms: String? = null,
    @SerialName("privacy_policy") val privacyPolicy: String? = null,
)

