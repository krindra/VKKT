package ru.krindra.vknorthtypes.types.callback

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
data class CallbackBase (
    @SerialName("group_id") val groupId: Long,
    @SerialName("event_id") val eventId: String,
    @SerialName("type") val type: CallbackType,
    @SerialName("secret") val secret: String? = null,
    @SerialName("v") val v: String,
)
