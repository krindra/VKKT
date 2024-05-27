package ru.krindra.vknorthtypes.types.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.base.BaseError

/**
 *
 * @param userId 
 * @param isSuccess 
 * @param error 
 */
@Serializable
data class AdsUpdateOfficeUsersResult (
    @SerialName("error") val error: BaseError? = null,
    @SerialName("user_id") val userId: Long,
    @SerialName("is_success") val isSuccess: Boolean,
)
