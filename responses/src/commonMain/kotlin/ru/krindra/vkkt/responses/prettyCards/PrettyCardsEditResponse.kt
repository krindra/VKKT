package ru.krindra.vkkt.responses.prettyCards

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.prettyCards.*

/**
 * @param ownerId Owner ID of edited pretty card
 * @param cardId Card ID of edited pretty card
 */
@Serializable
data class PrettyCardsEditResponse (
    @SerialName("owner_id") val ownerId: Int,
    @SerialName("card_id") val cardId: String,
)

