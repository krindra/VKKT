package ru.krindra.vkkt.objects.messages

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
    @SerialName("one_time") val oneTime: Boolean,
    @SerialName("inline") val inline: Boolean? = null,
    @SerialName("author_id") val authorId: Long? = null,
    @SerialName("buttons") val buttons: List<List<JsonElement>>,
)
