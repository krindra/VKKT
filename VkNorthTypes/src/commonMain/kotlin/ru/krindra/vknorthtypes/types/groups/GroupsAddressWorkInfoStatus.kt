package ru.krindra.vknorthtypes.types.groups

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * Status of information about timetable
 * 
 */
@Serializable
enum class GroupsAddressWorkInfoStatus(val value: String){
    @SerialName("no_information") NO_INFORMATION("no_information"),
    @SerialName("temporarily_closed") TEMPORARILY_CLOSED("temporarily_closed"),
    @SerialName("always_opened") ALWAYS_OPENED("always_opened"),
    @SerialName("timetable") TIMETABLE("timetable"),
    @SerialName("forever_closed") FOREVER_CLOSED("forever_closed"),
}
