package ru.krindra.vknorthtypes.types.users

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param countryId Country ID
 * @param from_ From year
 * @param id Military ID
 * @param unit Unit name
 * @param unitId Unit ID
 * @param until Till year
 */
@Serializable
data class UsersMilitary (
    @SerialName("unit") val unit: String,
    @SerialName("id") val id: Long? = null,
    @SerialName("unit_id") val unitId: Long,
    @SerialName("from_") val from_: Int? = null,
    @SerialName("until") val until: Int? = null,
    @SerialName("country_id") val countryId: Long,
)
