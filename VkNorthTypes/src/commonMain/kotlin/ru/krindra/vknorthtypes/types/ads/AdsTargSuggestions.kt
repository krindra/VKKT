package ru.krindra.vknorthtypes.types.ads

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
    @SerialName("name") val name: String? = null,
    @SerialName("type") val type: String? = null,
    @SerialName("id") val id: Long? = null,
    @SerialName("parent") val parent: String? = null,
)
