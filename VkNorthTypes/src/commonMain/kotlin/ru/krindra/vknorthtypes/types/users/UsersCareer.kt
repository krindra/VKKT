package ru.krindra.vknorthtypes.types.users

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param cityId City ID
 * @param cityName City name
 * @param company Company name
 * @param countryId Country ID
 * @param from_ From year
 * @param groupId Community ID
 * @param id Career ID
 * @param position Position
 * @param until Till year
 */
@Serializable
data class UsersCareer (
    @SerialName("id") val id: Long? = null,
    @SerialName("from_") val from_: Int? = null,
    @SerialName("until") val until: Int? = null,
    @SerialName("city_id") val cityId: Long? = null,
    @SerialName("group_id") val groupId: Long? = null,
    @SerialName("company") val company: String? = null,
    @SerialName("position") val position: String? = null,
    @SerialName("city_name") val cityName: String? = null,
    @SerialName("country_id") val countryId: Long? = null,
)
