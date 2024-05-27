package ru.krindra.vknorthtypes.types.messages

import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param oneTime Should this keyboard disappear on first use
 * @param buttons 
 * @param authorId Community or bot, which set this keyboard
 * @param inline 
 */
@Serializable
data class MessagesKeyboard (
    @SerialName("author_id") val authorId: Long? = null,
    @SerialName("inline") val inline: Boolean? = null,
    @SerialName("one_time") val oneTime: Boolean,
    @SerialName("buttons") val buttons: List<List<JsonElement>>,
)
