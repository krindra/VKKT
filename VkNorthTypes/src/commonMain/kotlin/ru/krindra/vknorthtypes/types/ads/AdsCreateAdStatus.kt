package ru.krindra.vknorthtypes.types.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param id Ad ID
 * @param postId Stealth Post ID
 * @param errorCode Error code
 * @param errorDesc Error description
 */
@Serializable
data class AdsCreateAdStatus (
    @SerialName("id") val id: Long,
    @SerialName("post_id") val postId: Long? = null,
    @SerialName("error_code") val errorCode: Int? = null,
    @SerialName("error_desc") val errorDesc: String? = null,
)
