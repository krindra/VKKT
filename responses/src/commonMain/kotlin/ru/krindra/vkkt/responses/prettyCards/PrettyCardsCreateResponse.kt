package ru.krindra.vkkt.responses.prettyCards

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.prettyCards.*

/**
 * @param ownerId Owner ID of created pretty card
 * @param cardId Card ID of created pretty card
 */
@Serializable
data class PrettyCardsCreateResponse (
    @SerialName("owner_id") val ownerId: Int,
    @SerialName("card_id") val cardId: String,
)

