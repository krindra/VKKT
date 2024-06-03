package ru.krindra.vknorthtypes.types.prettyCards

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param ownerId Owner ID of deleted pretty card
 * @param cardId Card ID of deleted pretty card
 * @param error Error reason if error happened
 */
@Serializable
data class PrettyCardsDeleteResponse (
    @SerialName("card_id") val cardId: String,
    @SerialName("owner_id") val ownerId: Long,
    @SerialName("error") val error: String? = null,
)

