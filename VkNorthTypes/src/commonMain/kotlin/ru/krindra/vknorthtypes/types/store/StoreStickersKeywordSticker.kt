package ru.krindra.vknorthtypes.types.store

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param packId Pack id
 * @param stickerId Sticker id
 */
@Serializable
data class StoreStickersKeywordSticker (
    @SerialName("pack_id") val packId: Long,
    @SerialName("sticker_id") val stickerId: Long,
)
