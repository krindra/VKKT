package ru.krindra.vknorthtypes.types.prettyCards

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param ownerId Owner ID of edited pretty card
 * @param cardId Card ID of edited pretty card
 */
@Serializable
data class PrettyCardsEditResponse (
    @SerialName("owner_id") val ownerId: Long,
    @SerialName("card_id") val cardId: String,
)

