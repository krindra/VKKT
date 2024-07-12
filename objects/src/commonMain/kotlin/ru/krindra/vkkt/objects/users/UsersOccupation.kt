package ru.krindra.vkkt.objects.users

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param id ID of school, university, company group
 * @param name Name of occupation
 * @param type Type of occupation
 * @param graduateYear 
 * @param countryId 
 * @param cityId 
 */
@Serializable
data class UsersOccupation (
    @SerialName("id") val id: Long? = null,
    @SerialName("name") val name: String? = null,
    @SerialName("type") val type: String? = null,
    @SerialName("city_id") val cityId: Long? = null,
    @SerialName("country_id") val countryId: Long? = null,
    @SerialName("graduate_year") val graduateYear: Int? = null,
)
