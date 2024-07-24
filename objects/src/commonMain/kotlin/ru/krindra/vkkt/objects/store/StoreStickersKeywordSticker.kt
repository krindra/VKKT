package ru.krindra.vkkt.objects.store

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param packId Pack id
 * @param stickerId Sticker id
 */
@Serializable
data class StoreStickersKeywordSticker (
    @SerialName("pack_id") val packId: Int,
    @SerialName("sticker_id") val stickerId: Int,
)
