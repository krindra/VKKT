package ru.krindra.vknorthtypes.types.polls

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.users.UsersUserFull

/**
 *
 * @param count Votes number
 * @param items 
 */
@Serializable
data class PollsVotersFieldsUsers (
    @SerialName("count") val count: Int? = null,
    @SerialName("items") val items: List<UsersUserFull>? = null,
)
