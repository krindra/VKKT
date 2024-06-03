package ru.krindra.vknorthtypes.types.groups

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * Timetable for one day
 * 
 * @param breakCloseTime Close time of the break in minutes
 * @param breakOpenTime Start time of the break in minutes
 * @param closeTime Close time in minutes
 * @param openTime Open time in minutes
 */
@Serializable
data class GroupsAddressTimetableDay (
    @SerialName("open_time") val openTime: Int,
    @SerialName("close_time") val closeTime: Int,
    @SerialName("break_open_time") val breakOpenTime: Int? = null,
    @SerialName("break_close_time") val breakCloseTime: Int? = null,
)
