package ru.krindra.vknorthtypes.types.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param id Targeting music artist ID
 * @param name Music artist name
 * @param avatar Music artist photo
 */
@Serializable
data class AdsMusician (
    @SerialName("avatar") val avatar: String? = null,
    @SerialName("name") val name: String,
    @SerialName("id") val id: Long,
)
