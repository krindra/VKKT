package ru.krindra.vkkt.objects.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param id Campaign ID
 * @param errorCode Error code
 * @param errorDesc Error description
 */
@Serializable
data class AdsCreateCampaignStatus (
    @SerialName("id") val id: Int,
    @SerialName("error_code") val errorCode: Int? = null,
    @SerialName("error_desc") val errorDesc: String? = null,
)
