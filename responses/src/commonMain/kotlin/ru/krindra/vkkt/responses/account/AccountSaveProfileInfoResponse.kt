package ru.krindra.vkkt.responses.account

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.base.BaseBoolInt
import ru.krindra.vkkt.objects.account.*

/**
 * @param changed 1 if changes has been processed
 * @param nameRequest 
 */
@Serializable
data class AccountSaveProfileInfoResponse (
    @SerialName("changed") val changed: BaseBoolInt,
    @SerialName("name_request") val nameRequest: AccountNameRequest? = null,
)

