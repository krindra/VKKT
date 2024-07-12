package ru.krindra.vkkt.responses.adsweb

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.adsweb.*

/**
 * @param html 
 */
@Serializable
data class AdswebGetAdUnitCodeResponse (
    @SerialName("html") val html: String,
)

