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
    @SerialName("id") val id: Long,
    @SerialName("error_code") val errorCode: Int? = null,
    @SerialName("error_desc") val errorDesc: String? = null,
)
