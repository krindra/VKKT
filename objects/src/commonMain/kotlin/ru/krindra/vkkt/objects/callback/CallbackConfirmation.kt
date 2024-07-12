package ru.krindra.vkkt.objects.callback

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param type 
 * @param groupId 
 * @param eventId Unique event id. If it passed twice or more - you should ignore it.
 * @param v API object version
 * @param secret 
 */
@Serializable
data class CallbackConfirmation (
    @SerialName("v") val v: String,
    @SerialName("group_id") val groupId: Long,
    @SerialName("event_id") val eventId: String,
    @SerialName("secret") val secret: String? = null,
    @SerialName("type") val type: CallbackType? = null,
)
