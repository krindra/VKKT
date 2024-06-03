package ru.krindra.vknorthtypes.types.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param helpUrl Help url
 * @param helpLabel Label
 * @param contentHtml Content Html
 * @param helpChat Help chat
 */
@Serializable
data class AdsRules (
    @SerialName("help_chat") val helpChat: Boolean? = null,
    @SerialName("help_label") val helpLabel: String? = null,
    @SerialName("content_html") val contentHtml: String? = null,
    @SerialName("help_url") val helpUrl: AdsRulesHelpUrl? = null,
)
