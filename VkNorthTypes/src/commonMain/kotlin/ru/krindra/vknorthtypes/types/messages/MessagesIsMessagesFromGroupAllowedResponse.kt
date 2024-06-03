package ru.krindra.vknorthtypes.types.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.base.BaseBoolInt

/**
 * @param isAllowed 
 */
@Serializable
data class MessagesIsMessagesFromGroupAllowedResponse (
    @SerialName("is_allowed") val isAllowed: BaseBoolInt? = null,
)

