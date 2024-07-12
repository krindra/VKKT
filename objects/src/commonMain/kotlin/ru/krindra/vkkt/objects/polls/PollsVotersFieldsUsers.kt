package ru.krindra.vkkt.objects.polls

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.users.UsersUserFull

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
