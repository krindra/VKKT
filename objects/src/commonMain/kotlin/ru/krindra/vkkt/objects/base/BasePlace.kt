package ru.krindra.vkkt.objects.base

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param address Place address
 * @param checkins Checkins number
 * @param city City name
 * @param country Country name
 * @param created Date of the place creation in Unixtime
 * @param icon URL of the place's icon
 * @param id Place ID
 * @param latitude Place latitude
 * @param longitude Place longitude
 * @param title Place title
 * @param type Place type
 */
@Serializable
data class BasePlace (
    @SerialName("id") val id: Long? = null,
    @SerialName("city") val city: String? = null,
    @SerialName("icon") val icon: String? = null,
    @SerialName("type") val type: String? = null,
    @SerialName("title") val title: String? = null,
    @SerialName("created") val created: Int? = null,
    @SerialName("checkins") val checkins: Int? = null,
    @SerialName("address") val address: String? = null,
    @SerialName("country") val country: String? = null,
    @SerialName("latitude") val latitude: Double? = null,
    @SerialName("longitude") val longitude: Double? = null,
)
