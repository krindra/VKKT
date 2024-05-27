package ru.krindra.vknorthtypes.types.users

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param platform Type of the platform that used for the last authorization
 * @param time Last visit date (in Unix time)
 */
@Serializable
data class UsersLastSeen (
    @SerialName("time") val time: Int? = null,
    @SerialName("platform") val platform: Int? = null,
)
