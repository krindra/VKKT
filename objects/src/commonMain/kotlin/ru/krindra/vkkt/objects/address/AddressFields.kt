package ru.krindra.vkkt.objects.address

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class AddressFields(val value: String){
    @SerialName("id") ID("id"),
    @SerialName("title") TITLE("title"),
    @SerialName("address") ADDRESS("address"),
    @SerialName("additional_address") ADDITIONAL_ADDRESS("additional_address"),
    @SerialName("country_id") COUNTRY_ID("country_id"),
    @SerialName("country") COUNTRY("country"),
    @SerialName("city_id") CITY_ID("city_id"),
    @SerialName("city") CITY("city"),
    @SerialName("metro_station_id") METRO_STATION_ID("metro_station_id"),
    @SerialName("metro_station") METRO_STATION("metro_station"),
    @SerialName("latitude") LATITUDE("latitude"),
    @SerialName("longitude") LONGITUDE("longitude"),
    @SerialName("distance") DISTANCE("distance"),
    @SerialName("work_info_status") WORK_INFO_STATUS("work_info_status"),
    @SerialName("timetable") TIMETABLE("timetable"),
    @SerialName("phone") PHONE("phone"),
    @SerialName("time_offset") TIME_OFFSET("time_offset"),
}
