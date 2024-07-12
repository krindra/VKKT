package ru.krindra.vkkt.responses.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.base.BaseBoolInt
import ru.krindra.vkkt.objects.messages.*

/**
 * @param isAllowed 
 */
@Serializable
data class MessagesIsMessagesFromGroupAllowedResponse (
    @SerialName("is_allowed") val isAllowed: BaseBoolInt? = null,
)

