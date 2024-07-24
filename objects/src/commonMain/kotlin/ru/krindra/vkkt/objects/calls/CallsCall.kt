package ru.krindra.vkkt.objects.calls

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param duration Call duration
 * @param initiatorId Caller initiator
 * @param receiverId Caller receiver
 * @param state 
 * @param time Timestamp for call
 * @param video Was this call initiated as video call
 * @param participants 
 */
@Serializable
data class CallsCall (
    @SerialName("time") val time: Int,
    @SerialName("state") val state: CallsEndState,
    @SerialName("receiver_id") val receiverId: Int,
    @SerialName("video") val video: Boolean? = null,
    @SerialName("initiator_id") val initiatorId: Int,
    @SerialName("duration") val duration: Int? = null,
    @SerialName("participants") val participants: CallsParticipants? = null,
)
