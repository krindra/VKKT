package ru.krindra.vknorthtypes.types.account

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.base.BaseBoolInt


/**
 * @param changed 1 if changes has been processed
 * @param nameRequest 
 */
@Serializable
data class AccountSaveProfileInfoResponse (
    @SerialName("changed") val changed: BaseBoolInt,
    @SerialName("name_request") val nameRequest: AccountNameRequest? = null,
)

