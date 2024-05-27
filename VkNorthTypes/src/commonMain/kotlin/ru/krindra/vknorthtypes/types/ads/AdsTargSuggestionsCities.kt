package ru.krindra.vknorthtypes.types.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param id Object ID
 * @param name Object name
 * @param parent Parent object
 */
@Serializable
data class AdsTargSuggestionsCities (
    @SerialName("name") val name: String? = null,
    @SerialName("id") val id: Long? = null,
    @SerialName("parent") val parent: String? = null,
)
