package ru.krindra.vkkt.objects.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.base.BaseBoolInt

/**
 *
 * @param online Information whether user is online
 * @param time Time when user was online in Unixtime
 */
@Serializable
data class MessagesLastActivity (
    @SerialName("time") val time: Int,
    @SerialName("online") val online: BaseBoolInt,
)
