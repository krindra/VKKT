package ru.krindra.vkkt.objects.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param id Ad ID
 * @param errorCode Error code
 * @param errorDesc Error description
 */
@Serializable
data class AdsUpdateAdsStatus (
    @SerialName("id") val id: Long,
    @SerialName("error_code") val errorCode: Int? = null,
    @SerialName("error_desc") val errorDesc: String? = null,
)
