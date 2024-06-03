package ru.krindra.vknorthtypes.types.groups

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * Timetable for a week
 * 
 * @param fri Timetable for friday
 * @param mon Timetable for monday
 * @param sat Timetable for saturday
 * @param sun Timetable for sunday
 * @param thu Timetable for thursday
 * @param tue Timetable for tuesday
 * @param wed Timetable for wednesday
 */
@Serializable
data class GroupsAddressTimetable (
    @SerialName("fri") val fri: GroupsAddressTimetableDay? = null,
    @SerialName("mon") val mon: GroupsAddressTimetableDay? = null,
    @SerialName("sat") val sat: GroupsAddressTimetableDay? = null,
    @SerialName("sun") val sun: GroupsAddressTimetableDay? = null,
    @SerialName("thu") val thu: GroupsAddressTimetableDay? = null,
    @SerialName("tue") val tue: GroupsAddressTimetableDay? = null,
    @SerialName("wed") val wed: GroupsAddressTimetableDay? = null,
)
