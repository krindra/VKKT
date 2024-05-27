package ru.krindra.vknorthtypes.types.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param desc Full school title
 * @param id School ID
 * @param name School title
 * @param parent City name
 * @param type 
 */
@Serializable
data class AdsTargSuggestionsSchools (
    @SerialName("desc") val desc: String? = null,
    @SerialName("name") val name: String? = null,
    @SerialName("type") val type: AdsTargSuggestionsSchoolsType? = null,
    @SerialName("id") val id: Long? = null,
    @SerialName("parent") val parent: String? = null,
)
