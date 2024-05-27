package ru.krindra.vknorthtypes.types.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param id Client ID
 * @param errorCode Error code
 * @param errorDesc Error description
 */
@Serializable
data class AdsUpdateClientsStatus (
    @SerialName("error_desc") val errorDesc: String? = null,
    @SerialName("error_code") val errorCode: Int? = null,
    @SerialName("id") val id: Long,
)
