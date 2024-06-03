package ru.krindra.vknorthtypes.types.secure

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param date Transaction date in Unixtime
 * @param id Transaction ID
 * @param uidFrom From ID
 * @param uidTo To ID
 * @param votes Votes number
 */
@Serializable
data class SecureTransaction (
    @SerialName("id") val id: Long? = null,
    @SerialName("date") val date: Int? = null,
    @SerialName("votes") val votes: Int? = null,
    @SerialName("uid_to") val uidTo: Int? = null,
    @SerialName("uid_from") val uidFrom: Int? = null,
)
