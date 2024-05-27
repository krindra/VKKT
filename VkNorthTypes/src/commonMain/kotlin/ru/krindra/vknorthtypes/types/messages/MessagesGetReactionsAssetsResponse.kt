package ru.krindra.vknorthtypes.types.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param version Current reactions assets version
 * @param assets Base reactions assets to display by default
 * @param overrideAssets Extended reactions assets for special occasions, user allowed to switch to the base version
 */
@Serializable
data class MessagesGetReactionsAssetsResponse (
    @SerialName("version") val version: Int,
    @SerialName("assets") val assets: List<MessagesReactionAssetItem>,
    @SerialName("override_assets") val overrideAssets: List<MessagesReactionAssetItem>? = null,
)

