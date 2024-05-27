package ru.krindra.vknorthtypes.types.groups

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param code Confirmation code
 */
@Serializable
data class GroupsGetCallbackConfirmationCodeResponse (
    @SerialName("code") val code: String,
)

