package ru.krindra.vkkt.responses.video

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.base.BaseBoolInt
import ru.krindra.vkkt.objects.video.*

/**
 * @param success 
 * @param accessKey Access key for access link
 */
@Serializable
data class VideoEditResponse (
    @SerialName("success") val success: BaseBoolInt,
    @SerialName("access_key") val accessKey: String? = null,
)

