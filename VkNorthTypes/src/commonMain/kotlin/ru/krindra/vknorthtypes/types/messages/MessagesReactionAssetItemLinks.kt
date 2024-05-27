package ru.krindra.vknorthtypes.types.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param bigAnimation Big reaction animation json file
 * @param smallAnimation Small reaction animation json file
 * @param static Reaction image file
 */
@Serializable
data class MessagesReactionAssetItemLinks (
    @SerialName("small_animation") val smallAnimation: String,
    @SerialName("static") val static: String,
    @SerialName("big_animation") val bigAnimation: String,
)
