package ru.krindra.vkkt.objects.utils

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * Link status
 * 
 */
@Serializable
enum class UtilsLinkCheckedStatus(val value: String){
    @SerialName("not_banned") NOT_BANNED("not_banned"),
    @SerialName("banned") BANNED("banned"),
    @SerialName("processing") PROCESSING("processing"),
}
