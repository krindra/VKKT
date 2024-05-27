package ru.krindra.vknorthtypes.types.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param reactionId 
 * @param links Liks to reactions assets for each asset type
 */
@Serializable
data class MessagesReactionAssetItem (
    @SerialName("links") val links: MessagesReactionAssetItemLinks,
    @SerialName("reaction_id") val reactionId: Long,
)
