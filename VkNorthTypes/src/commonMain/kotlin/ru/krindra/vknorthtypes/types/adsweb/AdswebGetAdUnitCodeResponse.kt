package ru.krindra.vknorthtypes.types.adsweb

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param html 
 */
@Serializable
data class AdswebGetAdUnitCodeResponse (
    @SerialName("html") val html: String,
)

