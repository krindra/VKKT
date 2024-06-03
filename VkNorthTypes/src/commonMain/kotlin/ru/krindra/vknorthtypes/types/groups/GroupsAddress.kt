package ru.krindra.vknorthtypes.types.groups

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.database.DatabaseCityById
import ru.krindra.vknorthtypes.types.database.DatabaseStation
import ru.krindra.vknorthtypes.types.base.BaseCountry

/**
 *
 * @param additionalAddress Additional address to the place (6 floor, left door)
 * @param address String address to the place (Nevsky, 28)
 * @param cityId City id of address
 * @param countryId Country id of address
 * @param city City for address
 * @param metroStation Metro for address
 * @param country Country for address
 * @param distance Distance from the point
 * @param id Address id
 * @param latitude Address latitude
 * @param longitude Address longitude
 * @param metroStationId Metro id of address
 * @param phone Address phone
 * @param timeOffset Time offset int minutes from utc time
 * @param timetable Week timetable for the address
 * @param title Title of the place (Zinger, etc)
 * @param workInfoStatus Status of information about timetable
 * @param placeId 
 */
@Serializable
data class GroupsAddress (
    @SerialName("id") val id: Long,
    @SerialName("phone") val phone: String? = null,
    @SerialName("title") val title: String? = null,
    @SerialName("city_id") val cityId: Long? = null,
    @SerialName("distance") val distance: Int? = null,
    @SerialName("place_id") val placeId: Long? = null,
    @SerialName("address") val address: String? = null,
    @SerialName("latitude") val latitude: Double? = null,
    @SerialName("country_id") val countryId: Long? = null,
    @SerialName("city") val city: DatabaseCityById? = null,
    @SerialName("longitude") val longitude: Double? = null,
    @SerialName("time_offset") val timeOffset: Int? = null,
    @SerialName("country") val country: BaseCountry? = null,
    @SerialName("metro_station_id") val metroStationId: Long? = null,
    @SerialName("metro_station") val metroStation: DatabaseStation? = null,
    @SerialName("timetable") val timetable: GroupsAddressTimetable? = null,
    @SerialName("additional_address") val additionalAddress: String? = null,
    @SerialName("work_info_status") val workInfoStatus: GroupsAddressWorkInfoStatus? = null,
)
