package ru.krindra.vkkt.objects.users

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
    @SerialName("id") val id: Int? = null,
    @SerialName("from_") val from_: Int? = null,
    @SerialName("until") val until: Int? = null,
    @SerialName("city_id") val cityId: Int? = null,
    @SerialName("group_id") val groupId: Int? = null,
    @SerialName("company") val company: String? = null,
    @SerialName("position") val position: String? = null,
    @SerialName("city_name") val cityName: String? = null,
    @SerialName("country_id") val countryId: Int? = null,
)
