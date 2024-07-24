package ru.krindra.vkkt.responses.prettyCards

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.prettyCards.*

/**
 * @param ownerId Owner ID of deleted pretty card
 * @param cardId Card ID of deleted pretty card
 * @param error Error reason if error happened
 */
@Serializable
data class PrettyCardsDeleteResponse (
    @SerialName("owner_id") val ownerId: Int,
    @SerialName("card_id") val cardId: String,
    @SerialName("error") val error: String? = null,
)

