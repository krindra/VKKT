package ru.krindra.vkkt.responses.groups

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.groups.*

/**
 * @param code Confirmation code
 */
@Serializable
data class GroupsGetCallbackConfirmationCodeResponse (
    @SerialName("code") val code: String,
)

