package ru.krindra.vknorthtypes.types.store

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param words 
 * @param userStickers 
 * @param promotedStickers 
 * @param stickers 
 */
@Serializable
data class StoreStickersKeyword (
    @SerialName("promoted_stickers") val promotedStickers: StoreStickersKeywordStickers? = null,
    @SerialName("stickers") val stickers: List<StoreStickersKeywordSticker>? = null,
    @SerialName("words") val words: List<String>,
    @SerialName("user_stickers") val userStickers: StoreStickersKeywordStickers? = null,
)
