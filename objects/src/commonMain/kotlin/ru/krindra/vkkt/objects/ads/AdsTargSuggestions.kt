package ru.krindra.vkkt.objects.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param id Object ID
 * @param name Object name
 * @param type Object type
 * @param parent Parent
 */
@Serializable
data class AdsTargSuggestions (
    @SerialName("id") val id: Long? = null,
    @SerialName("name") val name: String? = null,
    @SerialName("type") val type: String? = null,
    @SerialName("parent") val parent: String? = null,
)
