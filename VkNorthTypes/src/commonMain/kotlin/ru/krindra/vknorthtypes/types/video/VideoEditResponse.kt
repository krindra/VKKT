package ru.krindra.vknorthtypes.types.video

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.base.BaseBoolInt


/**
 * @param success 
 * @param accessKey Access key for access link
 */
@Serializable
data class VideoEditResponse (
    @SerialName("success") val success: BaseBoolInt,
    @SerialName("access_key") val accessKey: String? = null,
)

