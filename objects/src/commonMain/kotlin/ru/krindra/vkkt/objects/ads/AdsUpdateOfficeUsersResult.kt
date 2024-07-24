package ru.krindra.vkkt.objects.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.base.BaseError

/**
 *
 * @param userId 
 * @param isSuccess 
 * @param error 
 */
@Serializable
data class AdsUpdateOfficeUsersResult (
    @SerialName("user_id") val userId: Int,
    @SerialName("is_success") val isSuccess: Boolean,
    @SerialName("error") val error: BaseError? = null,
)
