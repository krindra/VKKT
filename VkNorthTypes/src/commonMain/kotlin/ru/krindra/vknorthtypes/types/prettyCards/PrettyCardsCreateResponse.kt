package ru.krindra.vknorthtypes.types.prettyCards

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param ownerId Owner ID of created pretty card
 * @param cardId Card ID of created pretty card
 */
@Serializable
data class PrettyCardsCreateResponse (
    @SerialName("card_id") val cardId: String,
    @SerialName("owner_id") val ownerId: Long,
)

