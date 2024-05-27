package ru.krindra.vknorthtypes.types.calls

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param callId Call id
 * @param joinLink Join link
 * @param broadcastVideoId video id for link
 * @param broadcastOvId video id for streaming
 */
@Serializable
data class CallsStartResponse (
    @SerialName("call_id") val callId: String? = null,
    @SerialName("join_link") val joinLink: String,
    @SerialName("broadcast_video_id") val broadcastVideoId: String? = null,
    @SerialName("broadcast_ov_id") val broadcastOvId: String? = null,
)

