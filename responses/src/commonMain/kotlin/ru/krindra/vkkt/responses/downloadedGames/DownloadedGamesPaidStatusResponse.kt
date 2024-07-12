package ru.krindra.vkkt.responses.downloadedGames

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
/**
 * @param isPaid Game has been paid
 */
@Serializable
data class DownloadedGamesPaidStatusResponse (
    @SerialName("is_paid") val isPaid: Boolean,
)

