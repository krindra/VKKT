package ru.krindra.vkkt.objects.secure

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param userId 
 * @param status 
 */
@Serializable
data class SecureGiveEventStickerItem (
    @SerialName("user_id") val userId: Long? = null,
    @SerialName("status") val status: String? = null,
)
